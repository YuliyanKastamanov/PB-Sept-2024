package ExamPrep;

import java.util.Scanner;

public class MovieDestination_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*1.	Бюджет на филма – реално число в диапазона [100 000.0… 2 000 000.0]
        2.	Дестинация – текст, с възможности "Dubai", "Sofia" и "London"
        3.	Сезон – текст, с възможности "Summer" и "Winter"
        4.	Брой дни  – цяло число в диапазона [1… 40]*/

        //прочитаме входните данни
        double budget = Double.parseDouble(scanner.nextLine());
        String destination = scanner.nextLine();
        String season = scanner.nextLine();
        int countDays = Integer.parseInt(scanner.nextLine());

/*
               Дестинация
        Сезон	Dubai	       Sofia	      London
        Winter	45 000 lv.  	17 000 lv.	   24 000 lv.
        Summer	40 000 lv.   	12 500 lv.	   20 250 lv.
*/

        double finalPrice = 0;
        boolean validDate = true;

        //в зависимост от дестинацият400000
        //Sofia
        //Winter
        //20а и сезонът определяме крайната цена за снимане на филма
        switch (destination){
            //ако получим от конзолата Дубай -> Winter	45 000 lv., Summer	40 000 lv.
            case "Dubai" -> {
                //правим проверка през кой сезон ще се снима филма
                if(season.equals("Winter")){
                    finalPrice = countDays * 45000;
                }else if(season.equals("Summer")){
                    finalPrice = countDays * 40000;
                }else {
                    validDate = false;
                }

                finalPrice *= 0.7;

            }
            //ако получим от конзолата София -> Winter	17 000 lv., Summer	12 500 lv.
            case "Sofia" -> {
            //правим проверка през кой сезон ще се снима филма
                if(season.equals("Winter")){
                    finalPrice = countDays * 17000;
                }else if(season.equals("Summer")){
                    finalPrice = countDays * 12500;
                }else {
                    validDate = false;
                }
                finalPrice *= 1.25;

            }
            //ако получим от конзолата Лондон -> Winter	24 000 lv., Summer	20 250 lv.
            case "London" ->{

                if(season.equals("Winter")){
                    finalPrice = countDays * 24000;
                } else if (season.equals("Summer")) {
                    finalPrice = countDays * 20250;
                }else {
                    validDate = false;
                }

            }
            default -> validDate = false;
        }

       //намираме разликата между бюджета на филма и финалната сума
        double diff = Math.abs(finalPrice - budget);

        if(budget >= finalPrice){
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!", diff);
        }else {
            System.out.printf("The director needs %.2f leva more!", diff);
        }

    }
}
