import java.util.Scanner;

public class Vehicleparkproject {

	public static void main(String[] args) {
		
		//60 vehicle
		//total amount
		//whole record
		//5 ruppess for cycle
		//10 ruppess for bike
		// 20 ruppess for car
		
		Scanner sc =new Scanner(System.in);
		int amount =0; //20
		int count =0; //01
		int c =0;
		int b= 0;
		int  car=0;
		int user_input;
		while (true) {
			System.out.println("CHOOSE THE FOLLOWING");
			System.out.println("PRESS 1 FOR BICYCLE");
			System.out.println("PRESS 2 FOR BIKE");
			System.out.println("PRESS 3 FOR CAR");
			System.out.println("PRESS 4 TO SEE WHOLE RECORD");
			System.out.println("PRESS 5 TO DELETE WHOLE RECORD");
			
			user_input=sc.nextInt();
			
			if(user_input  ==1) {
				if (count <=60) { c++;
					amount=amount +5;count++;
					
			System.out.println("**************************************************************************************************");
			System.out.println("CYCLE ENTER SUCCESSFULLY");
			System.out.println("**************************************************************************************************");
				}else
				{
				System.out.println("NO MORE PARKING SPACE");
				}
			}else if (user_input ==2)
				{
					if (count <=60) { b++;
						amount=amount +10;count++;
						
				System.out.println("**********************************************************************************************");
				System.out.println("BIKE ENTER SUCCESSFULLY");
				System.out.println("***********************************************************************************************");
					}else
					{
					System.out.println("NO MORE PARKING SPACE");
					}
				}else if (user_input ==3){
					
						if (count <=60) {car++;
							amount=amount +20;count++;
							
					System.out.println("******************************************************************************************");
					System.out.println("CAR ENTER SUCCESSFULLY");
					System.out.println("******************************************************************************************");
						}else
						{
						System.out.println("NO MORE PARKING SPACE");
						}
					}else if (user_input ==4){
						System.out.println("**************************************************************************************");
						System.out.println("THE TOTAL AMOUNT IS : "+ amount);
						System.out.println("**************************************************************************************");
						System.out.println("TOTAL NUMBER OF VEHICLE: "+ count);
						System.out.println("**************************************************************************************");
						System.out.println("THE TOTAL AMOUNT IS : "+ amount);
						System.out.println("**************************************************************************************");
						System.out.println("TOTAL NUMBER OF CYCLE IS: "+ c);
						System.out.println("**************************************************************************************");
						System.out.println("TOTAL NUMBER OF BIKE IS : "+ b);
						System.out.println("**************************************************************************************");
						System.out.println("TOTAL NUMBER OF CAR IS : "+ car);
						System.out.println("**************************************************************************************");
						
					}
					else if(user_input ==5) {
						amount=0;
						count=0;
						
						System.out.println("**************************************************************************************");
						System.out.println("RECORD DELETED");
						System.out.println("**************************************************************************************");
					}
					else {
						System.out.println("**************************************************************************************");
						System.out.println("INVALID NUMBER");
						System.out.println("**************************************************************************************");
					}
	
				}
			}	
		}

