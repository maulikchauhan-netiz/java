import java.util.Scanner;
public class practice_3 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();

        for(int i=0;i<=num;i++)
        {
            System.out.println(i);
        }

        int j =1;
        System.out.println("enter the number");
        int num1 = sc.nextInt();
        while ( j <= num1)
        {
            System.out.println(j);
            j++;
        }
    }
}

