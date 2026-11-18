public class Main {
	public static void main(String[] args){
		
		System.out.println("ようこそ占いの館へ");
		
		System.out.print("あなたの名前を入力してください。");
		String name = new java .util.Scanner(System.in,
			 "Shift_JIS").nextLine();
		System.out.println(name);

		System.out.println("年齢を入力してください。);
		System ageString = new java .util.Scanner(System.in)
			.nextLine();
		int age = integer.parsseInt(ageString);
		
		int fortue = new jave.util.Ramdom().nextInt(4);
		System.out.println(fortune);
		fortune++;
		
		System.out.println("占いの結果が出ました。");
		
		System.out.println
			(age + "歳の" + name + "さん" + 
				"あなたの運気番号は" + fortune + "1です。");

		System.out.println
			("1 :大吉 2:中吉 3:小吉 4:凶  ");
	}
}


