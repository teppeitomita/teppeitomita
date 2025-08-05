package curriclum1_19_question;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Animal {

	public static void main(String[] args) {
		Dog dog = new Dog();
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		System.out.println("名前:" + dog.name);
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		System.out.println("数:" + dog.count);
		// Q3：現在の日時を「yyyy-MM-dd H:m:s」形式で出力
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s");
		String formattedDateTime = now.format(formatter);
		System.out.println("現在の日時: " + formattedDateTime);
	}
}