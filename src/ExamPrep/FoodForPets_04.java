package ExamPrep;

import java.util.Scanner;

public class FoodForPets_04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //прочитаме входните данни
        int countDays = Integer.parseInt(scanner.nextLine());
        double initialAmountFood = Double.parseDouble(scanner.nextLine());

        //създаваме променливи за всички необходими данни, които ще изчисляваме
        double biscuits = 0;
        int totalEatenFood = 0;
        int eatenDogFood = 0;
        int eatenCatFood = 0;

        //правим цикъл за броя дни, в които храним кучето и котката
        for (int i = 1; i <= countDays ; i++) {
            //прочитаме количество храна, което изяжда кучето и котката
            int currentDayEatenFoodByDog = Integer.parseInt(scanner.nextLine());
            int currentDayEatenFoodByCat = Integer.parseInt(scanner.nextLine());

            //добавяме изядената храна за деня към общото количество храна изядено от кучето и котката
            eatenDogFood += currentDayEatenFoodByDog;
            eatenCatFood += currentDayEatenFoodByCat;

            //при всеки 3-ти ден кучето и котката получават бисквитки, които са 10% от храната изядена за деня
            if(i % 3 == 0) {
                biscuits += (currentDayEatenFoodByDog + currentDayEatenFoodByCat) * 0.1;
            }

            //добавяме общо изядената храна за деня към общото количество изядена храна
            totalEatenFood += (currentDayEatenFoodByCat + currentDayEatenFoodByDog);

        }

        //изчисляваме общия процент изядена храна
        double percentEatenFood = totalEatenFood * 100/ initialAmountFood;

        //изчисляваме процента изядена храна от кучето
        double percentEatenFoodFromDog = eatenDogFood * 100.0 / totalEatenFood;

        //изчисляваме процента изядена храна от котката
        double percentEatenFoodFromCat = eatenCatFood * 100.0 / totalEatenFood;//100 - percentEatenFoodFromDog

        //принтираме •
        // "Total eaten biscuits: {количество изядени бисквитки}gr."
        System.out.printf("Total eaten biscuits: %dgr.%n", Math.round(biscuits));
        //•	"{процент изядена храна}% of the food has been eaten."
        System.out.printf("%.2f%% of the food has been eaten.%n", percentEatenFood);
        //•	"{процент изядена храна от кучето}% eaten from the dog."
        System.out.printf("%.2f%% eaten from the dog.%n", percentEatenFoodFromDog);
        //•	"{процент изядена храна от котката}% eaten from the cat."
        System.out.printf("%.2f%% eaten from the cat.", percentEatenFoodFromCat);





    }
}
