package tasks_1_10;

import org.junit.Test;

/*
Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 */
public class Task2 {

	@Test
	public void test() {
		int n = 4000000;
		long result = 0, first = 1, second = 1, fibonacci = 1;

		while (fibonacci < n) {
			if (fibonacci % 2 == 0) {
				result += fibonacci;
			}

			first = second;
			second = fibonacci;
			fibonacci = first + second;
		}

		System.out.println("Result: " + result);
	}
}
