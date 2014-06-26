package Enum.jack.com;

public enum Operation1 {
	PLUS, MINUS, TIMES, DIVIDE, ADD;
	double apply(double x, double y) throws Exception {
		switch (this) {
		
		case PLUS:
			return  x + y;
		case MINUS:
			return x - y;
		case TIMES:
			return x * y;
		case DIVIDE:
			return x / y;
		}
		throw new Exception("Unknown op " + this );
	
	}
}

