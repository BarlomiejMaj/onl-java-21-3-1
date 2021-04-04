package loop;

public class ArgumentsPrinter2App {
    public static void main(String[] args) {

        for (int i = args.length-1; i >= 0; i--) {
            String arg = args[i];
            System.out.println(arg);

        }
    }
}
