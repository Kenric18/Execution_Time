public class MeasureSortTime {
	public static void main(String[] args) {
		RandomArray n;
		int multiple;
		for (int i=1; i < 80; i++) {
			multiple = i * 10;
			int sum = 0;
			for (int k =0; k < 100000; k++) {
				n = new RandomArray(multiple);
				long start_time = System.nanoTime();
				n.sortArray();
				long execution_time = System.nanoTime() - start_time;
				sum += execution_time;
			//	n.printArray();
			}
			int average = sum / 100000;
			System.out.println(average);
		}
	}
}