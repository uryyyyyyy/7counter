package sample;

public class Number {
	private final int figure;
	private final int number;
	
	public Number(int figure, int number) {
		super();
		assert(number%10 == 0);
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
