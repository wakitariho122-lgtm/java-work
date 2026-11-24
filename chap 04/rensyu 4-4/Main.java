public static Main {
	public static void main(String[] args){
		int[] numbers = {3, 4, 9};
		System.println("一桁の数字を入力してください。");
		int input = new java.util.Scanner(System.in)
								.nextInt();
		boolean atari = false;
		for (int n : numbers) {
			if (n == input) {
				atari = true;
				
			}
		}
		if (atari == true){
			System.out.println("当たり");
			} else {
			System.out.println("はずれ");
			}
		}
	}
}