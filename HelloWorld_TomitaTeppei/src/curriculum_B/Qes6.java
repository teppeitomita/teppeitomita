package curriculum_B;

import java.util.Scanner;

public class Qes6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("生徒の人数を入力してください（2以上）:");
		int student = scanner.nextInt();

		int[][] score = new int[student][4];
		String[] subjects = { "英語", "数学", "理科", "社会" };

		for (int i = 0; i < student; i++) {
			System.out.print((i + 1) + "人目の英語の点数を入力して下さい:");
			score[i][0] = scanner.nextInt();

			System.out.print((i + 1) + "人目の数学の点数を入力して下さい:");
			score[i][1] = scanner.nextInt();

			System.out.print((i + 1) + "人目の理科の点数を入力して下さい:");
			score[i][2] = scanner.nextInt();

			System.out.print((i + 1) + "人目の社会の点数を入力して下さい:");
			score[i][3] = scanner.nextInt();
		}
		System.out.println();

		for (int i = 0; i < student; i++) {
			int sum = 0;
			for (int j = 0; j < 4; j++) {
				sum += score[i][j];
			}
			double average = (double) sum / 4;
			System.out.printf("%d人目の平均点: %.2f点\n", i + 1, average);
		}

		System.out.println();

		for (int j = 0; j < 4; j++) {
			int sum = 0;
			for (int i = 0; i < student; i++) {
				sum += score[i][j];
			}
			double average = (double) sum / student;
			System.out.printf("%sの平均点: %.2f点\n", subjects[j], average);
		}
		scanner.close();
	}
}
