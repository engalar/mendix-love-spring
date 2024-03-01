package myfirstmodule.imp;

import org.springframework.stereotype.Service;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import com.mendix.core.Core;
import com.mendix.logging.ILogNode;

@Aspect
@Service
public class AopAdvice {

    private static final ILogNode logger = Core.getLogger("AopAdvice");

    @Before("execution(public * doSomething())")
    public void beforeExecute2() {
        logger.info("Before executing ActionCallBuilder.execute()");
    }
}
