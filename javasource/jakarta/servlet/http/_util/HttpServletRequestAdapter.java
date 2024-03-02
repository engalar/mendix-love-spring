package jakarta.servlet.http._util;

import javax.servlet.AsyncContext;
import javax.servlet.DispatcherType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpUpgradeHandler;
import javax.servlet.http.Part;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.Principal;
import java.util.*;

public class HttpServletRequestAdapter implements XHttpServletRequest {
  private HttpServletRequest xRequest;

  public HttpServletRequestAdapter(HttpServletRequest xrRequest) {
    this.xRequest = xrRequest;
  }

  @Override
  public boolean authenticate(HttpServletResponse response) throws IOException, ServletException {
    return xRequest.authenticate(response);
  }

  @Override
  public String changeSessionId() {
    return xRequest.changeSessionId();
  }

  @Override
  public String getAuthType() {
    return xRequest.getAuthType();
  }

  @Override
  public String getContextPath() {
    return xRequest.getContextPath();
  }

  @Override
  public Cookie[] getCookies() {
    return xRequest.getCookies();
  }

  @Override
  public long getDateHeader(String name) {
    return xRequest.getDateHeader(name);
  }

  @Override
  public String getHeader(String name) {
    return xRequest.getHeader(name);
  }

  @Override
  public Enumeration<String> getHeaderNames() {
    return xRequest.getHeaderNames();
  }

  @Override
  public Enumeration<String> getHeaders(String name) {
    return xRequest.getHeaders(name);
  }

  @Override
  public int getIntHeader(String name) {
    return xRequest.getIntHeader(name);
  }

  @Override
  public String getMethod() {
    return xRequest.getMethod();
  }

  @Override
  public Part getPart(String name) throws IOException, ServletException {
    return xRequest.getPart(name);
  }

  @Override
  public Collection<Part> getParts() throws IOException, ServletException {
    return xRequest.getParts();
  }

  @Override
  public String getPathInfo() {
    return xRequest.getPathInfo();
  }

  @Override
  public String getPathTranslated() {
    return xRequest.getPathTranslated();
  }

  @Override
  public String getQueryString() {
    return xRequest.getQueryString();
  }

  @Override
  public String getRemoteUser() {
    return xRequest.getRemoteUser();
  }

  @Override
  public String getRequestURI() {
    return xRequest.getRequestURI();
  }

  @Override
  public StringBuffer getRequestURL() {
    return xRequest.getRequestURL();
  }

  @Override
  public String getRequestedSessionId() {
    return xRequest.getRequestedSessionId();
  }

  @Override
  public String getServletPath() {
    return xRequest.getServletPath();
  }

  @Override
  public HttpSession getSession() {
    return xRequest.getSession();
  }

  @Override
  public HttpSession getSession(boolean create) {
    return xRequest.getSession(create);
  }

  @Override
  public Principal getUserPrincipal() {
    return xRequest.getUserPrincipal();
  }

  @Override
  public boolean isRequestedSessionIdFromCookie() {
    return xRequest.isRequestedSessionIdFromCookie();
  }

  @Override
  public boolean isRequestedSessionIdFromURL() {
    return xRequest.isRequestedSessionIdFromURL();
  }

  @Override
  public boolean isRequestedSessionIdValid() {
    return xRequest.isRequestedSessionIdValid();
  }

  @Override
  public boolean isUserInRole(String role) {
    return xRequest.isUserInRole(role);
  }

  @Override
  public void login(String username, String password) throws ServletException {
    xRequest.login(username, password);
  }

  @Override
  public void logout() throws ServletException {
    xRequest.logout();
  }

  @Override
  public <T extends HttpUpgradeHandler> T upgrade(Class<T> handlerClass) throws IOException, ServletException {
    return xRequest.upgrade(handlerClass);
  }

  // Additional methods from ServletRequest

  @Override
  public AsyncContext getAsyncContext() {
    return xRequest.getAsyncContext();
  }

  @Override
  public Object getAttribute(String name) {
    return xRequest.getAttribute(name);
  }

  @Override
  public Enumeration<String> getAttributeNames() {
    return xRequest.getAttributeNames();
  }

  @Override
  public String getCharacterEncoding() {
    return xRequest.getCharacterEncoding();
  }

  @Override
  public int getContentLength() {
    return xRequest.getContentLength();
  }

  @Override
  public long getContentLengthLong() {
    return xRequest.getContentLengthLong();
  }

  @Override
  public String getContentType() {
    return xRequest.getContentType();
  }

  @Override
  public DispatcherType getDispatcherType() {
    return xRequest.getDispatcherType();
  }

  @Override
  public ServletInputStream getInputStream() throws IOException {
    return xRequest.getInputStream();
  }

  @Override
  public String getLocalAddr() {
    return xRequest.getLocalAddr();
  }

  @Override
  public String getLocalName() {
    return xRequest.getLocalName();
  }

  @Override
  public int getLocalPort() {
    return xRequest.getLocalPort();
  }

  @Override
  public Locale getLocale() {
    return xRequest.getLocale();
  }

  @Override
  public Enumeration<Locale> getLocales() {
    return xRequest.getLocales();
  }

  @Override
  public String getParameter(String name) {
    return xRequest.getParameter(name);
  }

  @Override
  public Map<String, String[]> getParameterMap() {
    return xRequest.getParameterMap();
  }

  @Override
  public Enumeration<String> getParameterNames() {
    return xRequest.getParameterNames();
  }

  @Override
  public String[] getParameterValues(String name) {
    return xRequest.getParameterValues(name);
  }

  @Override
  public String getProtocol() {
    return xRequest.getProtocol();
  }

  @Override
  public BufferedReader getReader() throws IOException {
    return xRequest.getReader();
  }

  @Override
  public String getRealPath(String path) {
    return xRequest.getRealPath(path);
  }

  @Override
  public String getRemoteAddr() {
    return xRequest.getRemoteAddr();
  }

  @Override
  public String getRemoteHost() {
    return xRequest.getRemoteHost();
  }

  @Override
  public int getRemotePort() {
    return xRequest.getRemotePort();
  }

  @Override
  public RequestDispatcher getRequestDispatcher(String path) {
    return xRequest.getRequestDispatcher(path);
  }

  @Override
  public String getScheme() {
    return xRequest.getScheme();
  }

  @Override
  public String getServerName() {
    return xRequest.getServerName();
  }

  @Override
  public int getServerPort() {
    return xRequest.getServerPort();
  }

  @Override
  public ServletContext getServletContext() {
    return xRequest.getServletContext();
  }

  @Override
  public boolean isAsyncStarted() {
    return xRequest.isAsyncStarted();
  }

  @Override
  public boolean isAsyncSupported() {
    return xRequest.isAsyncSupported();
  }

  @Override
  public boolean isSecure() {
    return xRequest.isSecure();
  }

  @Override
  public void removeAttribute(String name) {
    xRequest.removeAttribute(name);
  }

  @Override
  public void setAttribute(String name, Object o) {
    xRequest.setAttribute(name, o);
  }

  @Override
  public void setCharacterEncoding(String env) throws UnsupportedEncodingException {
    xRequest.setCharacterEncoding(env);
  }

  @Override
  public AsyncContext startAsync() throws IllegalStateException {
    return xRequest.startAsync();
  }

  @Override
  public AsyncContext startAsync(ServletRequest servletRequest, ServletResponse servletResponse)
      throws IllegalStateException {
    return xRequest.startAsync(servletRequest, servletResponse);
  }

  @Override
  public boolean isRequestedSessionIdFromUrl() {
    return xRequest.isRequestedSessionIdFromUrl();
  }
}
