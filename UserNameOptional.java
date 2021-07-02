package java8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;
import java.util.Optional;

public class UserNameOptional {
    public static void main(String[] args) throws ParseException {

        String userName;

        String text = "1999-01-01 00:00:00.0";
        Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S").parse(text);
        String shortDate = new SimpleDateFormat("yyyy-MM-dd").format(date);
        System.out.println(shortDate);


        Users nowak = new Users("Jan", "Nowak", null);
        Users kowalski = new Users("Robert", "Kowalski", "2001-01-01");


        System.out.println(kowalski);

        if (kowalski.getYearOfBirth() != null) {
            System.out.print("User: ");
            System.out.print(kowalski.getFirstName().toLowerCase(Locale.ROOT).charAt(0));
            System.out.print(kowalski.getLastName().toLowerCase(Locale.ROOT));
            System.out.print(kowalski.getYearOfBirth().substring(0, 4));
        } else {
            System.out.print("User: ");
            System.out.print(kowalski.getFirstName().toLowerCase(Locale.ROOT).charAt(0));
            System.out.print(kowalski.getLastName().toLowerCase(Locale.ROOT));
            System.out.println(2021);
        }

        System.out.println("");
        if (nowak.getYearOfBirth() != null) {
            System.out.print("User: ");
            System.out.print(nowak.getFirstName().toLowerCase(Locale.ROOT).charAt(0));
            System.out.print(nowak.getLastName().toLowerCase(Locale.ROOT));
            System.out.print(nowak.getYearOfBirth().substring(0, 4));
        } else {
            System.out.print("User: ");
            System.out.print(nowak.getFirstName().toLowerCase(Locale.ROOT).charAt(0));
            System.out.print(nowak.getLastName().toLowerCase(Locale.ROOT));
            System.out.print(2021);
        }
    }
}
