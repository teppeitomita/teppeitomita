package curriculum1_25main;

import java.util.Scanner;

import curriculum1_25syori.Hero;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("名前を入力してください: ");
		String inputName = scanner.nextLine();

		Hero hero = new Hero(inputName);
		hero.showStatus();

		scanner.close();
	}
}