public class Rental {

    private String rentername;
    private String vehiclenumber;
    private String startdate;
    private String enddate;
    private int duration;
    private String cost;
    private String location;
    private String drivername;
    private String driverphonenumber;
    private String renterphonenumber;
    private int renterid;

    public Rental(String rentername, String vehiclenumber, String startdate, String enddate, int dur, String cost,
            String location, String drivername, String driverphonenumber, String renterphonenumber, int renterid) {
        this.rentername = rentername;
        this.vehiclenumber = vehiclenumber;
        this.startdate = startdate;
        this.duration = dur;
        this.enddate = enddate;
        this.cost = cost;
        this.location = location;
        this.drivername = drivername;
        this.driverphonenumber = driverphonenumber;
        this.renterphonenumber = renterphonenumber;
        this.renterid = renterid;
    }

    public String getRenterName() {
        return this.rentername;
    }

    public String getVehicleNumber() {
        return this.vehiclenumber;
    }

    public String getStartDate() {
        return this.startdate;
    }

    public String getEndDate() {
        return this.enddate;
    }

    public int getDuration() {
        return this.duration;
    }

    public String getCost() {
        return this.cost;
    }

    public String getLocation() {
        return this.location;
    }

    public String getDriverName() {
        return this.drivername;
    }

    public String getDriverPhoneNumber() {
        return this.driverphonenumber;
    }

    public String getRenterPhoneNumber() {
        return this.renterphonenumber;
    }

    public int getRenterId() {
        return this.renterid;
    }

    public void setRenterName(String rentername) {
        this.rentername = rentername;
    }

    public void setVehicleNumber(String vehiclenumber) {
        this.vehiclenumber = vehiclenumber;
    }

    public void setStartDate(String startdate) {
        this.startdate = startdate;
    }

    public void setEndDate(String enddate) {
        this.enddate = enddate;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDriverName(String drivername) {
        this.drivername = drivername;
    }

    public void setDriverPhoneNumber(String driverphonenumber) {
        this.driverphonenumber = driverphonenumber;
    }

    public void setRenterPhoneNumber(String renterphonenumber) {
        this.renterphonenumber = renterphonenumber;
    }

}
