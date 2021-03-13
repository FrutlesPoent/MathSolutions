
public class Main {

    private static final String stringInt = "int";
    private static final String stringDouble = "double";
    private static final String[] restart = {"try", "again"};

    public static void main(String[] args) {

        System.out.println("Interval?: \n");
        System.out.println("Manual - 1\nAuto - 2\n");

        InputHelper input = new InputHelper();
        int chooseNumber = (int) input.manualInput(stringInt);

        if (chooseNumber == 1){
            System.out.println("Input coordinates");
            double x = input.manualInput(stringDouble);
            double y = input.manualInput(stringDouble);
            run(x,y);

        } else if (chooseNumber == 2){
            double x = input.randomInput();
            double y = input.randomInput();
            run(x,y);
        } else {
            System.out.println("Error, wrong choose\n try again\n");
            main(restart);
        }
    }

    public static void run(double x, double y){
        try {
            MethodBis.methodBisekciy(x, y);
            MethodChord.methodChord(x, y);
            MethodNewton.methodNewton(x, y);
        } catch (Exception ex) {
            System.out.println("ERROR!");
        }
    }
}

