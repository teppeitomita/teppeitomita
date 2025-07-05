package curriculum_B;

public class Qes4 {
	public static void main(String[] args) {

		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				String left = String.format("%02d", num[i]);
				String right = String.format("%02d", num[j]);
				String result = String.format("%02d", num[i] * num[j]);
				System.out.print(left + "×" + right + "=" + result + " || ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		int[] num1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		for (int i = 0; i < num1.length; i++) {
			for (int j = 0; j < num1.length; j++) {
				String left = String.format("%03d", num1[i]);
				String right = String.format("%03d", num1[j]);
				String result = String.format("%03d", num1[i] * num1[j]);
				System.out.print(left + "×" + right + "=" + result + " || ");
			}
			System.out.println();
		}
	}
}