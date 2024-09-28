package ForLoop;

import java.util.Scanner;

public class CharacterSequence_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();

        //int stringLength = input.length();

        for (int i = 0; i < input.length(); i++) {

            char currentSymbol = input.charAt(i);
            System.out.println(currentSymbol);
            
        }
        
        
    }
}
