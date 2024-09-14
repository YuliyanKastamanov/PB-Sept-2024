package ConditionalStatements;

import java.util.Scanner;

public class PasswordGuess_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        boolean checkPassword = password.equals("s3cr3t!P@ssw0rd");

        if (checkPassword){
            System.out.println("Welcome");
        }else {
            System.out.println("Wrong password!");
        }

    }
}
