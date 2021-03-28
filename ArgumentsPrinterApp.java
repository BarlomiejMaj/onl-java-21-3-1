package loop;

public class ArgumentsPrinterApp {
    public static void main(String[] args) {

        //String[] arguments = {"AA", "BB", "CC", "DD"};
        for (int i = 0; i < args.length; i++){
            String arg = args[i];
            System.out.println(arg);

        }
    }
}
