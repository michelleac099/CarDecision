import java.util.Scanner;

public class CarCostCalculation {

	public static void main(String[] args) {
		
		int yearOne = 1;
		int yearTwo = 2;
		int yearThree = 3;
		int yearFour = 4;
		int yearFive = 5;
		
		
		Scanner enter = new Scanner(System.in);
		
		System.out.print("Enter the cost of the normal car: ");
		double normalCarCost = enter.nextDouble();
		
		System.out.print("Enter the miles per gallon of the normal car: ");
		double mpgNormalCar = enter.nextDouble();
		
		System.out.print("Enter the cost of the hybrid car: ");
		double hybridCarCost = enter.nextDouble();
		
		System.out.print("Enter the miles per gallon of the normal car: ");
		double mpgHybridCar = enter.nextDouble();
		
		System.out.print("Enter the number of miles traveled in a year: ");
		double oneYearMiles = enter.nextDouble();
		
		System.out.print("Enter the cost per gallon of gas:");
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
		System.out.println("Cost to own after year " + yearOne + " for regular car: " + normalCostYrOne + ", for hybrid car: " + hybridCostYrOne);
		System.out.println("Cost to own after year " + yearTwo + " for regular car: " + normalCostYrTwo + ", for hybrid car: " + hybridCostYrTwo);
		System.out.println("Cost to own after year " + yearThree + " for regular car: " + normalCostYrThree + ", for hybrid car: " + hybridCostYrThree);
		System.out.println("Cost to own after year " + yearFour + " for regular car: " + normalCostYrFour + ", for hybrid car: " + hybridCostYrFour);
		System.out.println("Cost to own after year " + yearFive + " for regular car: " + normalCostYrFive + ", for hybrid car: " + hybridCostYrFive);
				
		//Finding out which car pays back after 5 years
		
		
		
	} //class

} //main
