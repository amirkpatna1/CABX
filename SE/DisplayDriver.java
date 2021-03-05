public class DisplayDriver {
    private LoginUI loginobj;
    private DriverHomePage driverhome;
    private AcceptBooking acceptobj;
    private Driver dobj;
    private RentVehicle rentobj;
    private SearchVehicle searchvehicleobj;
    private DetailsDriver detailsobj;
    private Booking bkg;
    private Profile profileobj;
    private VehicleDetails vehicledetailsobj;
    private Car carobj;
    private Rental rentalobj;

    public DisplayDriver(Driver dobj) {
        this.dobj = dobj;

        this.carobj = new Car("null", "null", "null", "null", "null");

    }

    public Car getCarObject() {
        return this.carobj;
    }

    public void setCarObject(Car obj) {
        this.carobj = obj;
    }

    public Rental getRentalObject() {
        return this.rentalobj;
    }

    public VehicleDetails getVehicleDetailsObject() {
        if (vehicledetailsobj == null)
            this.vehicledetailsobj = new VehicleDetails(this);
        return this.vehicledetailsobj;
    }

    public void setRentalObject(Rental rentalobj) {
        this.rentalobj = rentalobj;
    }

    public Booking getBookingObject() {
        return this.bkg;
    }

    public void setBookingObject(Booking bkg) {
        this.bkg = bkg;
    }

    public LoginUI getLoginObject() {
        if (loginobj == null)
            this.loginobj = new LoginUI(this);
        return this.loginobj;
    }

    public Profile getProfileObject() {
        this.profileobj = new Profile(0, this);
        return this.profileobj;
    }

    public DetailsDriver getDetailsObject() {
        if (detailsobj == null)
            this.detailsobj = new DetailsDriver(this);
        return this.detailsobj;
    }

    public DriverHomePage getDriverHomePageObject() {
        if (driverhome == null)
            this.driverhome = new DriverHomePage(this);
        return this.driverhome;
    }

    public AcceptBooking getAcceptBookingObject() {
        if (acceptobj == null)
            this.acceptobj = new AcceptBooking(this);
        return this.acceptobj;
    }

    public RentVehicle getRentVehicleObject() {
        if (rentalobj == null)
            this.rentobj = new RentVehicle(this);
        return this.rentobj;
    }

    public SearchVehicle getSearchVehicleObject() {
        if (searchvehicleobj == null)
            this.searchvehicleobj = new SearchVehicle(this);
        return searchvehicleobj;
    }

    public Driver getDriverObject() {
        return this.dobj;
    }

}
