public class DoWhile {
	public static void main(String[] args){
		int temp = 28;
		do {
			temp--;
			System.out.println("温度を一度下げました。");
		} while (temp > 25); 
	System.out.println("終わります。" + temp);
	}
}

