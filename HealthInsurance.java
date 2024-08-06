public class HealthInsurance extends Insurance {

    @Override
    double calculate() {
        if(this.getAccType() == AccountType.Enterprise){
            return 5000.3;
        } else {
            return 2500.99;
        }
    }
    
   
}
