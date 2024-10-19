package ExamPrep;

import java.util.Scanner;

public class EasterEggsBattle_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //прочитаме входните данни
        int countEggsFirstPlayer = Integer.parseInt(scanner.nextLine());
        int countEggsSecondPlayer = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        //докато не получим команда "End" или докато един от играчине не остане с 0 яйца
        while (!command.equals("End")) {
            // ако получим one -> първия играч печели и намаляме броя на яйцата на втория играч
            switch (command) {
                case "one" -> countEggsSecondPlayer--;
                case "two" -> countEggsFirstPlayer--;
            }
            //проверяваме и ако един от играчите остане без яйца прекратяваме програмата
            if(countEggsFirstPlayer == 0){
                System.out.printf("Player one is out of eggs. Player two has %d eggs left.", countEggsSecondPlayer);
                break;
            }else if(countEggsSecondPlayer == 0){
                System.out.printf("Player two is out of eggs. Player one has %d eggs left.", countEggsFirstPlayer);
                break;
            }

            //позволяваме на потребителя да въвежда -> one, two or End
            command = scanner.nextLine();
        }

        //ако получим команда End -> изписваме броя останали яйца на играч 1 и играч 2
        if(command.equals("End")){
            System.out.printf("Player one has %d eggs left.%n", countEggsFirstPlayer);
            System.out.printf("Player two has %d eggs left.", countEggsSecondPlayer);
        }


    }
}
