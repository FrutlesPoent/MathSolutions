public class MethodChord extends FunctionHelper {

    public static void methodChord(double a, double b) throws Exception{
        FunctionHelper func = new FunctionHelper();

        System.out.println("Chord ");

        if (func.function(a) * func.function(b) >= 0) {
            throw ArithmeticException;
        } else {
            double cPast = 0;
            while (true) {
                double c = (b * func.function(a) - a * func.function(b)) / (func.function(a) - func.function(b));
                if (func.function(a) * func.function(c) < 0) {
                    b = c;
                } else if (func.function(b) * func.function(c) < 0) {
                    a = c;
                }
                if (e >= c - cPast) {
                    String str = String.format("Answer %.4f", c);
                    System.out.println(str);
                    break;
                }
                cPast = c;
            }
        }
    }


}
