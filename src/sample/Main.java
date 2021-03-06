package sample;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader stdReader = new BufferedReader(new InputStreamReader(System.in));
		try {
			String input = stdReader.readLine();
			execute(input);
		} catch (Exception e) {
			System.out.println("some error happend. check logs");
			e.printStackTrace();
		}
	}

	public static void execute(String input) {
		final long startTime = System.currentTimeMillis();
		try{
			//convert
			System.out.print("input value:");
			System.out.println(input);
			final int num = Integer.valueOf(input);
			
			TargetNumberCounter counter = new TargetNumberCounterFactory().createTargetNumberCounter();

			//count
			final long result = counter.countTargetNumInInput(num, 7);
			
			//output
			System.out.print("output value:");
			write(result);
		}catch(NumberFormatException e){
			e.printStackTrace();
		}
		final long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime + "ms done.");
	}

	private static void write(long num) {
		System.out.println(num);
	}
}
