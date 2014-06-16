package sample;

public class FigureDigit {
	private final int figure;
	private final int digit;
	
	public FigureDigit(int figure, int digit) {
		super();
		assert(figure%10 == 0);
		this.figure = figure;
		
		assert(digit/10 == 0);
		this.digit = digit;
	}

	public int getFigure() {
		return figure;
	}

	public int getDigit() {
		return digit;
	}

}
