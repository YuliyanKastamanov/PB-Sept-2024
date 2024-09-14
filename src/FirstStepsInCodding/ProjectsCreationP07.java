package FirstStepsInCodding;

import java.util.Scanner;

public class ProjectsCreationP07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String architectName = scanner.nextLine();
        int countProject = Integer.parseInt(scanner.nextLine());

        int workingHours = countProject * 3;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.", architectName, workingHours, countProject);
    }
}
