package myfirstmodule.imp;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@ServletComponentScan
public class MySpringBootApplication {
  @Bean
  public MySpringService mySpringService() {
    return new MySpringService();
  }
}
// END EXTRA CODE