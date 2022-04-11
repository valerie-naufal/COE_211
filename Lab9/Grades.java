import java.util.Scanner;

public class Grades {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        int[] grades = new int[5];
        double attendance,midterm,sum=0;
        double assignment;

        for (int i=0;i<5;i++) {
            System.out.print("Input the grade of assignment " + (i+1) + ": ");
            int grade = scan.nextInt();

            grades[i]=grade;
        }

        System.out.print("Input the number of attended labs: ");
        attendance= scan.nextInt();

        System.out.print("Input the midterm grade: ");
        midterm=scan.nextInt();

        for (int  i=0;i<=4;i++){
            sum+=grades[i];
        }

        assignment = sum/5.0;
        assignment*=0.3;

        attendance/=7.0;
        attendance*=100;
        attendance*=0.05;

        midterm*=0.3;

        System.out.println("Assignment(30%): "+ assignment);
        System.out.println("Attendance(5%): "+ attendance);
        System.out.println("Midterm(30%): "+ midterm);

    }
}
