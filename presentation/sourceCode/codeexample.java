public class TestClass {

	public static void main(String[] args) {

    // assign first argument to string variable
		final String input = args[0];

		if (input.equals("A")) {
			System.out.println("Do some stuff");
		} else if (input.equals("B")) {
			System.out.println("Do different stuff");
		}
	}
}
