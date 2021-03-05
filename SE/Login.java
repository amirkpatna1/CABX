import java.io.IOException;
import java.util.*;

public class Login {

    private int userID;
    private String password;

    Login(int userID, String pass) {
        this.userID = userID;
        this.password = pass;
    }

    public static Customer loginCustomer(String userEmailId, String pass) {
        AccountManager obj = AccountManager.getInstance();
        obj.isCalledOnce();
        Customer cobj = obj.displayAccount(userEmailId);
        try {
            if (cobj.getPassword().equals(pass))
                return (cobj);
        } catch (NullPointerException e) {
        }
        return cobj;
    }

    public static Driver loginDriver(String userId, String pass) {
        AccountManager obj = AccountManager.getInstance();
        obj.isCalledOnce();
        Driver dobj = obj.displayAccount(userId, 'd');

        try {
            if (dobj.getPassword().equals(pass))
                return (dobj);
        } catch (NullPointerException e) {

        }
        return dobj;
    }

}
