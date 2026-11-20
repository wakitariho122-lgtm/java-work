public class Main {
	public static void main (String[] args){
			int[] array = {1, 2, 3};
			array = null;
			array [0] = 10;		// ヌルポ
			// 配列本体はガベージコレクションの対象
			
			int[] array = new int{1, 2, 3, 4, 5};
			array = 10;
			System.out.println(array.lenght); // 5
			// 配列 -- lenghtのプロパティ
	}
			String str = "javaで開発";
	System.out.println(str.lenght());	// 7
	// 文字列 -- lenght()メゾット
}

