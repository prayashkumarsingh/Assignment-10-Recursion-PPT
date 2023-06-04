package in.ineuron.question2;

public class Question2 {
	public static int remaining(int n) {
		return n == 1 ? 1 : 2 * (1 + n / 2 - remaining(n / 2));
	}
	public static void main(String args[])
	{
		int n = 9;
		System.out.println(remaining(n));
	}

}
