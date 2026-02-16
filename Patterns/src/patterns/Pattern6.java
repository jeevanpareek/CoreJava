package patterns;

public class Pattern6 {
	public static void main(String[] args) {
		int a=5;
		int b=15;
		for(int row = 0; row<a; row++) {
			for(int col = 0;col<b;col++) {
				if(row==0||col==0||row==a-1||col==b-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
