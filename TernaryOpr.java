package operators;

public class TernaryOpr { // *------ Ternary Operator/Conditional ------*
	static void twoVar() {
		int a = 2, b = 6, max;
		max = a > b ? a : b;
		System.out.println("Max is: " + max);
	}
	static void threeVar() {
		int a = 1, b = 2, c = 3, max;
		
		max = a>b ? a>c ? a:c:b>c ?b:c;
		System.out.println(max);
	}
	public static void main(String[] args) {
		twoVar();
		threeVar();
	}
}
