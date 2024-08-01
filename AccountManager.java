import java.util.Iterator;
import java.util.TreeSet;

public class AccountManager {
    private static TreeSet<Account> accountSet = new TreeSet<>();

    public Account logIn(String mail, String password){
        Iterator<Account> iter = accountSet.iterator();
        while(iter.hasNext()){
            Account curAcc = iter.next();
            try {
                curAcc.logInUser(mail,password);
                return curAcc;
            } catch (InvalidAuthenticationException e) {
                e.printStackTrace();
            }
        }
        return null;
    } 
    
    

}
