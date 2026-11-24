public class Main {
	public static void printArray(int[] array){
		for (int i = 0; i < array.length; i++){
			array[i]++;
		}
	}
	
	public static void main(String[] args){
		int[]  array = {1, 2, 3};
		incArray(array);
		for (int n : array){
			System.out.println(n + " ");
		}
		System.out.println();
	}
	
}