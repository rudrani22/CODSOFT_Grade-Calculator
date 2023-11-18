import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Scanner tS=new Scanner(System.in);
        System.out.println("Enter number of subjects you have:");
        int totalSub=tS.nextInt();
        System.out.println("Enter the marks u scored in " + totalSub + " subjects(out of 100):");
        int marks[]=new int[totalSub];
        for(int i=0; i<totalSub; i++){
            System.out.println("Marks you obtained in Subject " + (i+1) + ":");
            marks[i]=sc.nextInt();
        }
        int totalMarks=0;
        for (int score : marks) {
            totalMarks=totalMarks + score;
        }
        float avPercentile=(float)totalMarks/totalSub;
        String grade;
        if (avPercentile >= 90) {
            grade = "A+";
        } else if (avPercentile >= 80) {
            grade = "A" ;
        } else if (avPercentile >= 70) {
            grade = "B+";
        } else if (avPercentile >= 60) {
            grade = "B";
        } else if (avPercentile >= 50) {
            grade = "C";
        } else if (avPercentile >= 40) {
            grade = "D";
        }
        else {
            grade = "F";
        }
        System.out.println("\nYour Total Marks is: " + totalMarks + " out of " + totalSub*100);
        System.out.println("The Average Percentile you obtained is: " + avPercentile + "%");
        System.out.println("Your overall Grade is: " + grade);
        
        sc.close();
        tS.close();


    }
    
}
