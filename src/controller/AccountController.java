package controller;

import account.Account;
import account.AccountDTO;
import account.AccountManager;

import common.Form;
import common.Logger;

public class AccountController extends Controller{
    protected AccountController() {}

    @Override
    public boolean action(String action) {
        if ("init" == action) {
            initAction();
            return true;
        }
        if ("register" == action) {
            registerAction();
            return true;
        }
        return false;
    }

    public boolean initAction() {
        this.nextController = AccountController.getInstance();
        this.nextAction = "register";
        return true;
    }

    public boolean registerAction() {
        String firstName;
        String lastName;
        Account account;

        Logger.info("Input your firstname. > ", false);
        firstName = Form.input_require();

        Logger.info("Input your lastname.  > ", false);
        lastName = Form.input_require();

        account = AccountManager.create(firstName, lastName);
        AccountDTO dto = account.fields();
        Logger.info("Your ID is \"" + dto.id + "\".");
        Logger.info("Welcome " + dto.fullname + ".");

        this.nextController = ItemController.getInstance();
        this.nextAction = "init";

        return true;
    }

    public static Controller getInstance() {
    	AccountController.onlyInstance = new AccountController();
        return AccountController.onlyInstance;
    }
}
