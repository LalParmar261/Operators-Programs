package operators;

public class BitwiseAssignmentOpr {
	public static void main(String[] args) {
		int a = 12; // 1 1 0 0 in binary
		int b = 7; // 0 1 1 1 in binary
		int c = 5; // 000000101 in binary
		int d = 20; // 00010100 in binary
		// Bitwie AND & Assignment(&=)= a = a&b;
		//System.out.println(a &= b); // Output: 4 -- 0100 in binary
		
		// Bitwise OR | Assignment (|=)
//		System.out.println(a |= b ); // Output: 15 -- 1111 in binary
		
		//Bitwise XOR ^ Assignment (^=)
		System.out.println(a ^= b); // Output: 11 -- 1011 in binary
		
		// Left shift Assignment (<<=)
//		System.out.println(c <<= 2); // Output: 20 -- 00010100 in binary
		
		// Right Shift Assignment (>>=)
		System.out.println(d >>= 2); // Output: 5 -- 000000101 in binary
	}
}