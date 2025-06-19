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
		
		System.out.println(l+i+s+b);
		System.out.println(d+f);
		System.out.println(c+st+bo);
		System.out.println(l+i+s+b+d+f);
		System.out.println(l*b*s*i);
		System.out.println(d/s);
		System.out.println(b-s);
		
		System.out.println();
		
		int num=20;
		int num1=23;
		System.out.println("ハローJAVA"+(num+num1));
		
		System.out.println();
		
		String name="山田太郎";
		int age=18;
		float height=170.5f;
		float weight=62.2f;
		String food="寿司";
		
		System.out.println();
		
		System.out.println("初めまして"+name+"です");
		System.out.println("年齢は"+age+"歳です");
		System.out.println("身長は"+height+"cmです");
		System.out.println("体重は"+weight+"kgです");
		System.out.println("好きな食べ物は"+food+"です");
		
		System.out.println();
		
		System.out.println("BMIは"+(height+height)/weight+"です");
		
		System.out.println();
		
		name="鈴木一郎";
		age=24;
		height=168.5f;
		weight=64.2f;
		food="オムライス";
		float bmi=22.6f;
		
		System.out.println();
		
		System.out.println("初めまして"+name+"です");
		System.out.println("年齢は"+age+"歳です");
		System.out.println("身長は"+height+"cmです");
		System.out.println("体重は"+weight+"kgです");
		System.out.println("好きな食べ物は"+food+"です");
		System.out.println("BMIは"+bmi+"です");
		
		System.out.println();
		
		System.out.println("初めまして"+name+"です");
		System.out.println("年齢は"+(age*2)+"歳です");
		System.out.println("身長は"+(height*2)+"cmです");
		System.out.println("体重は"+(weight*2)+"kgです");
		System.out.println("好きな食べ物は"+food+"です");
		System.out.println("BMIは"+(bmi/2)+"です");
		
		System.out.println();
		
		System.out.println(age<25);
		
		System.out.println();
		
		String ageStr = String.valueOf(age);
		String heightStr = String.valueOf(height);
		String weightStr = String.valueOf(weight);
		
		System.out.println(ageStr);
		System.out.println(heightStr);
		System.out.println(weightStr);
		
		System.out.println();
		
		int ageInt = (int) Float.parseFloat(ageStr);
        int heightInt = (int) Float.parseFloat(heightStr);

        System.out.println(ageInt);
        System.out.println(heightInt);
        
        System.out.println();
        
        System.out.println(heightInt>160 || ageInt>25);
        
        


	}

}
