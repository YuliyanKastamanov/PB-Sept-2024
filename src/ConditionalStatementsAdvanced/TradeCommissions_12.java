package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class TradeCommissions_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        double amountMoney = Double.parseDouble(scanner.nextLine());

        /*Град	0 ≤ s ≤ 500	    500 < s ≤ 1 000	    1 000 < s ≤ 10 000	    s > 10 000
        Sofia	      5%	            7%	                8%	                12%
        Varna	      4.5%	            7.5%	            10%	                13%
        Plovdiv	      5.5%	            8%	                12%	                14.5%*/

        boolean validMoneyOrTown = true;
        double commission = 0;
        if(amountMoney >= 0 && amountMoney <= 500){
            switch (town){
                case "Sofia" -> commission = amountMoney * 0.05;
                case "Varna" -> commission = amountMoney * 0.045;
                case "Plovdiv" -> commission = amountMoney * 0.055;
                default -> validMoneyOrTown = false;
            }


        }else if(amountMoney > 500 && amountMoney <= 1000){
            switch (town){
                case "Sofia" -> commission = amountMoney * 0.07;
                case "Varna" -> commission = amountMoney * 0.075;
                case "Plovdiv" -> commission = amountMoney * 0.08;
                default -> validMoneyOrTown = false;
            }

        } else if (amountMoney > 1000 && amountMoney <= 10000) {
            switch (town){
                case "Sofia" -> commission = amountMoney * 0.08;
                case "Varna" -> commission = amountMoney * 0.10;
                case "Plovdiv" -> commission = amountMoney * 0.12;
                default -> validMoneyOrTown = false;
            }
        } else if (amountMoney > 10000) {
            switch (town){
                case "Sofia" -> commission = amountMoney * 0.12;
                case "Varna" -> commission = amountMoney * 0.13;
                case "Plovdiv" -> commission = amountMoney * 0.145;
                default -> validMoneyOrTown = false;
            }
        }else {
            validMoneyOrTown = false;
        }


        if (validMoneyOrTown){
            System.out.printf("%.2f", commission);
        }else {
            System.out.println("error");
        }
    }
}
