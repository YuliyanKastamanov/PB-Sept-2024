package ForLoop;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 10;

        System.out.println(++number);// преинкрементация -> първо увеличаваме стойността на променливат с 1
        System.out.println(number++);// постинкрементация -> първо извършваме действието след това увеличаваме стойността на променливата с 1

        System.out.println(number);

        System.out.println(--number);// предекремнтация -> първо намаляме стойнотта на променливата с 1
        System.out.println(number--);// постдекрементация -> първо извършваме действието след това намаляме стойността на променливата с 1
        System.out.println(number);


        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);

        for (int iteration = 1; iteration <= 12; iteration++){

            System.out.println(iteration);

        }


        number = number + 3;

        number += 3;// number = number + 3


    }
}
