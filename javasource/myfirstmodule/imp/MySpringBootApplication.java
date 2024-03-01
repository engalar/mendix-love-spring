package myfirstmodule.imp;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@ServletComponentScan
@EnableAspectJAutoProxy
public class MySpringBootApplication {
  public static ConfigurableApplicationContext ctx;

  public static void start() {
    ctx = SpringApplication.run(MySpringBootApplication.class);
  }

  public static void stop() {
    ctx.close();
  }
}
// END EXTRA CODE