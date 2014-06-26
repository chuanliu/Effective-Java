package Enum.jack.com;

public enum Operation {
	PLUS {double apply(double x, double y) {return x + y;}
	}, 
	MINUS {double apply(double x, double y) {return x - y;}
	}, 
	TIMES {double apply(double x, double y) {return x * y;}
	}, 
	DIVIDE {double apply(double x, double y) {return x / y;	}
	};
	
	//Each Enum must implementation the apply.
	abstract double apply(double x, double y);
	

}