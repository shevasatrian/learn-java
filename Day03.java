import java.util.Scanner;

public class Day03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Input the number : ");
        Integer number = s.nextInt();
        s.nextLine();
        System.out.print("Input the text : ");
        String str = s.nextLine();
        System.out.print("Input the text : ");
        String str2 = s.next();
        System.out.println(str2);
        s.nextLine();
        System.out.print("Input the decimal : ");
        float floatingPoint = s.nextFloat();
        System.out.print("Input the decimal : ");
        double doublePoint = s.nextDouble();
    }
}
