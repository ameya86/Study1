package controller;

import common.Logger;

public class WelcomeController extends Controller {
    protected WelcomeController() {}

    @Override
    public boolean action(String action) {
        if ("init" == action) {
            this.initAction();
            return true;
        }
        return false;
    }

    private void initAction() {
        Logger.info("Greeting.\n");

        this.nextController = AccountController.getInstance();
        this.nextAction = "init";
    }

    public static Controller getInstance() {
    	WelcomeController.onlyInstance = new WelcomeController();
        return WelcomeController.onlyInstance;
    }
}
