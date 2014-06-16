package sample;

import java.util.ArrayList;
import java.util.List;

public class TargetNumberCounterImpl2 implements TargetNumberCounter{

	public long countTargetNumInInput(int input,  int tergetNum){
		long result = 0;
		List<FigureDigit> list = createFigureNumber(input);
		for(FigureDigit figureNumber: list){
			result += countTergetNumInFigure(input, tergetNum, figureNumber);
		}
		return result;
	}
	
	private List<FigureDigit> createFigureNumber(int input) {
		List<FigureDigit> list = new ArrayList<>();
		int inputLength = String.valueOf(input).length();
		for(int i=0; i < inputLength; i++){
			list.add(new FigureDigit(pow(i, 10), Integer.valueOf(String.valueOf(input).substring(inputLength-1 - i, inputLength - i))));
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

	private long countTergetNumInFigure(int input, int tergetNum, FigureDigit figureNumber) {
		if(figureNumber.getDigit() > tergetNum){
			return calc(input, figureNumber) + figureNumber.getFigure();
		}else if(figureNumber.getDigit() < tergetNum){
			return calc(input, figureNumber);
		}else{//number.getNumber() == tergetNum
			return calc(input, figureNumber) + (input%figureNumber.getFigure()+1);
		}
	}

	private int calc(int input, FigureDigit figureNumber) {
		return input/(figureNumber.getFigure()*10) * figureNumber.getFigure();
	}
}
