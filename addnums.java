// Java Basics - Assignment 1
import java.util.*;
public class addnums {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        double sum = 0;
        while(true){
            try{
                System.out.println("Please enter a number (type a non-number to finish): ");
                sum += scan.nextDouble();
            } catch(Exception e){
                System.out.println("Not a number, final sum is: " + sum);
                break;
            }
        }
        scan.close();
    }
}
