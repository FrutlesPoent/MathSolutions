import java.util.Scanner;

public class InputHelper {

    private static final int max = 3;

    private static int getRandom(){
        return (int)(Math.random() * max);
    }

    public double manualInput(String type){
        System.out.println("Input");

        Scanner in = new Scanner(System.in);

        if (type.equals("double")){
            double a = in.nextDouble();
            return a;
        }
        if (type.equals("int")){
            int a = in.nextInt();
            return a;
        }
        return 0;
    }

    public double randomInput(){ // useless
        return (double) getRandom();
    }

}
