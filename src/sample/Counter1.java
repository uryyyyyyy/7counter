package sample;

public class Counter1 implements Counter{

	public long countTergetNumInInput(int input, int tergetNum){
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i<=input; i++){
			sb.append(i);
		}
		int totalLength = sb.toString().length();
		int reduceLength = sb.toString().replace(String.valueOf(tergetNum), "").length();
		return totalLength - reduceLength;
	}
}
