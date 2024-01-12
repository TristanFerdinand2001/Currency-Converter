import java.util.Scanner;
public class Program{
	public static void main(String[] args){
	Scanner keyboard = new Scanner(System.in);
		
	// Declaring Variables
	double pound;
	double total;
	double selectedC;
	double dollar;		
	double euro;		
	double bitcoin;
	double rupee;
	int answer;
	
	
	//Assigning attributes
	pound = 1;
	dollar = 1.39;
	euro = 1.15;
	bitcoin = 0.000028;
	rupee = 104.4;
	answer = 1;
		
    //Questions
	do
	try {	
	System.out.println("Welcome to the Currency Converter Program");
	System.out.println("How many pounds would you like to convert?");
	pound = keyboard.nextDouble();
	System.out.println("Which currency would you like to convert it to?");
	System.out.println("1.Dollar  2.Euro  3.Bitcoin  4.Rupee");
	selectedC = keyboard.nextInt();
		
	//Calculations
	 if(selectedC == 1){
	 System.out.println(pound * dollar);}
	 
	if(selectedC == 2){
	 System.out.println(pound * euro);}
	 
	if(selectedC == 3){
	System.out.println(pound * bitcoin);}
	
	if(selectedC == 4){
	System.out.println(pound * rupee);}
	 
	total = selectedC;
	
	
	//Repeat?
	System.out.println("Do you want to convert anymore currency?");
	System.out.println("1.Yes  2.No");
	answer = keyboard.nextInt();
	}
	catch (Exception e) {
	System.out.println("You cannot do that!");
	
	
}
	//End Message
	while (answer == 1);
	System.out.println ("Thank you for using the Currency Converter!");
	 
	}

}
	
	
	
	
	
	
	
	
	