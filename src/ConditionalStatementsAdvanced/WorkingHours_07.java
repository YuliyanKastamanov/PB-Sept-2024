package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class WorkingHours_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();

        //понеделник до събота -> са работни дни

        boolean isWorkingHours = hour >= 10 && hour <= 18;
        boolean isWorkingDay = day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday") || day.equals("Saturday");

        if( isWorkingHours && isWorkingDay){

            System.out.println("open");
        }else {
            System.out.println("closed");
        }
    }
}
