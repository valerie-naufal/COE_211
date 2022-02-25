public class Employee {
    private String firstName, lastName;
    private int age;
    private double salary;

    public Employee(String firstName, String lastName,int age,double salary){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.salary=salary;
    }

    public String getFN(){
        return firstName;
    }

    public String getLN(){
        return lastName;
    }

    public int getAge(){
        return age;
    }

    public double getSalary(){
        return salary;
    }

    public String toString(){
        return "Employee Information: " +firstName + " "+ lastName+", " +age+", "+salary;
    }

}
