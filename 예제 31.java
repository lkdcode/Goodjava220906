class Pet {
	private String type; // 애완동물 종류
	private int age; // 애완동물 나이
	static int count = 0; // 애완동물 수

	Pet(String type, int age) {
		this.type = type;
		this.age = age;
	}

	static int getCount() {
		return count;
	}

	public void move() {
		System.out.println(this.type + "가 움직입니다.");
	}

	public String getType() {
		return this.type;
	}

	public int getAge() {
		return this.age;
	}

}

public class Main {
	public static void main(String[] args) {
		Pet pet1 = new Pet("강아지", 5);
		Pet.count++;

		Pet pet2 = new Pet("고양이", 14);
		Pet.count++;

		pet1.move();
		pet2.move();

		System.out.println(pet1.getType() + "는 " + pet1.getAge() + "살 입니다.");
		System.out.println(pet2.getType() + "는 " + pet2.getAge() + "살 입니다.");
		
		System.out.println("현재 우리집 애완동물 수는 "+Pet.getCount()+"마리 입니다.");

	}
}