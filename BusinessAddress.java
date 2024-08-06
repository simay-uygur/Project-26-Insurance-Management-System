/**
 * BusinessAddress
 */
public class BusinessAddress implements Address{
    private String companyName;
    private String attentionLine;
    private String streetAddress;
    private String suitNumber;
    private String city;
    private String state_province_region;
    private int postalCode;
    private String country;

    @Override
    public String getAddressName() {
        return "Business Address" + companyName + ", " + attentionLine + ", "
        + streetAddress + ", " + suitNumber + ", " + city + ", "
        + state_province_region + ", " + postalCode + ", " + country + "." ;
        
    }
    public BusinessAddress(String companyName, String attentionLine, String streetAddress, String suitNumber,
            String city, String state_province_region, int postalCode, String country) {
        this.companyName = companyName;
        this.attentionLine = attentionLine;
        this.streetAddress = streetAddress;
        this.suitNumber = suitNumber;
        this.city = city;
        this.state_province_region = state_province_region;
        this.postalCode = postalCode;
        this.country = country;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getAttentionLine() {
        return attentionLine;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getSuitNumber() {
        return suitNumber;
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