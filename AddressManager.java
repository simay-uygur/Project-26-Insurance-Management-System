import java.util.ArrayList;

public class AddressManager {
    private static ArrayList<Address> processing = new ArrayList<>();

    public static boolean addAddress(Address address, User u){
        int index = searchAddressFromUser(address, u);
        if(index != -1)
            return false; //already exists
        
        u.getAddressList().add(address);
        return true;
    }

    public static boolean removeAddress(Address address, User u){
        int index = searchAddressFromUser(address, u);
        if(index == -1)
            return false;
        
        u.getAddressList().remove(index);
        return true;
    }

    public static int searchAddressFromUser(Address address, User u){
        processing = u.getAddressList();

        for(int i = 0; i < processing.size(); i++){
            if(address.equals(processing.get(i))){
                return i;
            }
        }
        return -1;
    }
}
