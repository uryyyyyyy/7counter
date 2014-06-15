package sample;

public class FigureNumber {
	private final int figure;
	private final int number;
	
	public FigureNumber(int figure, int number) {
		super();
		assert(figure%10 == 0);
		this.figure = figure;
		
		assert(number/10 == 0);
		this.number = number;
	}

	public int getFigure() {
		return figure;
	}

	public int getNumber() {
		return number;
	}

}
