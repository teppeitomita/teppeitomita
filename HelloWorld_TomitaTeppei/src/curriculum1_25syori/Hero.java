package curriculum1_25syori;

import java.util.Random;

public class Hero extends Character {

	public Hero(String name) {
		super(name);
		status();
	}

	private void status() {
		Random rand = new Random();
		setHp(rand.nextInt(501) + 500);
		setMp(rand.nextInt(501) + 300);
		setAttack(rand.nextInt(301) + 100);
		setSpeed(rand.nextInt(601) + 300);
		setDefense(rand.nextInt(101) + 10);
	}

	public void showStatus() {
		System.out.println("こんにちは 「" + getName() + "」さん");
		System.out.println("ステータス");
		System.out.println("HP：" + getHp());
		System.out.println("MP：" + getMp());
		System.out.println("攻撃力：" + getAttack());
		System.out.println("素早さ：" + getSpeed());
		System.out.println("防御力：" + getDefense());
		System.out.println("さあ冒険に出かけよう！");
	}
}
