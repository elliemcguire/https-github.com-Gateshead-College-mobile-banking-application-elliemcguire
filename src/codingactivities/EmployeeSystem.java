package codingactivities;

import java.rmi.server.ExportException;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeSystem {

    ArrayList<Employee> employees = new ArrayList<>();

//    public static void main(String[] args) {
//        EmployeeSystem employeeSystem = new EmployeeSystem();
//        employeeSystem.details();
//    }

    private void details() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your full name");
        String name = scanner.nextLine();
        System.out.println("Please enter your age");
        String age = scanner.nextLine();
        System.out.println("Please enter your employee number");
        String employeeNumber = scanner.nextLine();
        System.out.println("Please enter your postcode");
        String postcode = scanner.nextLine();
    }

//    public class Sample {
        public static void main(String args[]) throws Exception {
            Employee employee[] = new Employee[2];
            employee[0] = new Employee("Ellie", 18, 11921970, "NE30 2UD");
            employee[1] = new Employee("Ella", 16, 12345678, "NE30 2UD");
            for (int i = 0; i< employee.length; i++) {
                System.out.println("name " + employee[i].name + ", age " + employee[i].age + ", employee number " + employee[i].employeeNumber + ", postcode " + employee[i].postcode);
            }
        }
//    }


}


