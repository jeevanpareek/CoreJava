package patterns;

public class Pattern7 {
	public static void main(String[] args) {
		int rows = 4;
		int cols = 7;
		int thickness = 2;
		for(int row = 0; row<rows; row++) {
			for(int col = 0; col<cols; col++) {
				if(row==0||row==rows-1||col<thickness||col>=cols-thickness) {
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
