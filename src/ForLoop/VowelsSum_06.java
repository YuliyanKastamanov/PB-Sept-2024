package ForLoop;

import java.util.Scanner;

public class VowelsSum_06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        //буква	    a	e	i	o	u
        //стойност	1	2	3	4	5

        int sum = 0;

        for (int i = 0; i < word.length(); i++) {

            char currentSymbol = word.charAt(i);
            //System.out.println(currentSymbol);

            switch (currentSymbol) {
                case 'a' -> sum += 1;
                case 'e' -> sum += 2;
                case 'i' -> sum += 3;
                case 'o' -> sum += 4;
                case 'u' -> sum += 5;
            }
        }

        System.out.println(sum);

    }
}
