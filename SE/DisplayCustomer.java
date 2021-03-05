public class DisplayCustomer {
    private LoginUI loginobj;
    private Customer cobj;
    private SearchCab searchobj;
    private Cabs cabsobj;
    private Details detailsobj;
    private Profile profileobj;
    private Booking bkg;

    public DisplayCustomer(Customer cobj) {
        this.cobj = cobj;

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

    public SearchCab getSearchCabObject() {
        if (searchobj == null)
            this.searchobj = new SearchCab(this);
        return this.searchobj;
    }

    public Cabs getCabsObject() {
        if (cabsobj == null)
            this.cabsobj = new Cabs(this);
        return this.cabsobj;
    }

    public Details getDetailsObject() {
        if (detailsobj == null)
            this.detailsobj = new Details(this);
        return this.detailsobj;
    }

    public Profile getProfileObject() {
        this.profileobj = new Profile(1, this);
        return this.profileobj;
    }

    public Customer getCustomerObject() {

        return this.cobj;
    }

}
