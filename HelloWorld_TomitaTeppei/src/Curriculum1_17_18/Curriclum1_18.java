package Curriculum1_17_18;

import java.util.Random;

public class Curriclum1_18 {
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	public static void printTest(String text, int number) {
		System.out.println("Hello" + text + " " +number);
	}
	
	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	public static void printTest2(int a, int b) {
		System.out.println(a * b);
	}

		
	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	public static void printArray(int[] array) {
		for (int value : array) {
				System.out.println(value);
		}
}
			
	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	public static void printTest2(double a, double b) {
		System.out.println(a + b);
}
		
	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	public static int[] randomNumbers(int count) {
		Random rand = new Random();
		int[] numbers = new int[count];
		for (int i = 0; i < count; i++) {
				int num;
				do {
						num = rand.nextInt(100) + 1;
				} while (num == 0);
				numbers[i] = num;
				System.out.println(num);
		}
		return numbers;
}

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	public static double calculateAverage(int[] array) {
		double sum = 0;
		for (int value : array) {
				sum += value;
		}
		double average = sum / array.length;
		System.out.println("平均値: " + average);
		return average;
}
	
	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください

	public static boolean isAverageOver50(double average) {
		boolean result = average >= 50;
		System.out.println(result);
		return result;
}

	public static void main(String[] args) {
    // 作成したメソッドをここで呼び出してください
		//Q1
		printTest("JavaSE", 11);

		//Q2
		printTest2(3,4);

		//Q3
		int[] nums = {1, 2, 3, 4};
        printArray(nums);

		//Q4
		printTest2(1.1, 1.2);


		//Q5
		int[] randomNumbers = randomNumbers(5);

		//Q6
		double avg = calculateAverage(randomNumbers);

		//Q7
		isAverageOver50(avg);
		
		printTest2(10,10);

			}
}
