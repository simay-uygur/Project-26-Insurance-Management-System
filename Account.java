import java.util.ArrayList;

public abstract class Account implements Comparable{
    private AuthenticationStatus statusUser;
    private User user;
    private ArrayList<Insurance> insuranceList = new ArrayList<>();

    public final void showUserInfo(){
        System.out.println(user.toString());
    }

    public AuthenticationStatus getLoginStatusUser() {
        return statusUser;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<Insurance> getInsuranceList() {
        return insuranceList;
    }

    public void addAddress(Address a){
        AddressManager.addAddress(a, user);
    }

    public void removeAddress(Address a){
        AddressManager.removeAddress(a, user);
    }

    public void logInUser(String mail, String password) throws InvalidAuthenticationException {
        if(this.user.getEmail().equals(mail) && this.user.getPassword().equals(password)){
            this.statusUser = AuthenticationStatus.SUCCESS;
        } else{
            this.statusUser = AuthenticationStatus.FAIL;
            throw new InvalidAuthenticationException();
        }
    }

    public abstract void addInsurance();

    @Override
    public boolean equals(Object obj) {
        
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }

    @Override
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
        return 0;
    }
}