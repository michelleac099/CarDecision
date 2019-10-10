import java.util.Scanner;

public class CarCostCalculationSecondVersion {

	public static void main(String[] args) {
		
		int yearOne = 1;
		int yearTwo = 2;
		int yearThree = 3;
		int yearFour = 4;
		int yearFive = 5;
		
		String stickerHybrid = "Toyota,Prius,31000,30";
		String stickerRegular= "Toyota,Corolla,28000,20";
		String [] hybridStuff = stickerHybrid.split(",");
		String [] regularStuff = stickerRegular.split(",");
		
		int mpgNormalCar = Integer.parseInt(regularStuff[3]);
		int mpgHybridCar = Integer.parseInt(hybridStuff[3]);
		double normalCarCost = Integer.parseInt(regularStuff[2]);
		double hybridCarCost = Integer.parseInt(hybridStuff[2]);
		
		String regularMake = regularStuff[0];
		String hybridMake = hybridStuff[0];
		String regularModel = regularStuff[1];
		String hybridModel = hybridStuff[1];
		
		Scanner enter = new Scanner(System.in);
		
		System.out.print("Enter the number of miles traveled in a year: ");
		double oneYearMiles = enter.nextDouble();
		
		System.out.print("Enter the cost per gallon of gas: ");
		double costPerGasGallon = enter.nextDouble();
		
		/* 
		 * Gallons consumed by each car in a year = oneYearMiles / mpgCar
		 * Gas cost per year for each car = gallonsConsumed * costPerGasGallon
		 * Total car cost after x year is calculated by (gasCostPerYear * yearNumber) + initialCarCost
		 */
		
		double gallonsInOneYrNormal = oneYearMiles/mpgNormalCar;
		double gallonsInOneYrHybrid = oneYearMiles/mpgHybridCar;
		double gasCostPerYrNormal = gallonsInOneYrNormal * costPerGasGallon;
		double gasCostPerYrHybrid = gallonsInOneYrHybrid * costPerGasGallon;
		
		//Costs after each year for the normal car
		double normalCostYrOne = (gasCostPerYrNormal * yearOne) + normalCarCost; //1
		double normalCostYrTwo = (gasCostPerYrNormal * yearTwo) + normalCarCost; //2
		double normalCostYrThree = (gasCostPerYrNormal * yearThree) + normalCarCost; //3
		double normalCostYrFour = (gasCostPerYrNormal * yearFour) + normalCarCost; //4
		double normalCostYrFive = (gasCostPerYrNormal * yearFive) + normalCarCost; //5
		
		//Costs after each year for the hybrid car
		double hybridCostYrOne = (gasCostPerYrHybrid * yearOne) + hybridCarCost; //1
		double hybridCostYrTwo = (gasCostPerYrHybrid * yearTwo) + hybridCarCost; //2
		double hybridCostYrThree = (gasCostPerYrHybrid * yearThree) + hybridCarCost; //3
		double hybridCostYrFour = (gasCostPerYrHybrid * yearFour) + hybridCarCost; //4
		double hybridCostYrFive = (gasCostPerYrHybrid * yearFive) + hybridCarCost; //5
		
		//Announcing costs to the user
		System.out.println(" ");
		System.out.print("Cost to own " + regularMake + " " + regularModel + " " + "after year " + yearOne + ": ");
		System.out.printf("%.2f", normalCostYrOne);
		System.out.print(", for " + hybridMake + " " + hybridModel + ": ");
		System.out.printf("%.2f", hybridCostYrOne);
		System.out.println(" ");
		System.out.print("Cost to own " + regularMake + " " + regularModel + " " + "after year " + yearTwo + ": ");
		System.out.printf("%.2f", normalCostYrTwo);
		System.out.print(", for " + hybridMake + " " + hybridModel + ": ");
		System.out.printf("%.2f", hybridCostYrTwo);
		System.out.println(" ");
		System.out.print("Cost to own " + regularMake + " " + regularModel + " " + "after year " + yearThree + ": ");
		System.out.printf("%.2f", normalCostYrThree);
		System.out.print(", for " + hybridMake + " " + hybridModel + ": ");
		System.out.printf("%.2f", hybridCostYrThree);
		System.out.println(" ");
		System.out.print("Cost to own " + regularMake + " " + regularModel + " " + "after year " + yearFour + ": ");
		System.out.printf("%.2f", normalCostYrFour);
		System.out.print(", for " + hybridMake + " " + hybridModel + ": ");
		System.out.printf("%.2f", hybridCostYrFour);
		System.out.println(" ");
		System.out.print("Cost to own " + regularMake + " " + regularModel + " " + "after year " + yearFive + ": ");
		System.out.printf("%.2f", normalCostYrFive);
		System.out.print(", for " + hybridMake + " " + hybridModel + ": ");
		System.out.printf("%.2f", hybridCostYrFive);
		System.out.println(" ");
				
		//Finding out which car pays back after 5 years 
		if (normalCostYrFive<hybridCostYrFive) {
			System.out.println("The " + regularMake + " " + regularModel + " " + "pays back after 5 years.");}
		else if (normalCostYrFive>hybridCostYrFive) {
			System.out.println("The " + hybridMake + " " + hybridModel + " " + "pays back after 5 years.");}
		else {
			System.out.println("Both cars have the same cost after 5 years.");}
		
		
	} //class

} //main
