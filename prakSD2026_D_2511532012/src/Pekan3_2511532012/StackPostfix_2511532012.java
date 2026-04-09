package Pekan3_2511532012;
import java.util.Scanner;
import java.util.Stack;

public class StackPostfix_2511532012 {

	public static int postfixEvaluate (String expression) {
		Stack<Integer> s = new Stack<Integer> ();
		Scanner input_2012 = new Scanner (System.in);
		while (input_2012.hasNext()) {
			if (input_2012.hasNext()) {  //an operan (integer)
				s.push(input_2012.nextInt());
			} else {					//an operator
				String operator = input_2012.next();
				int operand2 = s.pop();
				int operand1 = s.pop();
				if (operator.equals("+")) {
					s.push(operand1 + operand2);
				} else if (operator.equals("-")) {
					s.push(operand1 - operand2);
				}else if (operator.equals("*")) {
					s.push(operand1 * operand2);
				}else {
					s.push(operand1 / operand2);
				}
			}
		}
		input_2012.close();
		return s.pop();
	}
	public static void main(String[] args) {
		System.out.println("Hasil postfix = " + postfixEvaluate ("5 2 4 * + 7 -"));
	}

}
