package operators;

public class IncrementDecrementOpr { // *-- Pre-Post Increment/Decrement. ---*
	public static void main(String[] args) {
		int a = 2;
		int b = 8;
		int c = 4;
		int d = 6;
		System.out.println("*----- Pre-Post Increment -----* ");
		System.out.println("Post Increment: " + a++); // a = 2 then a + 1 = 3. First it will print 2 then 1 plus. output: 2
		System.out.println(a); // Now it will print 3 after 1 plus. output: 3
		System.out.println("Pre Increment: " + ++b); // b + 1 = 9 then b = 9. first it will add 1 to b then prints the value of b. output: 9
		System.out.println(b); // Output: 9
		
		System.out.println("*----- Pre-Post Decrement -----* ");
		System.out.println("Post Decrement: " + c--); // c = 4 then c - 1 = 3. First it will print 4 then 1 minus. output: 4
		System.out.println(c); // Now it will print 3 after 1 minus. output: 3
		System.out.println("Pre Decrement: " + --d); // d - 1 = 5 then d = 5. first it will minus 1 to d then prints the value of d. output: 5
		System.out.println(d); // Output: 5
	}
}

