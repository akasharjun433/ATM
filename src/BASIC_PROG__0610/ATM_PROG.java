package BASIC_PROG__0610;

import java.util.Scanner;

public class ATM_PROG {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int bal = 10000;
		int atmbal=1000000;
		int wd, tr;
		
		System.out.println("ENTER ANY NUMBER TO ACTIVATE ATM: ");
		int activate = sc.nextInt();
		
		while (activate != 0) {
			System.out.println();
			System.out.println("Automated Teller Machine");
			System.out.println("Choose 1 for Check Balance");
			System.out.println("Choose 2 for Withdraw");
			System.out.println("Choose 3 for Transfer Money");
			System.out.println("Choose 4 for Check ATM Balance");
			System.out.print("Choose the operation you want to perform:");
			int choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("--------------------------------");
				System.out.println("YOUR AVAILABLE BALANCE IS: "+bal);
				break;
			case 2:
				System.out.println("--------------------------------");
				System.out.println("ENTER AMOUNT TO WITHDRAW: ");
				wd=sc.nextInt();
				
				if(wd>bal)
				{
					System.out.println("--------------------------------");
					System.out.println("INSUFFICIENT BALANCE...!!!");
				}
				else
				{
					bal=bal-wd;
					atmbal=atmbal-wd;
					System.out.println("--------------------------------");
					System.out.println("AMOUNT IS OUT FOR YOU..!!");
		
					     int[] noteValues= {500,100,50,20,10,1};
					     if(wd>35000)
					     {
					         System.out.println("ATM Cash Limit exceeds.");
					     }
					     else
					     {
					        for(int i=0;i<6;i++){
					            if(wd>=noteValues[i])
					                System.out.println("No of "+noteValues[i]+"'s"+" :"+wd/noteValues[i]+"\n");

							}
						}
					System.out.println("HAPPY DAY!");
				}
				break;
			case 3:
				System.out.println("ENTER THE ACC.NO OF THE PERSON: ");
				int acp=sc.nextInt();
				System.out.println("ENTER THE IFSC CODE: ");
				int ifsc=sc.nextInt();
				System.out.println("ENTER THE USERNAME: ");
				int un=sc.nextInt();
				System.out.println("ENTER AMOUNT TO TRANSFER: ");
				tr=sc.nextInt();
				
				if(tr>bal )
				{
					System.out.println("--------------------------------");
					System.out.println("INSUFFICIENT BALANCE");
				}
				else if(tr<1000)
				{
					System.out.println("ATLEAST TRANSFER 1000rs");
				}
				else if(tr>10000)
				{
					System.out.println();
				}
				else if(tr<=bal && tr>=1000 && tr<=10000)
				{
					bal=bal-tr;
					System.out.println("--------------------------------");
					System.out.println("AMOUNT HAS BEEN SUCESSFULLY TRANSFERRED");
				}
				break;
			case 4:
			{
				System.out.println("--------------------------------");
				System.out.println(" AVAILABLE ATM BALANCE IS: "+atmbal);
			}
			}
			
		}
	}

}













