public class MeasureTime {
	public static void main(String[] args) {
		RandomArray n;
		int multiple;
		for (int i=1; i < 10; i++) {
			multiple = i * 100;
			int sum = 0;
			for (int k =0; k < 100000; k++) {
				long start_time = System.nanoTime();
				n = new RandomArray(multiple);
				long execution_time = System.nanoTime() - start_time;
				sum += execution_time;
			}
			int average = sum / 100000;
			System.out.println(average);
		}
	}
}