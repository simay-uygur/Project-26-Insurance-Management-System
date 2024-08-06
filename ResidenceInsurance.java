public class ResidenceInsurance extends Insurance{

    @Override
    double calculate() {
        if(this.getAccType() == AccountType.Enterprise){
            return 1200.1;
        } else {
            return 1900.1;
        }
    }
    
}
