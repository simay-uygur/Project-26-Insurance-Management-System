import java.util.ArrayList;

public abstract class Account implements Comparable{
    private User user;
    private ArrayList<Insurance> insuranceList; 

    public Account(User user) {
        this.user = user;
        insuranceList = new ArrayList<>();
    }

    public final void showUserInfo(){
        System.out.println(user.toString());
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

    public Account logInUser(String mail, String password) {
        if(this.user.getEmail().equals(mail) && this.user.getPassword().equals(password)){
            
            return this;
        } else{
            
            return null;
        }
    }

    public abstract void addInsurance();

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Account other = (Account) obj;
        if (user == null) {
            if (other.user != null)
                return false;
        } else if (!user.equals(other.user))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((user == null) ? 0 : user.hashCode());
        return result;
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Account){
            Account compAcc = (Account) o;
            return this.getUser().getFirstName().compareTo(compAcc.getUser().getFirstName()) == 0 ? this.getUser().getLastName().compareTo(compAcc.getUser().getLastName()) : this.getUser().getFirstName().compareTo(compAcc.getUser().getFirstName());
        }
        return -1;
    }
}

/* 



Klavyeden email ve şifre bilgisini alan bir sınıf tasarlayınız. Klavyeden alınan email ve şifre bilgisi ile AccountManager sınıfındaki "login" fonksiyonunu çağırın. Eğer geçerli bir kullanıcı ile giriş yapmışsanız bu fonksiyon size Account tipinde bir nesne dönecektir.
*/