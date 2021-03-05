import java.util.ArrayList;

/**
 * DisplayManager
 */
public class DisplayManager {
    private ArrayList<DisplayDriver> arrd = new ArrayList<DisplayDriver>();
    private ArrayList<DisplayCustomer> arrc = new ArrayList<DisplayCustomer>();

    public static DisplayManager instance;

    private DisplayManager() {

    }

    public static DisplayManager getInstanceOfDisplayManager() {
        if (instance == null)
            instance = new DisplayManager();
        return instance;
    }

    public DisplayCustomer getCustomerDisplayObjectFromCustomerObject(Customer obj) {
        for (int i = 0; i < arrc.size(); i++) {
            if (arrc.get(i).getCustomerObject().getEmail().equals(obj.getEmail()))
                return arrc.get(i);
        }
        DisplayCustomer dcobj = new DisplayCustomer(obj);
        arrc.add(dcobj);
        return (dcobj);
    }

    public DisplayDriver getDriverDisplayObject(Driver obj) {
        for (int i = 0; i < arrd.size(); i++) {

            if (arrd.get(i).getDriverObject().getEmail().equals(obj.getEmail())) {
                return arrd.get(i);
            }
        }

        DisplayDriver dobj = new DisplayDriver(obj);
        // System.out.print("vgvhjbjng");
        this.arrd.add(dobj);
        return (dobj);
    }

}