package operators;

public class AssignmentsOpr {
	public static void main(String[] args) {

		int a;
		a = 2; // = simple assignment operator.
		System.out.println(a); // Output: 2
		
		a += 10; // (a = a+10) - compound assignment operator.
		System.out.println(a); // 2 + 10 = 10 - Output: 12 
		
		a -= 10; // (a = a-10) 
		System.out.println(a); // 12 - 10 = 2  Output: 2
	}
}
