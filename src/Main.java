
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
         Scanner key=new Scanner(System.in);

         System.out.println("Enter your first initial:");
         String firstInitial=key.next();
        System.out.println("Enter your last name:");
        String lastName=key.next();
        System.out.println("Enter your house Number:");
        String houseNumber=key.next();
        System.out.println("Enter your street Name:");
        String streetName=key.next();
        System.out.println("Enter your street type:");
        String streetType=key.next();
        System.out.println("Enter your city:");
        String city=key.next();






      System.out.print(firstInitial + " " + lastName + " " + houseNumber + " ");
      System.out.println(streetName + " " + streetType + " " + city);
    }
}
