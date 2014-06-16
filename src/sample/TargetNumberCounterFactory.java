package sample;

public class TargetNumberCounterFactory {
	
	public TargetNumberCounter createTargetNumberCounter(){
		return new TargetNumberCounterImpl2();
	}
}
