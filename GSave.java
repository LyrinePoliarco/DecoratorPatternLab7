public class GSave extends BankAccountDecorator {

    public GSave(BankAccount account) {
        super(account);
    }
  
    @Override
    public String showAccountType() {
        return "GSave";
    }
  
    @Override
    public double getInterestRate() {
        return 0.025; 
    }
  
    @Override
    public double computeBalanceWithInterest() {
        return getBalance() + (getBalance() * getInterestRate());
    }
  
    @Override
    public String showBenefits() {
        return super.showBenefits() + ", GCash Transfer";
    }
  }
  