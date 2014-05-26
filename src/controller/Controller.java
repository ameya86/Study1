package controller;


public abstract class Controller {
    protected static Controller onlyInstance = null;
    protected Controller nextController = null;
    protected String nextAction = null;

    protected Controller() {}

    public abstract boolean action(String action);

    public static Controller getInstance() {
        return null;
    }

    public Controller nextController() {
        return this.nextController;
    }

    public String nextAction() {
        return this.nextAction;
    }
}
