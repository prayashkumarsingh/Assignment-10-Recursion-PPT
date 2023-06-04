package in.ineuron.question1;

public class Question1 {
	public static boolean pOT(int n) {
	    return n > 0 && Math.pow(3, 19) % n == 0;
	  }
	public static void main(String args[])
	{
		int n = 27;
		System.out.println(pOT(n));
	}
	

}
