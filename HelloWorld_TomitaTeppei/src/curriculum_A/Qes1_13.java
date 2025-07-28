package curriculum_A;

public class Qes1_13 {
	public static void main(String[] args) {

		byte b;
		long l;
		int i;
		short s;
		double d;
		float f;
		String st;
		char c;
		boolean bo;

		b = 0;
		l = 0;
		i = 0;
		s = 0;
		d = 0.0d;
		f = 0.0f;
		st = null;
		c = '\u0000';
		bo = false;

		b = 10;
		l = 10000;
		i = 1000;
		s = 100;
		d = 10.5;
		f = 9.5f;
		st = "ハロー";
		c = 'a';
		bo = true;

		System.out.println(l + i + s + b);
		System.out.println(d + f);
		System.out.println(c + st + bo);
		System.out.println(l + i + s + b + d + f);
		System.out.println(l * b * s * i);
		System.out.println(d / s);
		System.out.println(b - s);

		System.out.println();

		int num = 20;
		int num1 = 23;
		System.out.println("ハローJAVA" + (num + num1));

		System.out.println();

		String name1 = "山田太郎";
		int age1 = 18;
		float height1 = 170.5f;
		float weight1 = 62.2f;
		String food1 = "寿司";

		System.out.println();

		System.out.println("初めまして" + name1 + "です");
		System.out.println("年齢は" + age1 + "歳です");
		System.out.println("身長は" + height1 + "cmです");
		System.out.println("体重は" + weight1 + "kgです");
		System.out.println("好きな食べ物は" + food1 + "です");

		System.out.println();
		
		float heightInMeter1 = height1 / 100.0f;
		float bmi1 = weight1 / (heightInMeter1 * heightInMeter1);

		System.out.println("BMIは" + bmi1 + "です");

		System.out.println();

		String name2 = "鈴木一郎";
		int age2 = 24;
		float height2 = 168.5f;
		float weight2 = 64.2f;
		String food2 = "オムライス";

		float heightInMeter2 = height2 / 100.0f;
		float bmi2 = weight2 / (heightInMeter2 * heightInMeter2);

		System.out.println();

		System.out.println("初めまして" + name2 + "です");
		System.out.println("年齢は" + age2 + "歳です");
		System.out.println("身長は" + height2 + "cmです");
		System.out.println("体重は" + weight2 + "kgです");
		System.out.println("好きな食べ物は" + food2 + "です");
		System.out.println("BMIは" + bmi2 + "です");

		System.out.println();
		
		age2  = age2*2;
		height2 = height2*2;
		weight2 = weight2*2;
		
		heightInMeter2 = height2 / 100.0f;
		bmi2 = weight2 / (heightInMeter2 * heightInMeter2);
		

		System.out.println("初めまして" + name2 + "です");
		System.out.println("年齢は" + age2 + "歳です");
		System.out.println("身長は" + height2 + "cmです");
		System.out.println("体重は" + weight2 + "kgです");
		System.out.println("好きな食べ物は" + food2 + "です");
		System.out.println("BMIは" + bmi2 + "です");

		System.out.println();

		System.out.println(age2 < 25);

		System.out.println();

		String ageStr = String.valueOf(age2);
		String heightStr = String.valueOf(height2);
		String weightStr = String.valueOf(weight2);

		System.out.println(ageStr);
		System.out.println(heightStr);
		System.out.println(weightStr);

		System.out.println();

		int ageInt = (int) Float.parseFloat(ageStr);
		int heightInt = (int) Float.parseFloat(heightStr);

		System.out.println(ageInt);
		System.out.println(heightInt);

		System.out.println();

		System.out.println(heightInt > 160 || ageInt > 25);

	}

}
