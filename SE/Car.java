public class Car {

    private String name;
    private String model;
    private String number;

    private String licencenumber;
    private String owner;
    private String ownerPhoneNumber;
    private String location;
    private int carID;
    public static int count = 0;

    public Car(String name, String model, String number, String owner, String location) {
        this.name = name;
        this.model = model;
        this.number = number;
        this.owner = owner;
        this.location = location;
        this.carID = ++count;
    }

    public String getName() {
        return (this.name);
    }

    public String getModel() {
        return (this.model);
    }

    public String getNumber() {
        return (this.number);
    }

    public String getLicenceNumber() {
        return (this.licencenumber);
    }

    public String getOwner() {
        return (this.owner);
    }

    public String getLocation() {
        return (this.location);
    }

    public int getCarID() {
        return (this.carID);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setLicenceNumber(String licencenumber) {
        this.licencenumber = licencenumber;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setCarID(int carID) {
        this.carID = carID;
    }

    public void setOwnerPhoneNumber(String ownerPhoneNumber) {
        this.ownerPhoneNumber = ownerPhoneNumber;
    }

    public String getOwnerPhoneNumber() {
        return (this.ownerPhoneNumber);
    }

}
