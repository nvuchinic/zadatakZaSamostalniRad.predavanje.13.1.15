package ba.bitcamp.homework.checkingParenthesis;
import java.util.Scanner;
/**
 * application that offers user to enter some mathematical expression(with various kinds of brackets or parenthesis).
 * It then checks if all that brackets(parenthesis) are properly closed
 * @author nermin.vucinic
 *
 */
public class CheckingBrackets {
	public static void main(String[] args) {
		char c;
		CharStack cs = new CharStack();
		Scanner in = new Scanner(System.in);
		String expression;
		System.out.println("Enter some mathematical expression:");
		expression = in.nextLine();
		in.close();
		for (int i = 0; i < expression.length(); i++) {
			c = expression.charAt(i);
			if (c == '(' || c == '[' || c == '{') {
				cs.push(c);
			} else {
				if (c == ')' && cs.peek() == '(') {
					cs.pop();
				}
				if (c == ']' && cs.peek() == '[') {
					cs.pop();
				}
				if (c == '}' && cs.peek() == '{') {
					cs.pop();
				}
			}
		}
		if (cs.isEmpty())
			System.out.println("Brackets are  balanced!");
		else
			System.out.println("Brackets are not balanced!");
	}
}
