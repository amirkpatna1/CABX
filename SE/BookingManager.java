import java.io.*;
import java.util.*;

public class BookingManager {
    public ArrayList<Booking> b = new ArrayList<Booking>();

    public static BookingManager bookingManagerInstance;

    private BookingManager() {
        isCalledOnce();
    }

    public static BookingManager getInstanceOfBookingManager() {
        if (bookingManagerInstance == null)
            bookingManagerInstance = new BookingManager();
        return bookingManagerInstance;
    }

    public boolean isCalledOnce() {
        try {
            this.b.clear();
            FileReader fa = new FileReader("database/booking.txt");
            BufferedReader br = new BufferedReader(fa);
            String temp = "";
            while (temp != null) {
                temp = br.readLine();
                if (temp != null) {
                    String[] strarr = temp.split(",");
                    Booking bid = new Booking(strarr[0], strarr[1], strarr[2], strarr[3]);
                    bid.setBookingID(Integer.parseInt(strarr[10]));
                    bid.setStatus(Integer.parseInt(strarr[9]));
                    bid.setDriverName(strarr[4]);
                    ;
                    bid.setDriverPhoneNumber(strarr[5]);
                    bid.setVehicleName(strarr[6]);
                    bid.setVehicleNumber(strarr[7]);
                    bid.setFare(Integer.parseInt(strarr[8]));
                    this.b.add(bid);
                }

            }
            return true;
        }

        catch (IOException e) {
            // TODO: handle exception
            return false;
        }
    }

    public boolean writeInBookingFile(Booking obj) {
        try {
            FileWriter fw = new FileWriter("database/booking.txt", true);
            BufferedWriter bf = new BufferedWriter(fw);
            bf.write(obj.getCustomerName() + "," + obj.getCustomerPhoneNumber() + "," + obj.getPickupLocation() + ","
                    + obj.getDropLocation() + "," + obj.getDriverName() + "," + obj.getDriverPhoneNumber() + ","
                    + obj.getVehicleName() + "," + obj.getVehicleNumber() + "," + obj.getFare() + "," + obj.getStatus()
                    + "," + obj.getBookingID() + "\n");
            bf.close();
            return true;

        } catch (IOException e) {
            // TODO: handle exception
            return false;
        }

    }

    public int getMaxBookingID() {
        int max = 0;
        for (int i = 0; i < b.size(); i++) {
            if (max < b.get(i).getBookingID())
                max = b.get(i).getBookingID();
        }
        return max;
    }

    public boolean deleteFromBookingFile(int booking_id) {
        try {
            FileReader fa = new FileReader("database/booking.txt");
            HashSet<String> hs = new HashSet<String>();
            // BufferedWriter bw = new BufferedWriter(fw);
            BufferedReader br = new BufferedReader(fa);
            String temp = br.readLine();
            while (temp != null) {

                String[] strarr = temp.split(",");
                if (Integer.parseInt(strarr[10]) != booking_id) {
                    hs.add(temp);
                }
                temp = br.readLine();
                // bw.close();

            }
            br.close();
            PrintWriter pw = new PrintWriter("database/booking.txt");
            for (String s : hs) {
                pw.println(s);
            }
            pw.close();
            return true;

        }

        catch (IOException e) {
            // TODO: handle exception
            return false;
        }
    }

    public boolean reWriteInBookingFile(Booking obj) {
        try {
            FileReader fa = new FileReader("database/booking.txt");
            HashSet<String> hs = new HashSet<String>();
            // BufferedWriter bw = new BufferedWriter(fw);
            BufferedReader br = new BufferedReader(fa);
            String temp = br.readLine();
            while (temp != null) {

                String[] strarr = temp.split(",");
                if (!strarr[1].equals(obj.getCustomerPhoneNumber())) {
                    hs.add(temp);
                }
                temp = br.readLine();
                // bw.close();

            }
            br.close();
            PrintWriter pw = new PrintWriter("database/booking.txt");
            for (String s : hs) {
                pw.println(s);
            }
            pw.println(obj.getCustomerName() + "," + obj.getCustomerPhoneNumber() + "," + obj.getPickupLocation() + ","
                    + obj.getDropLocation() + "," + obj.getDriverName() + "," + obj.getDriverPhoneNumber() + ","
                    + obj.getVehicleName() + "," + obj.getVehicleNumber() + "," + obj.getFare() + "," + obj.getStatus()
                    + "," + obj.getBookingID());
            pw.close();
            return true;

        }

        catch (IOException e) {
            // TODO: handle exception
            return false;
        }
    }

    public Booking getBookingObjectWithMobileNumber(String mobile_num) {
        for (int i = 0; i < this.b.size(); i++) {
            Booking bkg = b.get(i);
            if (bkg.getCustomerPhoneNumber().equals(mobile_num))
                return bkg;
        }
        return null;
    }

    public Booking getBookingObjectWithMobileNumber(String mobile_num, char d) {
        for (int i = 0; i < this.b.size(); i++) {
            Booking bkg = b.get(i);
            if (bkg.getDriverPhoneNumber().equals(mobile_num))
                return bkg;
        }
        return null;
    }

    public boolean addBooking(Booking obj) {
        b.add(obj);
        return (writeInBookingFile(obj));

        // String s = obj.getCustomerName() + " " + obj.getCustomerPhoneNumber() + " " +
        // obj.getPickupLocation()
        // + " " + obj.getDropLocation() + " " + obj.getBookingID();
        // AcceptBooking.model.add(AcceptBooking.model.size(), s);
    }

    public boolean removeBooking(int bookingID) {
        int i;
        isCalledOnce();
        for (i = 0; i < b.size(); i++) {
            System.out.println(b.get(i).getBookingID() + " ==" + bookingID);
            if (b.get(i).getBookingID() == bookingID) {
                b.remove(b.get(i));
                deleteFromBookingFile(bookingID);
                return true;
            }
        }
        return false;
    }

    public boolean cancelBooking(int bookingID) {
        int i;
        for (i = 0; i < b.size(); i++) {
            if (b.get(i).getBookingID() == bookingID) {
                b.remove(b.get(i));
                return true;
            }
        }
        return false;
    }

    public boolean searchBooking(int bookingID) {
        int i;
        for (i = 0; i < b.size(); i++) {
            if (b.get(i).getBookingID() == bookingID) {
                return true;
            }
        }
        return false;
    }

    public Booking getBooking(int bookingID) {
        int i;
        for (i = 0; i < b.size(); i++) {
            if (b.get(i).getBookingID() == bookingID) {
                return b.get(i);
            }
        }
        return null;
    }

    public List<Booking> UnModifiedListOfCars() {
        List<Booking> ls = null;
        ls = Collections.unmodifiableList(b);

        return ls;
    }

    public static void main(String[] args) {
        // BookingManager bkg = getInstanceOfBookingManager();
        // bkg.isCalledOnce();
        // bkg.removeBooking(1);
        // bkg.reWriteInBookingFile(new Booking("Aditya", "8804247185", "700111",
        // "700098"));
        // assert (bkg.UnModifiedListOfCars().size() == 4) : "Incorrect";
        // assert (bkg.UnModifiedListOfCars().get(3).getCustomerName().equals("Amir")) :
        // "Incorrect";

    }

}
