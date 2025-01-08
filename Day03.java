import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import javax.swing.text.DateFormatter;

public class Day03 {
    public static void main(String[] args) {
        // Scanner s = new Scanner(System.in);

        // System.out.print("Input the number : ");
        // Integer number = s.nextInt();
        // s.nextLine();
        // System.out.print("Input the text : ");
        // String str = s.nextLine();
        // System.out.print("Input the text : ");
        // String str2 = s.next();
        // System.out.println(str2);
        // s.nextLine();
        // System.out.print("Input the decimal : ");
        // float floatingPoint = s.nextFloat();
        // System.out.print("Input the decimal : ");
        // double doublePoint = s.nextDouble();

        // LocalDate today = LocalDate.now();
        LocalDateTime today = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("eeee dd-MM-yyyy hh:mm:ss a", Locale.forLanguageTag("id-ID"));
        System.out.println(formatter.format(today));
    }
}
