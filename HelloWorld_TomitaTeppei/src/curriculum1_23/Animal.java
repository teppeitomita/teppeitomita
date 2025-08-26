package curriculum1_23;

public class Animal {
	private String name;
	private double bodyLength;
	private int speed;

	public Animal(String name, double bodyLength, int speed) {
		this.name = name;
		this.bodyLength = bodyLength;
		this.speed = speed;
	}

	public String getName() {  //nameのgetter
		return this.name;
	}

	public void setName(String name) {  //nameのsettter
		this.name = name;
	}

	public double getBodyLength() {
		return this.bodyLength;
	}

	public void setBodyLength(double bodyLength) {
		this.bodyLength = bodyLength;
	}

	public int getSpeed() {
		return this.speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}

/*
	
	下記がコンソールに出力されるように作成してください
	※thisとsetterとgetterとフィールドを使ってください
	
	動物名：ライオン
	体長：2.1m
	速度：80km/h
	
*/