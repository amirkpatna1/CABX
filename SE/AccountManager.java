import java.io.*;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class AccountManager {

    public ArrayList<Customer> c = new ArrayList<Customer>();
    public ArrayList<Driver> d = new ArrayList<Driver>();

    // public static int flag = 0;

    public static AccountManager instance;

    private AccountManager() {
        isCalledOnce();
    }

    public boolean isCalledOnce() {
        try {
            this.c.clear();
            this.d.clear();
            FileReader fa = new FileReader("database/cust.txt");
            BufferedReader br = new BufferedReader(fa);
            String temp = "";
            while (temp != null) {
                temp = br.readLine();
                if (temp != null) {
                    String[] strarr = temp.split(",");
                    Customer cust = new Customer(strarr[0], strarr[1], strarr[2], strarr[3], strarr[4], strarr[5]);
                    cust.setCustID(Integer.parseInt(strarr[6]));
                    this.c.add(cust);
                }

            }
            br.close();
            String temps = "";
            FileReader da = new FileReader("database/driv.txt");
            BufferedReader dbr = new BufferedReader(da);
            while (temps != null) {
                temps = dbr.readLine();
                if (temps != null) {
                    String[] stringarray = temps.split(",");
                    Driver dv = new Driver(stringarray[0], stringarray[1], stringarray[2], stringarray[3],
                            stringarray[4], stringarray[5], stringarray[6], stringarray[7]);
                    dv.setDriverID(Integer.parseInt(stringarray[8]));
                    d.add(dv);
                }
            }
            return true;

        } catch (IOException e) {
            // TODO: handle exception
            return false;
        }

    }

    public boolean writeInCustFile(Customer obj) {
        try {
            FileWriter fw = new FileWriter("database/cust.txt", true);
            BufferedWriter bf = new BufferedWriter(fw);
            bf.write(obj.getName() + "," + obj.getEmail() + "," + obj.getPassword() + "," + obj.getAge() + ","
                    + obj.getPhoneNumber() + "," + obj.getLocation() + "," + obj.getCustomID() + "\n");
            bf.close();
            return true;

        } catch (IOException e) {
            // TODO: handle exception
            return false;
        }

    }

    public boolean writeInDrivFile(Driver obj) {
        try {
            FileWriter fw = new FileWriter("database/driv.txt", true);
            BufferedWriter bf = new BufferedWriter(fw);
            bf.flush();
            bf.write(obj.getName() + "," + obj.getEmail() + "," + obj.getPassword() + "," + obj.getAge() + ","
                    + obj.getPhoneNumber() + "," + obj.getLocation() + "," + obj.getVehiclename() + ","
                    + obj.getVehiclenumber() + "," + obj.getCustomID() + "\n");
            bf.close();
            return true;

        } catch (Exception e) {
            // TODO: handle exception
            return false;
        }

    }

    public static AccountManager getInstance() {
        if (instance == null) {
            instance = new AccountManager();
        }
        return instance;
    }

    public boolean createAccount(Customer obj) {
        c.add(obj);
        return (writeInCustFile(obj));
    }

    public boolean createAccount(Driver obj) {
        d.add(obj);
        return (writeInDrivFile(obj));

    }

    public Customer displayAccount(String emailID) {
        for (int i = 0; i < c.size(); i++) {
            if (c.get(i).getEmail().equals(emailID)) {
                // System.out.println("Name=" + c.get(i).getName());
                // System.out.println("Email=" + c.get(i).getEmail());
                // System.out.println("age=" + c.get(i).getAge());
                // System.out.println("Phone Number=" + c.get(i).getPhoneNumber());
                // System.out.println("Location=" + c.get(i).getLocation());
                // System.out.println("Customer ID=" + c.get(i).getCustomID());
                return c.get(i);
            }
        }
        System.out.println("Customer does not exist in our database");
        return null;
    }

    public Driver displayAccount(String driverEmailID, char dr) {
        for (int i = 0; i < d.size(); i++) {
            if (d.get(i).getEmail().equals(driverEmailID)) {
                // System.out.println("Name=" + d.get(i).getName());
                // System.out.println("Email=" + d.get(i).getEmail());
                // System.out.println("age=" + d.get(i).getAge());
                // System.out.println("Phone Number=" + d.get(i).getPhoneNumber());
                // System.out.println("Location=" + d.get(i).getLocation());
                // System.out.println("Driver ID=" + d.get(i).getCustomID());
                return d.get(i);
            }
        }
        // System.out.println("Customer does not exist in our database");
        return null;
    }

    public Customer searchWithMobileNumber(String num) {
        for (int i = 0; i < c.size(); i++) {
            if (c.get(i).getPhoneNumber().equals(num)) {
                // System.out.println("Name=" + d.get(i).getName());
                // System.out.println("Email=" + d.get(i).getEmail());
                // System.out.println("age=" + d.get(i).getAge());
                // System.out.println("Phone Number=" + d.get(i).getPhoneNumber());
                // System.out.println("Location=" + d.get(i).getLocation());
                // System.out.println("Driver ID=" + d.get(i).getCustomID());
                return c.get(i);
            }
        }
        // System.out.println("Customer does not exist in our database");
        return null;
    }

    public Driver searchWithMobileNumberD(String num) {
        for (int i = 0; i < d.size(); i++) {
            if (d.get(i).getPhoneNumber().equals(num)) {
                // System.out.println("Name=" + d.get(i).getName());
                // System.out.println("Email=" + d.get(i).getEmail());
                // System.out.println("age=" + d.get(i).getAge());
                // System.out.println("Phone Number=" + d.get(i).getPhoneNumber());
                // System.out.println("Location=" + d.get(i).getLocation());
                // System.out.println("Driver ID=" + d.get(i).getCustomID());
                return d.get(i);
            }
        }
        // System.out.println("Customer does not exist in our database");
        return null;
    }

    public boolean reWriteAccountDetailsDriver(Driver dobj) {
        try {
            FileReader fr = new FileReader("database/driv.txt");
            HashSet<String> hs = new HashSet<String>();
            BufferedReader br = new BufferedReader(fr);
            String temp = br.readLine();
            while (temp != null) {
                String[] strarr = temp.split(",");
                if (!dobj.getEmail().equals(strarr[1])) {
                    hs.add(temp);
                }
                temp = br.readLine();
            }
            br.close();
            PrintWriter pw = new PrintWriter("database/driv.txt");
            for (String s : hs) {
                pw.println(s);
            }
            pw.println(dobj.getName() + "," + dobj.getEmail() + "," + dobj.getPassword() + "," + dobj.getAge() + ","
                    + dobj.getPhoneNumber() + "," + dobj.getLocation() + "," + dobj.getVehiclename() + ","
                    + dobj.getVehiclenumber() + "," + dobj.getCustomID());
            pw.close();
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    public List<Customer> UnModifiedListOfCustomers() {
        List<Customer> ls = null;
        ls = Collections.unmodifiableList(c);

        return ls;
    }

    public static void main(String[] args) {
        // AccountManager obj = getInstance();
        // assert (obj.UnModifiedListOfCustomers().size() == 7);
        // assert (obj.UnModifiedListOfCustomers().get(3).getName().equals("Aman")) :
        // "Different";
        // obj.createAccount(new Customer("Amir", "amirkpatna@gmail.com", "password",
        // "20", "88042xxxxx", "700102"));
        // System.out.println(obj.reWriteAccountDetailsDriver(
        // new Driver("Aman", "adi@gmail.com", "13423", "65", "80273xxxxxx", "700092",
        // "Maruti", "Wb cz 501p")));
        // obj.displayAccount(2);

        // obj.displayAccount(3, 'd');
    }

}