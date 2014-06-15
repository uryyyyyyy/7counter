package sample;

import java.util.ArrayList;
import java.util.List;

public class Counter2 implements Counter{

	public int count(int input,  int checkNum){
		int result = 0;
		List<Number> list = createNumber(input);
		for(Number number: list){
			result += count_(input, checkNum, number);
		}
		return result;
	}
	
	private List<Number> createNumber(int input) {
		List<Number> list = new ArrayList<>();
		int inputLength = String.valueOf(input).length();
		for(int i=0; i < inputLength; i++){
			list.add(new Number(pow(i), Integer.valueOf(String.valueOf(input).substring(inputLength-1 - i, inputLength - i))));
		}
		return list;
	}

	private int pow(int figure) {
		int result = 1;
		for(int i=0; i<figure; i++){
			result *=10;
		}
		return result;
	}

	private int count_(int input, int checkNum, Number number) {
		if(number.getNumber() > checkNum){
			return (input/(number.getFigure()*10) + 1)  * number.getFigure();
		}else if(number.getNumber() < checkNum){
			return input/(number.getFigure()*10) * number.getFigure();
		}else{
			return input/(number.getFigure()*10) * number.getFigure() + (input%number.getFigure()+1);
		}
	}
}
