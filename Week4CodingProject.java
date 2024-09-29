package week04;

import java.util.Scanner;

public class Week4CodingProject {
	
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		
		//1. 1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		//a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
		//b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).  
		//i. Make sure that there are 9 elements of type int in this new array.  
		//ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2). 
		//iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).
		//c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		//2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		//a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		//b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		//3. How do you access the last element of any array?
		//4. How do you access the first element of any array?
		//5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
		//6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		//7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
		//8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
		//9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		//10. Write a method that takes an array of double and returns the average of all the elements in the array.
		//11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
		//12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		//13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
		
		//1.
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		//a.
		int subtract = ages[ages.length - 1] - ages[0];
		System.out.println(subtract);
		//b.i.
		int[] ages2 = {2, 3, 5, 6, 8, 19, 28, 37, 43};
		//b.ii.
		int subtract2 = ages2[ages2.length - 1] - ages2[0];
		System.out.println(subtract2);
		//b.iii.
		int subtract3 = ages[1] - ages2[6];
		System.out.println(subtract3);
		//c
		int sum1 = 0;
		for (int age : ages2) {
			sum1 += age;
		}
		int average1 = sum1 / (ages2.length);
		System.out.println(average1);
		
		
		//2.
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		//a.
		int sum = 0;
		for (String name : names) {
			sum += name.length();
		}
		int average = sum / (names.length);
		System.out.println(average);
		//b.
		for (String name : names) {
			System.out.print(name + " ");
		}
			
		
		//3.
		//You can access the last element of any array by putting the array name and [] then subtracting the array length minus 1.
		//for example --> arrayName[arrayName.length - 1]
		
		//4.
		//You can access the first element of any array by putting the array name and [], then inside [] type 0.
		//for example --> arrayName[0]
			
		//5.
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		for (int name : nameLengths) {
		System.out.println(name);
		}
		
		//6.
		int sum2 = 0;
		for (int name : nameLengths) {
			sum2 += name;
		}
		System.out.println(sum2);
		
		//7. 
		System.out.println(repeatString("Hello", 3));
		
		//8.
		System.out.println(fullName("Jeff", "Bacon"));
		
		//9.
		System.out.println(arrayGreaterThanSum(ages2));
		
		//10.
		double[] dubNums = {24.32, 34.52, 12.35, 53.21, 64.16, 46.38};
		System.out.println(numbers(dubNums));
		
		//11.
		double[] loserNums = {34.31, 61.31, 21.53, 13.21, 1.34};
		System.out.println(compareTwoDoubleArrays(dubNums, loserNums));
		
		//12.
		boolean isHot1 = true;
		double money1 = 23.35;
		
		boolean isHot2 = false;
		double money2 = 13.00;
		
		boolean isHot3 = true;
		double money3 = 3.00;
		
		System.out.println(willBuyDrink(isHot1, money1));
		System.out.println(willBuyDrink(isHot2, money2));
		System.out.println(willBuyDrink(isHot3, money3));
		
		//13.
		String decision = suggestDecision();
		System.out.println(decision);
		
		scanner.close();
} //end of static void main
	
	//7 method.
	public static String repeatString(String word, int n) {

        String result = "";
        
        for (int i = 0; i < n; i++) {
            result += word;
        }
        
        return result;
    
    }
	
	//8 method.
	
	public static String fullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	
	//9 method.
	
	public static boolean arrayGreaterThanSum(int[] array) {
		int sum = 0;
		for (int num : array) {
			sum += num;
		}
		return sum > 100;
	}
	
	//10 method.
	public static double numbers(double[] array) {
		double sum = 0;
		for (double number : array) {
			sum += number;
		}
		double average = 0;
		average = sum / array.length;
		return average;
	}
	//11 method.
	public static boolean compareTwoDoubleArrays(double[] arr1, double[] arr2) {
		double sum1 = 0;
		double sum2 = 0;
		double average1 = 0;
		double average2 = 0;
		for (double num : arr1) {
			sum1 += num;
		}
		for (double num : arr2) {
			sum2 += num;
		}
			average1 = sum1 / arr1.length;
			average2 = sum2 / arr2.length;
		return average1 > average2;
	}
	//12 method.
	public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
		return isHotOutside && moneyInPocket > 10.50;
	}
	
	//13 method.
	public static String suggestDecision() {
			
			System.out.println("Please enter a number on a scale from 1 to 10 to describe your mood. 1 being a cruddy mood and 10 being a great, excited mood.");
			
			int mood = scanner.nextInt();
			
			if (mood < 1 || mood > 10) {
				return "Don't make this complicated.";
			}
				
		switch (mood) {
		case 1:
		case 2:	
			return "Consider going for a walk, working out or watching an uplifting movie or video.";
		case 3:
		case 4:
			return "Consider writing in a journal, listening to calming/uplifting music and studying for 30 minutes.";
		case 5:
			return "Consider journaling and making a list of priorities then do the first one.";
		case 6:
		case 7:
			return "Consider meeting with friends, and doing a fun activity. Don't forget to study!";
		case 8:
		case 9:
			return "You already made plans to meet with friends. Don't forget to study.";
		case 10:
			return "Do something adventurous today and cooldown by studying :)";
		default:
			return "";
							
		}//end of switch
		
	}//end of suggstDecision method
	
}//end of public class



