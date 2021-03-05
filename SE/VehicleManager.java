import java.io.*;
import java.util.*;

public class VehicleManager {

    public ArrayList<Rental> rtl = new ArrayList<>();
    public ArrayList<Car> car = new ArrayList<>();

    public static VehicleManager instance;

    private VehicleManager() {
        isCalledOnce();

    }

    public static VehicleManager getInstanceOfVehicleManager() {
        if (instance == null) {
            instance = new VehicleManager();
        }
        return instance;
    }

    public void isCalledOnce() {
        try {
            this.rtl.clear();
            this.car.clear();
            FileReader fa = new FileReader("database/Car.txt");
            BufferedReader br = new BufferedReader(fa);
            String temp = "";
            while (temp != null) {
                temp = br.readLine();
                if (temp != null) {
                    String[] strarr = temp.split(",");
                    Car cr = new Car(strarr[0], strarr[1], strarr[2], strarr[4], strarr[6]);
                    cr.setCarID(Integer.parseInt(strarr[7]));
                    // bid.setBookingID(Integer.parseInt(strarr[4]));
                    this.car.add(cr);
                }

            }
            br.close();
            String temps = "";
            FileReader da = new FileReader("database/rental.txt");
            BufferedReader dbr = new BufferedReader(da);
            while (temps != null) {
                temps = dbr.readLine();
                if (temps != null) {
                    String[] stringarray = temps.split(",");
                    Rental dv = new Rental(stringarray[0], stringarray[1], stringarray[2], stringarray[3],
                            Integer.parseInt(stringarray[4]), stringarray[5], stringarray[6], stringarray[7],
                            stringarray[8], stringarray[9], Integer.parseInt(stringarray[10]));

                    rtl.add(dv);
                }
            }
        }

        catch (IOException e) {
            // TODO: handle exception
        }
    }

    public void writeInCarFile(Car obj) {
        try {
            FileWriter fw = new FileWriter("database/car.txt", true);
            BufferedWriter bf = new BufferedWriter(fw);
            bf.write(obj.getName() + "," + obj.getModel() + "," + obj.getNumber() + "," + obj.getLicenceNumber() + ","
                    + obj.getOwner() + "," + obj.getOwnerPhoneNumber() + "," + obj.getLocation() + "," + obj.getCarID()
                    + "\n");
            bf.close();

        } catch (IOException e) {
            // TODO: handle exception
            System.out.println("Exception");
        }

    }

    public void writeInRentalFile(Rental obj) {
        try {
            FileWriter fw = new FileWriter("database/rental.txt", true);
            BufferedWriter bf = new BufferedWriter(fw);
            bf.write(obj.getRenterName() + "," + obj.getVehicleNumber() + "," + obj.getStartDate() + ","
                    + obj.getEndDate() + "," + obj.getDuration() + "," + obj.getCost() + "," + obj.getLocation() + ","
                    + obj.getDriverName() + "," + obj.getDriverPhoneNumber() + "," + obj.getRenterPhoneNumber() + ","
                    + obj.getRenterId() + "\n");
            bf.close();

        } catch (IOException e) {
            // TODO: handle exception
        }

    }

    public void deleteFromCarFile(int id) {
        try {
            HashSet<String> hs = new HashSet<String>();
            BufferedReader br = new BufferedReader(new FileReader("database/car.txt"));
            String temp = br.readLine();
            while (temp != null) {
                String[] strarr = temp.split(",");
                if (Integer.parseInt(strarr[7]) != id)
                    hs.add(temp);
                temp = br.readLine();
            }
            br.close();
            PrintWriter pw = new PrintWriter("database/car.txt");
            for (String s : hs) {
                pw.println(s);
            }
            pw.close();
        } catch (IOException e) {
            // TODO: handle exception
        }

    }

    public boolean addVehicle(Car obj) {
        writeInCarFile(obj);
        car.add(obj);
        return true;
    }

    public boolean addRent(Rental obj) {
        rtl.add(obj);
        writeInRentalFile(obj);
        return true;
    }

    public boolean removeVehicle(int id) {
        for (int i = 0; i < car.size(); i++) {
            if (car.get(i).getCarID() == id) {
                car.remove(car.get(i));
                deleteFromCarFile(id);
                return true;
            }
        }
        return false;
    }

    public Car getObjectWithID(int id) {
        for (int i = 0; i < car.size(); i++) {
            if (car.get(i).getCarID() == id) {
                return car.get(i);

            }
        }
        return (null);
    }

    public List<Car> func() {
        List<Car> ls = null;
        ls = Collections.unmodifiableList(car);

        return ls;
    }

    public static void main(String[] args) {
        // VehicleManager v = getInstanceOfVehicleManager();
        // v.addVehicle(new Car("DZire", "Wb-456-77", "Kwerccm", "Aman", "College
        // More"));
        // v.removeVehicle(2);
        // assert (v.func().size() == 2) : "Incorret";
        // assert (v.func().get(1).getName().equals("Audi R8")) : "Incorrect";
    }

}
