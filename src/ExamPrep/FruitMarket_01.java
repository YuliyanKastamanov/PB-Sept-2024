package ExamPrep;

import java.util.Scanner;

public class FruitMarket_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //Четем входнита данни
        //цената за килограм ягоди
        double strawberriesPrice = Double.parseDouble(scanner.nextLine());
        //количеството банани в килограми
        double bananaQuantity = Double.parseDouble(scanner.nextLine());
        //количество портокали в килограми
        double orangeQuantity = Double.parseDouble(scanner.nextLine());
        //количество малини в килограми
        double raspberriesQuantity = Double.parseDouble(scanner.nextLine());
        //количество ягоди в килограми
        double strawberriesQuantity = Double.parseDouble(scanner.nextLine());


        //крайната сума за ягодите
        double strawberriesSum = strawberriesPrice * strawberriesQuantity;

        //намираме цената на малините за килограм
        //•	цената на малините е на половина по-ниска от тази на ягодите;
        double raspberriesPricePerKg = strawberriesPrice / 2;

        //намираме цената на портокалите за килогра
        //•	цената на портокалите е с 40% по-ниска от цената на малините;
        double orangePricePerKg = raspberriesPricePerKg - raspberriesPricePerKg * 0.4;//raspberriesPricePerKg * 0.6

        //намираме цената на бананите за килограм
        //•	цената на бананите е с 80% по-ниска от цената на малините.
        double bananaPricePerKg = raspberriesPricePerKg - raspberriesPricePerKg * 0.8;//raspberriesPricePerKg * 0.2

        //крайната сума за малините
        double raspberriesSum = raspberriesPricePerKg * raspberriesQuantity;

        //крайната сума за портокалите
        double orangeSum = orangePricePerKg * orangeQuantity;

        //крайната сума за бананите
        double bananaSum = bananaPricePerKg * bananaQuantity;

        //намираме общата сума за продуктите
        double finalSum = strawberriesSum + raspberriesSum + orangeSum + bananaSum;

        System.out.printf("%.2f", finalSum);


    }
}
