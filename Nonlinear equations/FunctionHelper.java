public class FunctionHelper {

    protected static final double e = 0.0001;
    protected static Exception ArithmeticException;

    protected double function(double x) { // your function
        return Math.pow(x, 2) - 3;
    }

    protected double functionDerived(double x) { // your functions but it's derived
        return x *= 2;
    }

    protected double functionSecondDerived(double x) { // double derive
        return 2;
    }

    protected static double df(double x) {
        FunctionHelper func = new FunctionHelper();
        return (func.function(x + e) - func.function(x)) / e;
    }
}
