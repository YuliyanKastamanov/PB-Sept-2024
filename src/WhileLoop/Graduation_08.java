package WhileLoop;

import java.util.Scanner;

public class Graduation_08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int countGrade = 1;
        double sumGrades = 0;
        int countGradesLessThan4 = 0;

        while (countGrade <= 12 ){

            double currentGrade = Double.parseDouble(scanner.nextLine());

            if(currentGrade >= 4){
                sumGrades += currentGrade;
                countGrade ++;

            }else {
                countGradesLessThan4 ++;
            }

            if(countGradesLessThan4 == 2){
                break;
            }
        }

        if(countGradesLessThan4 == 2){
            System.out.printf("%s has been excluded at %d grade", name, countGrade);
        }else {
            System.out.printf("%s graduated. Average grade: %.2f", name, sumGrades / 12);
        }
    }
}
