package myfirstmodule.imp;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import com.mendix.core.Core;
import com.mendix.logging.ILogNode;

@Aspect
@Component
public class AopAdvice {

    private static final ILogNode logger = Core.getLogger("AopAdvice");

    @Pointcut("execution(* com.mendix.core.actionmanagement.MicroflowCallBuilder.execute(..))")
    public void beforeExecute() {
        logger.info("Before executing ActionCallBuilder.execute()");
    }

    @Pointcut("* helloWorld()")
    public void beforeAdvice() {
        logger.info("helloWorld()");
    }

    @Before("execution(* com.mendix.core.actionmanagement.ActionCallBuilder.execute(..))")
    public void beforeExecute2() {
        logger.info("Before executing ActionCallBuilder.execute()");
    }
}
