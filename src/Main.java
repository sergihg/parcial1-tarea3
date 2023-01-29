public class Main {
    public static void main(String[] args) {

        int operationIndex = 0;
        do {
            String operation = args[operationIndex];
            int parameter1 = Integer.parseInt(args[operationIndex + 1]);
            int parameter2 = Integer.parseInt(args[operationIndex + 2]);
            switch (operation) {
                case "SUMA" -> System.out.println(parameter1 + " + " + parameter2 + " = " + (parameter1 + parameter2));
                case "RESTA" -> System.out.println(parameter1 + " - " + parameter2 + " = " + (parameter1 - parameter2));
                case "MULTIPLICACION" ->
                        System.out.println(parameter1 + " * " + parameter2 + " = " + (parameter1 * parameter2));
                case "DIVISION" ->
                        System.out.println(parameter1 + " / " + parameter2 + " = " + (parameter1 / parameter2));
            }
            operationIndex+=3;
        }while(operationIndex< args.length);
    }
}