import java.util.Scanner;
public class TestAvege {
    public static void main(String[] args) {
        int num1, num2, num3;
        double averange;
        char repeat;
        String input;
        Scanner in = new Scanner(System.in);
        System.out.println("This program calculates the averange of three number :");
        do{
            System.out.println("Enter your number #1:");
            num1 = in.nextInt();
            System.out.println("Enter your number #2:");
            num2 = in.nextInt();
            System.out.println("Enter your number #3:");
            num3 = in.nextInt();
            averange = num1 + num2 + num3 / 3.0 ;
            System.out.println("The Averange is "+ averange);
            System.out.println();
            System.out.println("Would you like to test again :");
            System.out.println("Enter Y for Yes or N for No :");
            in.nextInt();
            input = in.nextLine();
            repeat = input.charAt(0);
        }while(repeat == 'Y' || repeat == 'y' );
    }
}
