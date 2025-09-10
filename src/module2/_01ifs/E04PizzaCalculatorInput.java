package module2._01ifs;

import java.util.Scanner;
public class E04PizzaCalculatorInput {

	//Exercise 4: Add a check to this program that skips
	//the computations if the number of people is less than
	//or equal to zero
    public static void main(String[] args) {
        int pizzaSlices, numPeople, slicesPerPerson, leftoverSlices;
        Scanner scan = new Scanner(System.in);
        System.out.println ("How many pizza slices are there");
        pizzaSlices = scan.nextInt();
        System.out.println("How Many People are there?");
        numPeople = scan.nextInt();
        
        if (numPeople<= 0){
            System.out.println("Count again bud!");
        }
        
        if (numPeople > 0) {
        slicesPerPerson = pizzaSlices / numPeople;
        leftoverSlices = pizzaSlices % numPeople;
        System.out.println("Every person gets " + slicesPerPerson + " slices");
        System.out.println("There are " +  leftoverSlices + " Slices ");
        }
        
        
    }

}
