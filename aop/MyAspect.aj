package myfirstmodule.imp;

import com.mendix.core.Core;
import com.mendix.logging.ILogNode;
import com.mendix.core.actionmanagement.MicroflowCallBuilder;

public aspect MyAspect {
    private static final ILogNode logger = Core.getLogger("MyAspect");
    pointcut executePointcut() : execution(* MicroflowCallBuilder.execute(*));

    before() : executePointcut() {
        logger.info("Before executing MicroflowCallBuilder.execute()");
    }
}
