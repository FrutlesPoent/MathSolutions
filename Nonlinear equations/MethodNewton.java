public class MethodNewton extends FunctionHelper {

    public static void methodNewton(double a, double b) throws Exception{
        FunctionHelper func = new FunctionHelper();
        System.out.println("Newton: ");

        double cPast = 0, x0;

        if (func.function(a) * func.functionSecondDerived(a) > 0) {
            x0 = a;
        } else if (func.function(b) * func.functionSecondDerived(b) > 0){
            x0 = b;
        } else {
            throw ArithmeticException;
        }

        double c = x0;

        while (true) {
            c = c - func.function(c) / func.df(c);
            if (e >= c - cPast) {
                String str = String.format("Answer: %.4f", c);
                System.out.println(str);
                break;
            }
            cPast = c;
        }
    }
}
