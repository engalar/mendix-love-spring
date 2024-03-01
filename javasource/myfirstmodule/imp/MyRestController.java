package myfirstmodule.imp;

import org.springframework.beans.factory.annotation.Autowired;

import com.mendix.core.Core;
import com.mendix.logging.ILogNode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyRestController {

    private static final ILogNode logger = Core.getLogger("MyRestService");

    @Autowired
    private MySpringService springService;

    @GetMapping("/hello")
    public String helloWorld() {
        logger.info("Received REST request: GET /api/hello");
        return springService.doSomething();
    }
}