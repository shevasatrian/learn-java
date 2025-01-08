// Array, ArrayList

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Day02 {
    public static void main(String[] args) {
        // int[] arr = new int[5];
        // arr[0] = 1;
        // arr[1] = 2;
        // arr[2] = 3;
        // arr[3] = 4;
        // arr[4] = 5;

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }

        // ArrayList<String> motorbike = new ArrayList<>();
        // motorbike.add("Supra Bapak");
        // motorbike.add("Shogun Badak");
        // motorbike.add("Vespa Senja");

        // System.out.println(motorbike);
        // System.out.println(String.join(", ", motorbike));
        // System.out.println();

        // for (String bike : motorbike) {
        //     System.out.println(bike);
        // }

        // System.out.println();
        // motorbike.set(2, "Vixion jari-jari"); 

        // for (int i = 0; i < motorbike.size(); i++) {
        //     System.out.println(motorbike.get(i));
        // }

        // ArrayList<Integer> numbers = new ArrayList<>();
        // numbers.add(11);
        // numbers.add(12);
        // numbers.add(13);

        // for (Integer integer : numbers) {
        //     System.out.println(integer);
        // }
        // Integer totalInteger = 0;
        // for (int i = 0; i < numbers.size(); i++) {
        //     totalInteger += numbers.get(i);
        // }

        // System.out.println(totalInteger);
        // totalInteger = 0;
        // for (Integer integer : numbers) {
        //     totalInteger += integer;
        // }
        // System.out.println(totalInteger);

        // String nEscapeChar = "Pembekalan \nJava";
        // System.out.println(nEscapeChar);
        // String tEscapeChar = "Pembekalan\tJava";
        // System.out.println(tEscapeChar);
        // String escapeChar = "\"Football is simple. But playing simple football is the hardest thing to do. \nJohan Cruyff\"";
        // System.out.println(escapeChar);
        // String firstname = "Satrian";
        // String surname = "Sheva";
        // System.out.println(firstname + " " + surname);
        // System.out.println(firstname + "\r" + surname);

        // String str = "Pembekalan";
        // str.concat(" Java");
        // System.out.println("Nilai dari variable str adalah " + str);

        // Integer numInteger = 1;
        // String numStr = String.valueOf(numInteger);
        // System.out.println(numStr.getClass());

        // String gigi = "tooth";
        // System.out.println();
        // System.out.println(gigi.replace('o', 'e'));
        // char[] toothChar= gigi.toCharArray();
        // toothChar[1] = 'e';
        // String newGigi = String.valueOf(toothChar);
        // System.out.println(newGigi);

        String xsis = "PT. Xsis Mitra Utama 12345678 !@#$%^&*";
        System.out.println(xsis.replaceAll("[A-Za-z]+", ""));
        System.out.println(xsis.replaceAll("[^A-Za-z ]", ""));
        System.out.println(xsis.replaceAll("[0-9]", ""));
        System.out.println(xsis.replaceAll("[^0-9]", ""));
        System.out.println(xsis.replaceAll("[^A-Za-z0-9 ]", ""));
        System.out.println(xsis.replaceAll("[A-Z&&[A-C]]", "Damn"));

        ArrayList<String> brands = new ArrayList<>();
        brands.add("asus");
        brands.add("acer");
        brands.add("lenovo");
        brands.add("msi");
        System.out.println(String.valueOf(brands));

        Map<String, String> responseMap = new HashMap<>();
        responseMap.put("status", "200");
        responseMap.put("message", "success");
        responseMap.put("data", "asus");
        System.out.println(responseMap);

    }
}
