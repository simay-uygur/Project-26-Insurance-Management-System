import java.util.Iterator;
import java.util.TreeSet;

public class AccountManager {
    private static TreeSet<Account> accountSet = new TreeSet<>();
    private AuthenticationStatus statusUser;

    static {
        accountSet.add(new Enterprise(new User("Amazon", "", "amazon@gmail.com", "amazonzon", "enterprise", 20)));
        accountSet.add(new Enterprise(new User("AliExpress", "", "ali@hotmail.com", "aliEx", "enterprise", 30)));
        accountSet.add(new Individual(new User("Simay", "Uygur", "simay@mail.com", "sio", "Student", 20)));
        
    }

    public AuthenticationStatus getLoginStatusUser() {
        return statusUser;
    }

    public Account logIn(String mail, String password) throws InvalidAuthenticationException{
        Iterator<Account> iter = accountSet.iterator();
        while(iter.hasNext()){
            Account curAcc = iter.next();
            Account acc = null;
            
            acc= curAcc.logInUser(mail,password);
            if(acc != null) {
                this.statusUser = AuthenticationStatus.SUCCESS;
                return acc;  
            }  
            
        }
        this.statusUser = AuthenticationStatus.FAIL;
        throw new InvalidAuthenticationException();
    } 
    
    

}
