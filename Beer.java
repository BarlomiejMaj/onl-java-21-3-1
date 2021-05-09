package object;

public class Beer {
    private String name;
    private String type;
    private double alcoholAmount;
    private double volume;

    public Beer(String name, String type, double alcoholAmount, double volume){
        this.name = name;
        this.type = type;
        this.alcoholAmount = alcoholAmount;
        this.volume = volume;
    }

    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Beer)){
            return false;
        }
        Beer another = (Beer) obj;
        if(!name.equals(another.name)){
            return false;
        }
        if(!type.equals(another.type)){
            return false;
        }
        if(alcoholAmount != (another.alcoholAmount)){
            return false;
        }
        return volume == another.volume;
    }

    @Override
    public int hashCode(){
        return (int) (1234 * name.length() + type.charAt(0) * alcoholAmount);
    }
}
