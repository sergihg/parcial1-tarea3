public class Main {
    public static void main(String[] args) {

        int operationIndex = 0;
        do {
            String operation = args[operationIndex];
            int parameter1 = Integer.parseInt(args[operationIndex + 1]);
            int parameter2 = Integer.parseInt(args[operationIndex + 2]);
            switch (operation) {
                case "SUMA":
                    System.out.println(parameter1 + " + " + parameter2 + " = " + (parameter1 + parameter2));
                    break;
                case "RESTA":
                    System.out.println(parameter1 + " - " + parameter2 + " = " + (parameter1 - parameter2));
                    break;
                case "MULTIPLICACION":
                    System.out.println(parameter1 + " * " + parameter2 + " = " + (parameter1 * parameter2));
                    break;
                case "DIVISION":
                    System.out.println(parameter1 + " / " + parameter2 + " = " + (parameter1 / parameter2));
                    break;
            }
            operationIndex+=3;
        }while(operationIndex< args.length);
    }
}