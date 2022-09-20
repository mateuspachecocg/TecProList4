package solutions;

public class Question03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vtr[] = { 1, 3, 4, 7, 8, 9, -45, -64, 54, 90, 12, 55, 11, -3};
		showTipeOfNumber(vtr);
		
		System.out.println();
	}
	
	public static int[][] showTipeOfNumber(int vtr[]) {
		// TODO Show if the number positive negative, multiple of two and three.
		
		int vtrPosMult3[]    = new int[vtr.length];
		int vtrPosNotMult3[] = new int[vtr.length];
		int vtrNegMult3[]    = new int[vtr.length];
		int vtrNegNotMult3[] = new int[vtr.length];
		int indexPosMult3    = 0;
		int indexPosNotMult3 = 0;
		int indexNegMult3    = 0;
		int indexNegNotMult3 = 0;
		for (int number : vtr) {
			System.out.print("The number "+ number + " is ");
			if (number > 0) {
				System.out.print("positive, ");
			} else {
				System.out.print("negative, ");
			}
			
			if (number % 2 == 0) {
				System.out.print("multiple of 2, ");
			} else {
				System.out.print("NOT multiple of 2, ");
			}
			
			if (number % 3 == 0) {
				System.out.println("multiple of 3.");
				if (number > 0) {
					vtrPosMult3[indexPosMult3] = number;
					indexPosMult3++;
				} else {
					vtrNegMult3[indexNegMult3] = number;
					indexNegMult3++;
				}
			} else {
				System.out.println("NOT multiple of 3. ");
				if (number > 0) {
					vtrPosNotMult3[indexPosNotMult3] = number;
					indexPosNotMult3++;
				} else {
					vtrNegNotMult3[indexNegNotMult3] = number;
					indexNegNotMult3++;
				}
			}
		}
		int output[][] = new int[4][vtr.length];
		output[0] = vtrPosMult3;
		output[0] = vtrPosNotMult3;
		output[0] = vtrNegMult3;
		output[0] = vtrNegNotMult3;
		
		return output;
		
	}

	
	
}
