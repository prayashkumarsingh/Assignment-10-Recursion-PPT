package in.ineuron.question5;

public class Question5 {
	static boolean equality(String s) {
		return (s.charAt(0) == s.charAt(s.length() - 1));
	}

	static int countSubString(String s) {
		int result = 0;
		int n = s.length();
		for (int i = 0; i < n; i++)
			for (int len = 1; len <= n - i; len++)
				if (equality(s.substring(i, i + len)))
					result++;

		return result;
	}

	public static void main(String args[]) {
		String s = "aba";
		System.out.println(countSubString(s));
	}

}
