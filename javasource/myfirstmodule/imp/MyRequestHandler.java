package myfirstmodule.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.FrameworkServlet;

import com.mendix.externalinterface.connector.RequestHandler;
import com.mendix.m2ee.api.IMxRuntimeRequest;
import com.mendix.m2ee.api.IMxRuntimeResponse;


@Service
public class MyRequestHandler extends RequestHandler {
  @Autowired
  FrameworkServlet servletBean;

  @Override
  protected void processRequest(IMxRuntimeRequest request, IMxRuntimeResponse response, String arg2) throws Exception {
  //  ((javax.servlet.http.HttpServlet)this.servletBean).service(request.getHttpServletRequest(), response.getHttpServletResponse());
  }
}