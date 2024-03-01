package myfirstmodule.imp;

import org.springframework.stereotype.Service;

@Service
public class MySpringService {

  public String doSomething() {
    // 在这里编写你的业务逻辑
    return "Hello from Spring!";
  }
}