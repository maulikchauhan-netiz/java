import java.util.Scanner;
public class practice_1 {
    static void main(String[]args){


        Scanner sc = new Scanner(System.in);
        System.out.print("enter the name");
        String name = sc.next();

        System.out.print("enter the age");
        int age = sc.nextInt();

        System.out.print("Enter your branch: ");
        String branch = sc.next();

        System.out.print("Enter your percentage: ");
        Double percentage = sc.nextDouble();

        System.out.println(name);
        System.out.println(age);
        System.out.println(branch);
        System.out.println(percentage);

    }
}
