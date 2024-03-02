package jakarta.servlet.http._util;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Locale;

public class HttpServletResponseAdapter implements XHttpServletResponse {
  private HttpServletResponse xresponse;

  public HttpServletResponseAdapter(HttpServletResponse xresponse) {
    this.xresponse = xresponse;
  }

  @Override
  public void addCookie(Cookie cookie) {
    xresponse.addCookie(cookie);
  }

  @Override
  public void addDateHeader(String name, long date) {
    xresponse.addDateHeader(name, date);
  }

  @Override
  public void addHeader(String name, String value) {
    xresponse.addHeader(name, value);
  }

  @Override
  public void addIntHeader(String name, int value) {
    xresponse.addIntHeader(name, value);
  }

  @Override
  public boolean containsHeader(String name) {
    return xresponse.containsHeader(name);
  }

  @Override
  public String encodeRedirectURL(String url) {
    return xresponse.encodeRedirectURL(url);
  }

  @Override
  public String encodeRedirectUrl(String url) {
    return xresponse.encodeRedirectUrl(url);
  }

  @Override
  public String encodeURL(String url) {
    return xresponse.encodeURL(url);
  }

  @Override
  public String encodeUrl(String url) {
    return xresponse.encodeUrl(url);
  }

  @Override
  public String getHeader(String name) {
    return xresponse.getHeader(name);
  }

  @Override
  public Collection<String> getHeaderNames() {
    return xresponse.getHeaderNames();
  }

  @Override
  public Collection<String> getHeaders(String name) {
    return xresponse.getHeaders(name);
  }

  @Override
  public int getStatus() {
    return xresponse.getStatus();
  }

  @Override
  public void sendError(int sc) throws IOException {
    xresponse.sendError(sc);
  }

  @Override
  public void sendError(int sc, String msg) throws IOException {
    xresponse.sendError(sc, msg);
  }

  @Override
  public void sendRedirect(String location) throws IOException {
    xresponse.sendRedirect(location);
  }

  @Override
  public void setDateHeader(String name, long date) {
    xresponse.setDateHeader(name, date);
  }

  @Override
  public void setHeader(String name, String value) {
    xresponse.setHeader(name, value);
  }

  @Override
  public void setIntHeader(String name, int value) {
    xresponse.setIntHeader(name, value);
  }

  @Override
  public void setStatus(int sc) {
    xresponse.setStatus(sc);
  }

  @Override
  public void setStatus(int sc, String sm) {
    xresponse.setStatus(sc, sm);
  }

  @Override
  public void flushBuffer() throws IOException {
    xresponse.flushBuffer();
  }

  @Override
  public int getBufferSize() {
    return xresponse.getBufferSize();
  }

  @Override
  public String getCharacterEncoding() {
    return xresponse.getCharacterEncoding();
  }

  @Override
  public String getContentType() {
    return xresponse.getContentType();
  }

  @Override
  public Locale getLocale() {
    return xresponse.getLocale();
  }

  @Override
  public ServletOutputStream getOutputStream() throws IOException {
    return xresponse.getOutputStream();
  }

  @Override
  public PrintWriter getWriter() throws IOException {
    return xresponse.getWriter();
  }

  @Override
  public boolean isCommitted() {
    return xresponse.isCommitted();
  }

  @Override
  public void reset() {
    xresponse.reset();
  }

  @Override
  public void resetBuffer() {
    xresponse.resetBuffer();
  }

  @Override
  public void setBufferSize(int size) {
    xresponse.setBufferSize(size);
  }

  @Override
  public void setCharacterEncoding(String charset) {
    xresponse.setCharacterEncoding(charset);
  }

  @Override
  public void setContentLength(int len) {
    xresponse.setContentLength(len);
  }

  @Override
  public void setContentLengthLong(long len) {
    xresponse.setContentLengthLong(len);
  }

  @Override
  public void setContentType(String type) {
    xresponse.setContentType(type);
  }

  @Override
  public void setLocale(Locale loc) {
    xresponse.setLocale(loc);
  }
}
