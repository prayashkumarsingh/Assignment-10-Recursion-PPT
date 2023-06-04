package in.ineuron.question4;

public class Question4 {
	private static int length(String str)
    {
        if (str.equals(""))
            return 0;
        else
            return length(str.substring(1)) + 1;
    }
    public static void main(String[] args)
    {
        String str ="abcd";
        System.out.println(length(str));
    }

}
