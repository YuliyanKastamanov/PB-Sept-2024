package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class FruitOrVegetable_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String productName = scanner.nextLine();

/* •	Плодовете "fruit" са banana, apple, kiwi, cherry, lemon и grapes
•	Зеленчуците "vegetable" са tomato, cucumber, pepper и carrot
•	Всички останали са "unknown"*/

        switch (productName){

            case "banana", "apple", "kiwi", "cherry", "lemon", "grapes" -> System.out.println("fruit");
            case "tomato", "cucumber", "pepper", "carrot" -> System.out.println("vegetable");
            default -> System.out.println("unknown");

        }
    }
}
