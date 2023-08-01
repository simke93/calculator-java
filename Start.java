import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		Simple_Test.testExpression(); // import and execute the test

		
		String Expression;
		boolean active = true;
		System.out.println("Enter expression here (type 'exit' to quit):");
		Scanner scanIn;
		
		while (active) {
			scanIn = new Scanner(System.in);
			Expression = scanIn.nextLine();

			if (Expression.equals("exit")) {
				scanIn.close();
				active = false;
			} else {
				System.out.println(Calculator.Run(Expression));
			}

		}

	}

}