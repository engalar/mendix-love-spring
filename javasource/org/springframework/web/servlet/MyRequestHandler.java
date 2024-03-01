package org.springframework.web.servlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
// import org.springframework.web.servlet.DispatcherServlet;
// import org.springframework.web.servlet.HttpServletBean;

import com.mendix.externalinterface.connector.RequestHandler;
import com.mendix.m2ee.api.IMxRuntimeRequest;
import com.mendix.m2ee.api.IMxRuntimeResponse;

// import jakarta.servlet.http.HttpServletRequest;
// import jakarta.servlet.http.HttpServletResponse;

@Service
public class MyRequestHandler extends RequestHandler {
  @Autowired
  DispatcherServlet servletBean;

  @Override
  protected void processRequest(IMxRuntimeRequest arg0, IMxRuntimeResponse arg1, String arg2) throws Exception {
    // this.servletBean.doDispatch(arg0.getHttpServletRequest(), arg1.getHttpServletResponse());
  }
}