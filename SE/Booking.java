public class Booking {
    private String driverName;
    private String vehiclename;
    private String vehiclenumber;
    private String customername;
    private String customerphonenumber;
    private String driverphonenumber;
    private String pickuplocation;
    private String droplocation;
    private int bookingID;
    private int custID;
    private int drivID;
    private int fare;
    private int status;
    public static int booking_no = 0;

    public Booking(String Customername, String customerphonenumber, String pickuploc, String droploc) {

        this.customername = Customername;
        this.customerphonenumber = customerphonenumber;
        this.pickuplocation = pickuploc;
        this.droplocation = droploc;
        this.bookingID = ++booking_no;
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDriverName() {
        return (this.driverName);
    }

    public int getFare() {
        return (this.fare);
    }

    public String getVehicleName() {
        return (this.vehiclename);
    }

    public String getVehicleNumber() {
        return (this.vehiclenumber);
    }

    public String getCustomerName() {
        return (this.customername);
    }

    public String getCustomerPhoneNumber() {
        return (this.customerphonenumber);
    }

    public String getDriverPhoneNumber() {
        return (this.driverphonenumber);
    }

    public String getPickupLocation() {
        return (this.pickuplocation);
    }

    public String getDropLocation() {
        return (this.droplocation);
    }

    public int getCustID() {
        return (this.custID);
    }

    public int getDriverID() {
        return (this.drivID);
    }

    public int getBookingID() {
        return (this.bookingID);
    }

    public void setDriverName(String drivername) {
        this.driverName = drivername;
    }

    public void setVehicleName(String vehiclename) {
        this.vehiclename = vehiclename;
    }

    public void setVehicleNumber(String vehiclenum) {
        this.vehiclenumber = vehiclenum;
    }

    public void setCustomerName(String custname) {
        this.customername = custname;
    }

    public void setCustomerPhoneNumber(String custphn) {
        this.customerphonenumber = custphn;
    }

    public void setDriverPhoneNumber(String drivphn) {
        this.driverphonenumber = drivphn;
    }

    public void setPickupLoc(String pickup) {
        this.pickuplocation = pickup;
    }

    public void setDropLocation(String droploc) {
        this.droplocation = droploc;
    }

    public void setBookingID(int a) {
        this.bookingID = a;
    }

    public void setCustomerID(int custID) {
        this.custID = custID;
    }

    public void setDriverID(int driverID) {
        this.drivID = driverID;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }

}
