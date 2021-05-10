package enums;

public class DayOfWeekDemo {
    public static void main(String[] args) {


        printDayOfWeek(DayOfWeek.FRI);
        printDayOfWeek(DayOfWeek.SAT);


        DayOfWeek monday = DayOfWeek.fromEnglishName("Monday");
        System.out.printf("Check if predefined instance is the same as instance from English name: %s%n", monday == DayOfWeek.MON);

        DayOfWeek sroda = DayOfWeek.fromPolishName("Środa");
        System.out.printf("Check if predefined instance is the same as instance from Polish name: %s%n", sroda == DayOfWeek.WED);

//        DayOfWeek sroda2 = DayOfWeek.fromPolishName("środa");
//        System.out.printf("Check if predefined instance is the same as instance from Polish name: %s%n", sroda2 == DayOfWeek.WED);

        DayOfWeek sunday = DayOfWeek.isWeekend(true);
        System.out.printf("Sunday is working day? %s%n", sunday == DayOfWeek.SUN);


//        DayOfWeek weekend = DayOfWeek.getWeekends(true);
//        for(DayOfWeek dayOfWeek : DayOfWeek.values()){
//            System.out.print(dayOfWeek.name() + " ");
//        }

        for(DayOfWeek dayOfWeek : DayOfWeek.values()){
            if(!dayOfWeek.getWorkingDay())
                System.out.print(dayOfWeek.getEnglishName() + " ");
        }

        System.out.printf("%n===================%n");

        for(DayOfWeek dayOfWeek : DayOfWeek.values()){
            if(dayOfWeek.getWorkingDay())
                System.out.print(dayOfWeek.getEnglishName() + " ");
        }

    }




    private static void printDayOfWeek(DayOfWeek dayOfWeek){
        System.out.printf("%s - %s - is working day: %s%n", dayOfWeek.getEnglishName(), dayOfWeek.getPolishName(), dayOfWeek.getWorkingDay());
    }

}
