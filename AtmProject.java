import java.util.Scanner;
class Atm
{
    float balance;
	int pin=3050;

	public void checkPin(){
		System.out.print("Enter your Pin ::");
		Scanner sc  = new Scanner(System.in);
		int enterPin = sc.nextInt();

		if (enterPin == pin)
		{
			//System.out.print("Enter your Account Balance ::"); 
			//balance = sc.nextFloat();
              menu();
		}
		else
		{
			System.out.println("Enter a valid Pin");
		}

	}

	public void menu(){
		System.out.println("Enter your Choice ::");
		System.out.println("1. Check A/C Balance ::");
		System.out.println("2. Deposite Money  ::");
		System.out.println("3. Withdraw Money ::");
        System.out.println("4. Exit");


		Scanner sc = new Scanner(System.in);
		int opt = sc.nextInt();

		if (opt==1)
		{
			checkBalnce();
		}
		else if(opt==2)
		{
			depositeMoney(); 
		}
		else if(opt==3)
		{
		    withdrawMoney();	
		}
		else if(opt==4)
		{
			return;
		}
		else
        {
			System.out.println("Enter a valid choice");
        }
	}

	public void checkBalnce(){
		System.out.println("Balance :: " +balance );
		menu();
	}

	public void withdrawMoney(){
        
		System.out.print("Enter Amount to Withdraw :: ");
		Scanner sc = new Scanner(System.in);
		float currAmount = sc.nextFloat();
		if(currAmount > balance)
		{
			System.out.println("Insufficient Balance");
		}
		else
		{
			balance = balance-currAmount;
			System.out.println("Your a/c no. XXXXXXXXXXXX6268 is debited for Rs."+currAmount+" on 14-01-24 and credited to a/c no. XXXXXXXXXX0007  (UPI Ref no 401423544443).To block UPI services of IDBI Bank, Send SMS as UPIBLOCK <type your mobile no> to 07799000565 from your registered number, or call 18002094324 immediately.- IDBI BANK");
		}
		menu();
	}
    

	public void depositeMoney(){
		System.out.print("Enter the amount ::");
		Scanner sc = new Scanner(System.in);
		float amount = sc.nextFloat();
		balance  = balance + amount;
		System.out.println("Your a/c no. XXXXXXXXXXXX6268 is credited for Rs." +amount+" on 13-01-24 and credited to a/c no. XXXXXXXXXXX0612  (UPI Ref no 437983405155).To block UPI services of IDBI Bank, Send SMS as UPIBLOCK <type your mobile no> to 07799000565 from your registered number, or call 18002094324 immediately.- IDBI BANK");
		menu();
	}

}








class AtmProject 
{
	public static void main(String[] args) 
	{
		Atm a = new Atm();
		a.checkPin();
	}
}
