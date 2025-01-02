package operators;

public class LogicalOpr {
	public static void main(String[] args) {
		System.out.println("*--- Logical AND(&&): ");
		System.out.println((10>5) && (2>1)); // Both true -> true. 					Output: true
		System.out.println((10>5) && (2<1)); // One true and One false -> false. 	Output: false
		System.out.println((10<5) && (2<1)); // Both false -> false. 				Output: false
		
		System.out.println("*--- Logical OR(||): ");
		System.out.println((10>5) || (2>1)); // Both true -> true.					Output: true
		System.out.println((10>5) || (2<1)); // One true and One false -> true.		Output: true
		System.out.println((10<5) || (2<1)); // Both false -> false.				Output: false
		
		System.out.println("*--- Logical NOT(!): ");
		System.out.println(!(10>5)); // true -> false.								Output: false
		System.out.println(!(10<5)); // false -> true.								Output: true
		
		
		
	}
}
