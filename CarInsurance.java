public class CarInsurance extends Insurance {

    @Override
    double calculate() {
        if(this.getAccType() == AccountType.Enterprise){
            return 20000.3;
        } else {
            return 25000.99;
        }
    }
    
    
}
