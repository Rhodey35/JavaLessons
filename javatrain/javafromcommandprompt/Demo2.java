import java.util.Scanner;

public class Demo2 {


public static void main(String[] args) {

	System.out.println("Well hello there, what\'s your name?");
	Scanner scan = new Scanner(System.in);
	String response = scan.nextLine();
	System.out.println("Well, it sure is nice to meet you " + response + ".\n");
}

}
