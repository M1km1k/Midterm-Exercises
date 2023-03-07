public class SwitchMenu{

private int num1;
private int num2;

private char letter;

private int sum;
private int sub;
private int mul;
private int div;

public SwitchMenu(int num1,int num2,char letter){

this.num1 = num1;
this.num2 = num2;
this.letter = letter;

}

public int getnum1(){

return this.num1;

}

public int getnum2(){

return this.num2;

}

public char getletter(){

return this.letter;

}

public void displayswitch(){


switch(getletter()){

case 'A':
sum = getnum1() + getnum2();
System.out.printf("\nThe answer is: %d\n",sum);
break;

case 'B':
sub = getnum1() - getnum2();
System.out.printf("\nThe answer is: %d\n",sub);
break;

case 'C':
mul = getnum1() * getnum2();
System.out.printf("\nThe answer is: %d\n",mul);
break;

case 'D':
div = getnum1() / getnum2();
System.out.printf("\nThe answer is: %d",div);
break;

default:

break;

}


}


}