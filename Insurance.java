import java.util.Date;

/**
 * Insurance
 */
abstract class Insurance {

    private String insuranceName;
    private double insuranceFee;
    private Date startDate;
    private Date endDate;
 
    abstract double calculate();
}