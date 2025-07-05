package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes5 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random rand = new Random();

		String[] name = { "パソコン", "冷蔵庫", "扇風機", "洗濯機", "加湿器", "テレビ", "ディスプレイ", "その他商品" };
		int[] left = new int[name.length];

		for (int i = 0; i < name.length; i++) {
			left[i] = rand.nextInt(12);
		}

		System.out.println();
		String input = scanner.nextLine();
		String[] inputs = input.split("、");

		for (String item : inputs) {
			item = item.trim();

			switch (item) {
			case "パソコン":
				System.out.println("パソコンの残りの台数は" + left[0] + "台です");
				break;
			case "冷蔵庫":
				System.out.println("冷蔵庫の残りの台数は" + left[1] + "台です");
				break;
			case "扇風機":
				System.out.println("扇風機の残りの台数は" + left[2] + "台です");
				break;
			case "洗濯機":
				System.out.println("洗濯機の残りの台数は" + left[3] + "台です");
				break;
			case "加湿器":
				System.out.println("加湿器の残りの台数は" + left[4] + "台です");
				break;
			case "テレビ":
				System.out.println("テレビの残りの台数は" + left[5] + "台です");
				break;
			case "ディスプレイ":
				System.out.println("ディスプレイの残りの台数は" + (11 - left[6]) + "台です");
				break;
			case "その他商品":
				System.out.println("その他商品の残りの台数は" + left[7] + "台です");
				break;
			default:
				System.out.println("『" + item + "』は指定した商品ではありません");
				break;
			}
		}
		scanner.close();
	}
}