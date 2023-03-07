import java.util.*;

public class TestIfElse{

public static void main(String [] args){

double num1;
double num2;
int option;

Scanner input = new Scanner(System.in);

System.out.print  ("Enter two integer numbers: ");
num1 = input.nextDouble();
num2 = input.nextDouble();

System.out.println("******************************");
System.out.println("*                            *");
System.out.println("*1. Sum                      *");
System.out.println("*2. Sum and average          *");
System.out.println("*3. Sum, average, max and min*");
System.out.println("******************************");

System.out.print  ("Choose your option [1,2,3]: ");
option = input.nextInt();

IfElse i = new IfElse(num1,num2,option);
i.displayifelse();

}


}