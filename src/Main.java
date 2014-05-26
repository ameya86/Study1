import common.Logger;

import controller.Controller;
import controller.WelcomeController;

public class Main {
    public static void main(String[] args) {
        Controller controller;
        String action;

        controller = WelcomeController.getInstance();
        action = "init";

        while(controller != null) {
            if (!controller.action(action)) {
                break;
            }

            action = controller.nextAction();
            controller = controller.nextController();
        }

        Logger.info("\nClosed.");
    }
}
