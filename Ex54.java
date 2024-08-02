import java.util.Scanner;
public class Ex54 {

   public static void checkEvenOdd(int number) {
    if (number % 2 == 0) {
        System.out.println(number + " is even.");
    } else {
        System.out.println(number + " is odd.");
    }
}

public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

  
    System.out.print("Enter a number: ");
    int number = scanner.nextInt();

    
    checkEvenOdd(number);

   
    scanner.close();
}
}