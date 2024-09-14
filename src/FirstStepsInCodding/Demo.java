package FirstStepsInCodding;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        //1. Задължително използваме EN
        //2. camelCase -> започваме с малка буква и всяка следваща дума е с главна буква studentName, currentAge
        //3. Максимално описателна -> currentAge, studentName

/*
        int currentAge = Integer.parseInt(scanner.nextLine());

        double salary = Double.parseDouble(scanner.nextLine());*/

        char symbol = 'c';


        int number1 = 5;
        int number2 = 2;

        //1. Събиране ->
        int sum = number1 + number2;

        //2. Изваждане
        int result = number1 - number2;

        //3. Умножение
        int multiply = number1 * number2;

        //4. Деление
        int division = number1 / number2;

        //5. Деление с остатък
        int substitution = number1 % number2;


        System.out.println(substitution);





    }
}
