package sample;

import java.util.ArrayList;
import java.util.List;

public class Counter2 implements Counter{

	public long countTergetNumInInput(int input,  int tergetNum){
		long result = 0;
		List<FigureNumber> list = createNumber(input);
		for(FigureNumber figureNumber: list){
			result += countTergetNumInFigure(input, tergetNum, figureNumber);
		}
		return result;
	}
	
	private List<FigureNumber> createNumber(int input) {
		List<FigureNumber> list = new ArrayList<>();
		int inputLength = String.valueOf(input).length();
		for(int i=0; i < inputLength; i++){
			list.add(new FigureNumber(pow(i, 10), Integer.valueOf(String.valueOf(input).substring(inputLength-1 - i, inputLength - i))));
		}
		return list;
	}

	private int pow(int figure, int digit) {
		int result = 1;
		for(int i=0; i < figure; i++){
			result *= digit;
		}
		return result;
	}

	private long countTergetNumInFigure(int input, int tergetNum, FigureNumber figureNumber) {
		if(figureNumber.getNumber() > tergetNum){
			return calc(input, figureNumber) + figureNumber.getFigure();
		}else if(figureNumber.getNumber() < tergetNum){
			return calc(input, figureNumber);
		}else{//number.getNumber() == tergetNum
			return calc(input, figureNumber) + (input%figureNumber.getFigure()+1);
		}
	}

	private int calc(int input, FigureNumber figureNumber) {
		return input/(figureNumber.getFigure()*10) * figureNumber.getFigure();
	}
}
