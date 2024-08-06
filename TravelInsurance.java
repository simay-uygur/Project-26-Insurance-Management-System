public class TravelInsurance extends Insurance{

    @Override
    double calculate() {
        if(this.getAccType() == AccountType.Enterprise){
            return 100000.1;
        } else {
            return 1000.1;
        }
    }
    
}
