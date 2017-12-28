import java.util.Scanner;

public class Demo5 {



public static void main(String[] args) {

// This is taking a string and an int arguement 
	 // this will take in the question that you will ask the user: 
	 // so enter: java Demo5 \"hello user: enter your name and age\"
	String response = args[0];
	System.out.println(response);
	String name;
	int age;
	Scanner scan = new Scanner(System.in);
	//System.out.println(\"Please enter your name: \");
	// a blank prompt will allow you to ender your name
	name = scan.nextLine();
	//System.out.println(\"Please enter your age: \");
	// a blank prompt will allow you to ender your age
	age = scan.nextInt();
	
	// after your two entries, you will see this output.
	System.out.println(\"\nWelcome \" + name + \", it is a nice day to be \" + age + \" years old, \"
			+ \"with the weather and all.\");

	}

}