public class HomeAddress implements Address{

    private String ownerName;
    private String streetAddress;
    private String apt_unitNumber;
    private String city;
    private String state_province_region;
    private int postalCode;
    private String country;

    @Override
    public String getAddressName() {
       return ownerName + ", " +
                streetAddress + ", " +
                apt_unitNumber + ", " + 
                city + ", " +
                state_province_region + ", " +
                postalCode + ", " +
                country + ".";
    }

    public HomeAddress(String ownerName, String streetAddress, String apt_unitNumber, String city,
            String state_province_region, int postalCode, String country) {
        this.ownerName = ownerName;
        this.streetAddress = streetAddress;
        this.apt_unitNumber = apt_unitNumber;
        this.city = city;
        this.state_province_region = state_province_region;
        this.postalCode = postalCode;
        this.country = country;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getApt_unitNumber() {
        return apt_unitNumber;
    }

    public String getCity() {
        return city;
    }

    public String getState_province_region() {
        return state_province_region;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public String getCountry() {
        return country;
    }

    
    
}
