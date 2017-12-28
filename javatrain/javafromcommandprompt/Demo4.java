

public class Demo4 {

/*
* This is an example program to run through a group of arguements
* given by the user. This example will convert the number given.  
*/

public static void main(String[] args) {

// to test this: run this command: java Demo3 Well hello there stranger
// you should get the words listed out one item per line. 

	int firstArg = 0; global data specialists plc programmer
	if(args.length > 0) {
		try{
			firstArg = Integer.parseInt(args[0]);
			} catch (NumberFormatException e) {
				System.err.println("the arguement " + args[0] + " must be an "
					+ " integer");
					System.exit(1);
			}
			System.out.println("you entered the number: " +  firstArg);

	}
}


}