package Students;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Student sOne = new Student();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your First name: ");
        String newFirstName = scanner.nextLine();
        sOne.setFirstname(newFirstName);

        System.out.print("Enter your Middle name: ");
        String newMiddleName = scanner.nextLine();
        sOne.setMiddlename(newMiddleName);

        System.out.print("Enter your Last name: ");
        String newLastName = scanner.nextLine();
        sOne.setLastname(newLastName);

        System.out.print("Enter your Suffix: ");
        String newSuffix = scanner.nextLine();
        sOne.setSuffix(newSuffix);

        String firstName = sOne.getFirstname();
        String middleName = sOne.getMiddlename();
        String lastName = sOne.getLastname();
        String suffix = sOne.getSuffix();

        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);
        System.out.println("Suffix: " + suffix);

        
    }
}
