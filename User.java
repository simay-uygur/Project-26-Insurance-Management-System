import java.util.ArrayList;
import java.util.Date;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String profession;
    private int age;
    private ArrayList<Address> addressList;
    private Date lastEnteredDate;

    public User() {
    }

    public User(String firstName, String lastName, String email, String password, String profession, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.profession = profession;
        this.age = age;
        addressList = new ArrayList<>();
        lastEnteredDate = null; //şüpheli
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getProfession() {
        return profession;
    }
    public void setProfession(String profession) {
        this.profession = profession;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public ArrayList<Address> getAddressList() {
        return addressList;
    }
    public void setAddressList(ArrayList<Address> addressList) {
        this.addressList = addressList;
    }
    public Date getLastEnteredDate() {
        return lastEnteredDate;
    }
    public void setLastEnteredDate(Date lastEnteredDate) {
        this.lastEnteredDate = lastEnteredDate;
    }

    @Override
    public String toString() {
        return "User [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", password=" + password
                + ", profession=" + profession + ", age=" + age + ", addressList=" + addressList + ", lastEnteredDate="
                + lastEnteredDate + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof User){
            User compare = (User) obj;
            return this.firstName.equals(compare.firstName) &&
                    this.lastName.equals(compare.lastName) &&
                    this.email.equals(compare.email) &&
                    this.password.equals(compare.password) &&
                    this.profession.equals(compare.profession) &&
                    this.age == compare.age;
                    //this.addressList.;
                    //Date lastEnteredDate;
        }
        return false;
    }
    
}
