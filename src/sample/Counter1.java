package sample;

public class Counter1 implements Counter{

	public long count(int input, int checkNum){
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i<=input; i++){
			sb.append(i);
		}
		int total = sb.toString().length();
		int reduce = sb.toString().replace(String.valueOf(checkNum), "").length();
		return total - reduce;
	}
}
