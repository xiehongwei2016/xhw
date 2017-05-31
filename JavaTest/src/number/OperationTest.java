package number;

public class OperationTest {

	public static void main(String[] args) {
		
		System.out.println(0.06 + 0.01);
		System.out.println(1.0 - 0.42);
		System.out.println(4.015 * 100);
		System.out.println(303.1 / 1000);
		
		Arith arith = new Arith();
		System.out.println(Arith.add(0.06, 0.01));
		
	}
}
