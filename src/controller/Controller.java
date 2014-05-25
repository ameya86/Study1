package controller;


public abstract class Controller {
    protected Controller nextController;
    protected String nextAction;

    public Controller() {
        this.nextAction = "init";
        this.nextController = this;
    }

    public abstract boolean action(String action);

    public Controller nextController() {
        return this.nextController;
    }

    public String nextAction() {
        return this.nextAction;
    }
}
