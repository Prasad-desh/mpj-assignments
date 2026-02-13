import java.util.Scanner;

class Employee {
    double salary;

    Employee(double salary) {
        this.salary = salary;
    }

    void displaySalary(String msg) {
        System.out.println(msg + salary);
    }
}

class FullTimeEmployee extends Employee {

    FullTimeEmployee(double salary) {
        super(salary);
    }

    void calculateSalary() {
        displaySalary("Full Time Salary before hike: ");
        salary = salary + (salary * 0.50);   // 50% hike
        displaySalary("Full Time Salary after hike: ");
        System.out.println();
    }
}

class InternEmployee extends Employee {

    InternEmployee(double salary) {
        super(salary);
    }

    void calculateSalary() {
        displaySalary("Intern Salary before hike: ");
        salary = salary + (salary * 0.25);   // 25% hike
        displaySalary("Intern Salary after hike: ");
        System.out.println();
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Full Time Employee salary: ");
        double ftSalary = sc.nextDouble();
        FullTimeEmployee fte = new FullTimeEmployee(ftSalary);
        fte.calculateSalary();

        System.out.print("Enter Intern Employee salary: ");
        double intSalary = sc.nextDouble();
        InternEmployee intern = new InternEmployee(intSalary);
        intern.calculateSalary();

        sc.close();
    }
}