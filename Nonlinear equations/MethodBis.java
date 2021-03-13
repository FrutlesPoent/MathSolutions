public class MethodBis extends FunctionHelper {

    public static void methodBisekciy(double a, double b) throws Exception {
        FunctionHelper func = new FunctionHelper();
        System.out.println("Bisekciy: ");

        if (func.function(a) * func.function(b) >= 0) {
            throw ArithmeticException;
        } else {
            while (true) {
                double c = (a + b) / 2;
                if (func.function(a) * func.function(c) < 0) {
                    b = c;
                } else if (func.function(b) * func.function(c) < 0) {
                    a = c;
                }
                if (e < Math.abs(b - a)) {
                    continue;
                } else if (e >= Math.abs((b - a) / 2)) {
                    String str = String.format("Answer: %.4f", Math.abs((b + a) / 2));
                    System.out.println(str);
                    break;
                }
            }
        }
    }
}
