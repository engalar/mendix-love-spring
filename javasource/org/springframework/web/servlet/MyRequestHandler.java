package org.springframework.web.servlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mendix.externalinterface.connector.RequestHandler;
import com.mendix.m2ee.api.IMxRuntimeRequest;
import com.mendix.m2ee.api.IMxRuntimeResponse;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http._util.HttpServletRequestAdapter;
import jakarta.servlet.http._util.HttpServletResponseAdapter;

@Service
public class MyRequestHandler extends RequestHandler {
  @Autowired
  FrameworkServlet servletBean;

  @Override
  protected void processRequest(IMxRuntimeRequest arg0, IMxRuntimeResponse arg1, String arg2) throws Exception {
    HttpServletRequest request = new HttpServletRequestAdapter(arg0.getHttpServletRequest());
    HttpServletResponse response = new HttpServletResponseAdapter(arg1.getHttpServletResponse());
    this.servletBean.doService(request, response);
  }
}