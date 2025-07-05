package curriculum_B;

import java.util.Scanner;

public class Qes1_3 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();

		if (input.length() <= 10) {
			System.out.println();
		} else {
			System.out.println("入力は10文字以内にしてください。");
			return;
		}
		if (input.length() == 0) {
			System.out.println("名前を入力してください");
			System.out.println(input);
			return;
		}
		if (input.matches("[0-9a-zA-Z]+")) {
			System.out.println(input);
		} else {
			System.out.println("半角英数以外の文字が含まれます。");
			return;
		}
		if (input.length() <= 10 && input.length() >= 0 && input.matches("[0-9a-zA-Z]+")) {
			System.out.println("ユーザー名" + (input) + "を登録しました");
		}

		String[] str = { "グー", "チョキ", "パー" };//グーが0,チョキが1,パーが2これをIF文で割り当てていく
		int count = 0;
		while (true) {
			int name = (int) (Math.random() * str.length);
			//自分の手
			int computer = (int) (Math.random() * str.length);
			//相手の手
			System.out.println(input + str[name]);
			System.out.println("computer: " + str[computer]);

			count++;
			if (name == computer) {
				System.out.println("DROW　あいこ　もう一回しましょう");
				continue;
			} else if (name == 1 && computer == 2) {
				System.out.println("俺の勝ち！　負けは次につながるチャンスです！　ネバーギブアップ！");//負け	
			} else if (name == 2 && computer == 0) {
				System.out.println("俺の勝ち！　たかがじゃんけん、そう思ってないですか？　それやったら次も俺が勝ちますよ"); //負け
			} else if (name == 0 && computer == 1) {
				System.out.println("俺の勝ち！　なんで負けたか、明日まで考えといてください。　そしたら何か見えてくるはず");//負け
			} else {
				System.out.println("やるやん。　次は俺にリベンジさせて");//それ以外勝ち
				break;
				}
			}
		System.out.println("勝つまでにかかった合計回数は" + count + "回です");
		}
}
