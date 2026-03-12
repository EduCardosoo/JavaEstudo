package exercicio2;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Main {

    public static void main(String [] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee func = new Employee();

        System.out.println("Name: ");
        func.name = sc.nextLine();
        System.out.println("Gross salary: ");
        func.grossSalary = sc.nextDouble();
        System.out.println("Tax: ");
        func.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Employee: " +func);
        System.out.println();
        System.out.println("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        func.increaseSalary(percentage);

        System.out.println();
        System.out.println("Updated data: " +func);

        sc.close();
    }
}
