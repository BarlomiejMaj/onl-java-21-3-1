package loop;

public class AverageValue {
    public static void main(String[] args) {

        double argumentAverage = 0;

        for(int i = 0; i < args.length; i++){
            argumentAverage = argumentAverage + Integer.parseInt(args[i]);
        }
        System.out.println(argumentAverage / args.length);

    }
}
