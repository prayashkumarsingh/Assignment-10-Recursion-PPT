package in.ineuron.question6;

public class Question6 {
	public static void toH(int disks, int source, int auxiliary, int target) {
		if (disks > 0) {
			toH(disks - 1, source, target, auxiliary);
			System.out.println("Move disk " + disks + " from " + source + " —> " + target);
			toH(disks - 1, auxiliary, source, target);
		}
	}

	public static void main(String[] args) {
		int n = 2;
		toH(n, 1, 2, 3);
	}

}
