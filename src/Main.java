import common.Logger;

import controller.Controller;
import controller.WelcomeController;

public class Main {
    public static void main(String[] args) {
        Controller controller;
        String action;

        controller = new WelcomeController();
        action = controller.nextAction();

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
