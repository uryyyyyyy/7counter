package sample;

public class Counter {

	public static int count(int input){
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i<=input; i++){
			sb.append(i);
		}
		int total = sb.toString().length();
		int reduce = sb.toString().replace("7", "").length();
		return total - reduce;
	}
}
