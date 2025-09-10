package module1._3expressions;

import java.util.Scanner;

public class E11PizzaCalculatorInput {
	
	//Exercise 11: Add code to complete the program according to the flow chart given here:
	
	//https://131text.com/ns/books/published/csjava/Module1-Types-and-Names/topic-1-4-assignment.html#storing-user-input-in-variables
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many slices of pizza?");
        int pizzaSlice = scan.nextInt();
        System.out.println ("How many people are there ?");
        int numPeople = scan.nextInt();

        int slicesPerPerson = (pizzaSlice / numPeople);
        int leftoverSlices = (pizzaSlice % numPeople);

        System.out.println ("The total slices per person is " + slicesPerPerson );
        System.out.println ("The remaining number of pizza slices are " + leftoverSlices );
        
    //add code to initialize pizzaSlices and numPeople from user input 
        
        
        //add code to compute and print slicesPerPerson and leftoverSlices
       

    }


}
