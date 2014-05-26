package controller;

public class ItemController extends Controller {
    protected ItemController() {}

    @Override
    public boolean action(String action) {
        return false;
    }

    public static Controller getInstance() {
    	ItemController.onlyInstance = new ItemController();
        return ItemController.onlyInstance;
    }
}
