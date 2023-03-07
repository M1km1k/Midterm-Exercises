import java.util.*;
public class TestSwitchMenu{

public static void main(String [] args){

int num1;
int num2;

char letter;


Scanner input = new Scanner(System.in);

System.out.print("Enter number 1: ");
num1 = input.nextInt();

System.out.print("Enter number 2: ");
num2 = input.nextInt();

System.out.println("\nA - Addition");
System.out.println("B - Subtraction");
System.out.println("C - Multiplication");
System.out.println("D - Division \n");

System.out.print("Enter a character for the operation: ");
letter = input.next().charAt(0);

SwitchMenu s = new SwitchMenu(num1,num2,letter);
s.displayswitch();

}


}