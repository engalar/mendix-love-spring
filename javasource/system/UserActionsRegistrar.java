package system;

import com.mendix.core.actionmanagement.IActionRegistrator;

public class UserActionsRegistrar
{
  public void registerActions(IActionRegistrator registrator)
  {
    registrator.registerUserAction(myfirstmodule.actions.Java_action.class);
    registrator.registerUserAction(myfirstmodule.actions.Java_action_2.class);
    registrator.registerUserAction(system.actions.VerifyPassword.class);
  }
}
