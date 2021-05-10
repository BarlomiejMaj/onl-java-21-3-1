package enums;

public enum DayOfWeek {

    MON("Monday", "Poniedziałek", true),
    TUE("Tuesday", "Wtorek", true),
    WED("Wednesday", "Środa", true),
    THU("Thursday" , "Czwartek", true),
    FRI("Friday", "Piątek", true),
    SAT("Saturday", "Sobota", false),
    SUN("Sunday", "Niedziela", false);

    private final String englishName;
    private final String polishName;
    private final boolean workingDay;

    private DayOfWeek(String englishName, String polishName, boolean workingDay){
        this.englishName = englishName;
        this.polishName = polishName;
        this.workingDay = workingDay;
    }

    public String getEnglishName(){
        return englishName;
    }

    public String getPolishName(){
        return polishName;
    }

    public boolean getWorkingDay(){
        return workingDay;
    }

    public static DayOfWeek fromEnglishName(String englishName){
        for (DayOfWeek dayOfWeek : DayOfWeek.values()){
            if(dayOfWeek.englishName.equals(englishName)){
                return dayOfWeek;
            }
        }
        throw new IllegalArgumentException("Day of week with English name \"" + englishName + "\" does not exist!");
    }

    public static DayOfWeek fromPolishName(String polishName){
        for (DayOfWeek dayOfWeek : DayOfWeek.values()){
            if(dayOfWeek.polishName.equals(polishName)){
                return dayOfWeek;
            }
        }
        throw new IllegalArgumentException("Day of week with Polish name \"" + polishName + "\" does not exist!");
    }

    public static DayOfWeek isWeekend(boolean workingDay){
        for (DayOfWeek dayOfWeek : DayOfWeek.values()){
            if(dayOfWeek.workingDay == workingDay){
                return dayOfWeek;
            }
        }
        throw new IllegalArgumentException("Day of week with Polish name \"" + workingDay + "\" does not exist!");
    }

//    public static DayOfWeek getWeekends(){
//        for(DayOfWeek dayOfWeek : DayOfWeek.values()){
//            if(!dayOfWeek.getWorkingDay()){
//                System.out.println(dayOfWeek);
//            }
//    }



}
