public class Customer {
    private String name;
    private String email;
    private String password;
    private String age;
    private String phoneNumber;
    private String location;
    private int customID;
    static int count = 0;

    public Customer(String name, String email, String password, String age, String phoneNumber, String location) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.location = location;
        this.customID = ++count;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

    public String getAge() {
        return this.age;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getLocation() {
        return this.location;
    }

    public int getCustomID() {
        return this.customID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setCustID(int custid) {
        this.customID = custid;
    }

}
