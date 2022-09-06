class Pet {
	private String type; // 애완동물 종류
	private int age; // 애완동물 나이

	public void move() {
		System.out.println(this.type + "가 움직입니다.");
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setAge(int age) {
		this.age = age;
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
		Pet pet1 = new Pet();
		pet1.setType("강아지");
		pet1.setAge(8);

		Pet pet2 = new Pet();
		pet2.setType("고양이");
		pet2.setAge(14);

		pet1.move();
		pet2.move();

		System.out.println(pet1.getType() + "는 " + pet1.getAge() + "살 입니다.");
		System.out.println(pet2.getType() + "는 " + pet2.getAge() + "살 입니다.");

	}
}