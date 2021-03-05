import java.util.*;

class myPow{

    final static int intSize = 2147483647;

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double number = in.nextDouble();
        int degree = in.nextInt();
        System.out.println(myPowFunction(number, degree));


    }

    public static double myPowFunction(double number, int degree){
        /* handle some exceptions
        */
        if (degree == 0) return 1; 
        if (number == 1) return 1;

        if (number == -1) {
            if (degree < 0){
                return 1;
           } else
                return -1;
    }
        if (degree > intSize)
            return 1;
        else if (degree < intSize *(-1))
            return 0;

        double multi = number; //this can be removed but i should change pow of pos numbers

        /* check degree if it's pos or neg
        */

        if ( degree > 0) {
            degree -= 1;
            while (degree > 0){
                number *= multi;
                degree -= 1;
            }

        }else if (degree < 0){
            int secDegree = degree *(-1);
            number /= myPowFunction(number, secDegree + 1);
        }

        return number;
}
}
