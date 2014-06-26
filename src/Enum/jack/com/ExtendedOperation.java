package Enum.jack.com;

public enum ExtendedOperation implements OperationI {

	EXP("^") {public double apply(double x, double y) {return Math.pow(x, y);}
	}, 
	REMINDER("%") {public double apply(double x, double y) {return x % y;}
	};
	
	private final String symbol;
	ExtendedOperation(String symbol){
		this.symbol=symbol;
	}
	public String toString(){
		return symbol;
	}

}
