public class UpSave extends BankAccountDecorator {

    public UpSave(BankAccount account) {
        super(account);
    }
  
    @Override
    public String showAccountType() {
        return "UpSave";
    }
  
    @Override
    public double getInterestRate() {
        return 0.04; 
    }
  
    @Override
    public double computeBalanceWithInterest() {
        return getBalance() + (getBalance() * getInterestRate());
    }
  
    @Override
    public String showBenefits() {
        return super.showBenefits() + ", With Insurance";
    }
  }