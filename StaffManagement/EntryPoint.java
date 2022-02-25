import java.util.*;

public class EntryPoint {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        String firstName, lastName;
        int age,num;
        double salary;

        /*System.out.print("Please input the employee's first name: ");
        firstName = scan.nextLine();

        System.out.print("Please input the employee's last name: ");
        lastName=scan.nextLine();

        System.out.print("Please input the employee's age: ");
        age=scan.nextInt();

        System.out.print("Please input the employee's salary: ");
        salary=scan.nextDouble();

        Employee e1=new Employee(firstName,lastName,age,salary);

        System.out.println("Employee Information: " + e1.toString());*/

        num=rand.nextInt(10)+1;

        Employee[] list= new Employee[num];

        int var=num;

        for (int i=0; i<num ;i++){
            System.out.println("You have "+var--+" insertions left");
            System.out.print("Please input the employee's first name: ");
            firstName = scan.nextLine();

            System.out.print("Please input the employee's last name: ");
            lastName=scan.nextLine();

            System.out.print("Please input the employee's age: ");
            age=Integer.parseInt(scan.nextLine());

            System.out.print("Please input the employee's salary: ");
            salary=Double.parseDouble(scan.nextLine());

            list[i]=new Employee(firstName,lastName,age,salary);
        }

        for (int i=0; i<num ;i++) {

            System.out.println(list[i].toString());
        }



    }
}
