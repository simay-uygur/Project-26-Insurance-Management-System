import java.util.Date;

/**
 * Insurance
 */
abstract class Insurance {

    private String insuranceName;
    private double insuranceFee;
    private Date startDate;
    private Date endDate;
    private AccountType accType;


    abstract double calculate();


    public String getInsuranceName() {
        return insuranceName;
    }


    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }


    public double getInsuranceFee() {
        return insuranceFee;
    }


    public void setInsuranceFee(double insuranceFee) {
        this.insuranceFee = insuranceFee;
    }


    public Date getStartDate() {
        return startDate;
    }


    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }


    public Date getEndDate() {
        return endDate;
    }


    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }


    public AccountType getAccType() {
        return accType;
    }


    public void setAccType(AccountType accType) {
        this.accType = accType;
    }

    

}