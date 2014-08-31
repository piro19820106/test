package sample12;

/*
 * static修飾子のお勉強
 *
 */
public class Sample12_Human {

	static int humanCount = 0;
	String name;
	int birthday;
	int manpukudo;

	Sample12_Human(String name, int birthday, int manpukudo) {
		this.name = name;
		this.birthday = birthday;
		this.manpukudo = manpukudo;
		humanCount++;
	}

	public static void main(String[] args) {

		Sample12_Human human1 = new Sample12_Human("Hiroto", 19820106, 50);
		Sample12_Human human2 = new Sample12_Human("Toki", 19821111, 50);
		Sample12_Human human3 = new Sample12_Human("Ken", 19821212, 50);

		System.out.println(human1.name + ", " + human2.name + ", "
				+ human3.name);
		System.out.println("現在の人数は..." + Sample12_Human.humanCount);

	}

}
