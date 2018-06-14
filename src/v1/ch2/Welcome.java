package v1.ch2;

public class Welcome {

	public static void main(String[] args) {
		String[] greeting = new String[3];
		greeting[0] = "Welcome to Core Java";
		greeting[1] = "by Cay Horstmann";
		greeting[2] = "by Cay Horstmann";
		for (String g : greeting) {
			System.out.println(g);
		}
	}
}
