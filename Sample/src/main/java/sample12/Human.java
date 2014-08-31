package sample12;

/*
 * static修飾子のお勉強
 *
 */
public class Human {

	static int humanCount = 0; // Humanクラスを代表する変数（人数）

	// それぞれHumanインスタンスが持つ個別の変数（名前，誕生日，満腹度）
	String name;
	int birthday;
	int manpukudo;

	Human(String name, int birthday, int manpukudo) {
		this.name = name;
		this.birthday = birthday;
		this.manpukudo = manpukudo;
		humanCount++; // Humanクラスのコンストラクタが呼ばれるたびにインクリメント
	}

	public static void main(String[] args) {

		Human human1 = new Human("Hiroto", 19820106, 50);
		Human human2 = new Human("Toki", 19821111, 50);
		Human human3 = new Human("Ken", 19821212, 50);

		System.out.println(human1.name + ", " + human2.name + ", "
				+ human3.name);
		System.out.println("現在の人数は..." + Human.humanCount);

	}

}
