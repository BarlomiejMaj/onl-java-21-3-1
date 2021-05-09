package object;

public class BeerDemo {
    public static void main(String[] args) {

        Beer corona = new Beer("Corona", "Extra", 3.9, 4.5);
        Beer kozel = new Beer("Kozel", "Browarek", 4.66, 5.6);
        Beer carlsberg = new Beer("Carlsberg", "Lager", 5.2, 5.1);

        System.out.println(corona == kozel);
        System.out.println(corona.equals(carlsberg));
        System.out.println(kozel.equals(corona));
        System.out.println(corona.equals(corona));
        System.out.println(kozel == kozel);
        System.out.println(carlsberg.hashCode());
        System.out.println(kozel.hashCode());
        System.out.println(corona.hashCode());

    }
}
