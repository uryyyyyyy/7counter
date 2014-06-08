package sample;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader stdReader = new BufferedReader(new InputStreamReader(System.in));
		try {
			while (true) {
				String input = stdReader.readLine();
				if(input == null || input.equals("")){
					break;// terminate application
				}
				execute(input);
			}
		} catch (Exception e) {
			System.out.println("何かエラーがおきました。ログを確認してください");
			e.printStackTrace();
		}
	}

	public static void execute(String input) {
		final long startTime = System.currentTimeMillis();
		try{
			//convert
			System.out.print("入力値");
			System.out.println(input);
			int num = NumberFormatChecker.toInteger(input);

			//count
			Counter counter = new Counter();
			int result = counter.count(num);

			//output
			System.out.print("出力値");
			write(result);
		}catch(NumberFormatException e){
			//continue
			e.printStackTrace();
		}
		final long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime + "ms かかりました。");
	}
	
	private static void write(int num) {
				System.out.println(num);
	}
}
