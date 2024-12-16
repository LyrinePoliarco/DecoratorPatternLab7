# DecoratorPatternLab7

UML DESIGN

![image](https://github.com/user-attachments/assets/4488c2e4-34dc-4843-8b5a-a42f21db6982)
INSTRUCTION: CIMB is a digital bank that offers GSave and UpSave savings accounts. As with a typical Savings Account, it contains accountNumber, accountName, and a balance for that account.

The typical savings account offers an interest rate of 1%. The benefits of the typical savings account is the same with the "Standard Savings Account" as compared to other banks.

The GSave account offers an interest rate of 2.5%. Benefits include the "Standard Savings Account" plus access to "GCash transfer".

The UpSave account offers the highest interest rate of 4.0%. Benefits include the "Standard Savings Account" plus "with Insurance".

Develop a decorator pattern approach that will implement the given UML diagram:

![image](https://github.com/user-attachments/assets/652fde88-8fde-400a-b0a4-04807ffaeb34)

The content of your Cimb.java should ONLY contain the following codes with the exception of inserting your own package name :

public class Cimb {

public static void main(String[] args) {
	
	SavingsAccount account = new SavingsAccount();
	
	account.setAccountNumber(1234);
	account.setAccountName("Juan Dela Cruz");
	account.setBalance(10000.0);
	
	System.out.println(account.showInfo());
	System.out.println("Account type: " + account.showAccountType());
	System.out.println("Interest rate: " + account.getInterestRate());
	System.out.println("New balance: " + account.computeBalanceWithInterest());
	System.out.println("Benefits: " + account.showBenefits());
	
	System.out.println("----------------------");
	
	GSave gSave = new GSave(account);
	System.out.println(gSave.showInfo());
	System.out.println("Account type: " + gSave.showAccountType());
	System.out.println("Interest rate: " + gSave.getInterestRate());
	System.out.println("New balance: " + gSave.computeBalanceWithInterest());
	System.out.println("Benefits: " + gSave.showBenefits());
	
	System.out.println("----------------------");
	
	UpSave upSave = new UpSave(account);
	System.out.println(upSave.showInfo());
	System.out.println("Account type: " + upSave.showAccountType());
	System.out.println("Interest rate: " + upSave.getInterestRate());
	System.out.println("New balance: " + upSave.computeBalanceWithInterest());
	System.out.println("Benefits: " + upSave.showBenefits());
}
}

You should display the following output:


![image](https://github.com/user-attachments/assets/f58a9726-172b-442f-a22b-62665a72203c)

