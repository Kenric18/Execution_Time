public class Test {
	public static void main(String[] args) {
		RandomArray k = new RandomArray(100);
		System.out.println("Array before sort:");
		k.printArray();
		System.out.println(" ");
		k.sortArray();
		System.out.println("Array after sort");
		k.printArray();
		System.out.println(" ");
		System.out.println("Binary Search");
		int index = k.searchInteger(57);
		System.out.println(index);
	}
}