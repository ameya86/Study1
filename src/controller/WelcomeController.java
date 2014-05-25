package controller;

import common.Logger;

public class WelcomeController extends Controller {
    public WelcomeController() {
        super();
    }

    public boolean action(String action) {
        switch (action) {
        case "init":
            this.initAction();
            return false; // End
        }
        return true;
    }

    private void initAction() {
        Logger.info("Greeting.");
    }
}
