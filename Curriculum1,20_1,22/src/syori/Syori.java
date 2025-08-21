package syori;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Syori {
	String where;
	String taste;
	String food;
	String formattedDateTime;
	
	public Syori() {
		this.where = "日本";
		this.taste = "うまい";
		this.food = "和食";
		
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s");
		this.formattedDateTime = now.format(formatter);

	}
	
	public void showInfo(String specificFood) {
		System.out.println("こんにちは！ここは" + this.where + "です！");
        System.out.println("この" + specificFood + "は" + this.taste);
        System.out.println(specificFood + "は" + this.food + "です");
        System.out.println("今の現在日時は" + this.formattedDateTime + "です");
	}

}
/*

下記がコンソールに出力されるように作成してください

	こんにちは！ここは日本です！
	この寿司はうまい
	寿司は和食です
	今の現在日時は2023/03/09 10:23:39です

【条件】
	・JavaProjectを新規作成し、実行用のpackageと処理用のpackageを作成してください。
	・適切なファイルにフィールドで変数を必要な数作ってください。
	・thisを使って作成してください。
	・日時は今日の日付を取得してください。
	
*/