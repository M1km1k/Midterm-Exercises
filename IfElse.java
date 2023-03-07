public class IfElse{

private double num1;
private double num2;
private int option;

private double sum;
private double average;

public IfElse(double num1,double num2,int option){

this.num1 = num1;
this.num2 = num2;
this.option = option;

}

public double getnum1(){

return this.num1;

}

public double getnum2(){

return this.num2;

}

public int getoption(){

return this.option;

}

public void displayifelse(){

if(getoption() == 1)

{

sum = getnum1() + getnum2();

System.out.printf(" Sum    : %.0f + %.0f = %.0f \n",getnum1(),getnum2(),sum);

}

else if(getoption() == 2)
{

sum = getnum1() + getnum2();

average = sum / 2;

System.out.printf(" Sum    : %.0f + %.0f = %.0f \n",getnum1(),getnum2(),sum);

System.out.printf(" Average: %.0f and %.0f = %.1f \n",getnum1(),getnum2(),average);

}

else if(getoption() == 3)
{

sum = getnum1() + getnum2();

average = sum / 2;

System.out.printf (" Sum       : %.0f + %.0f = %.0f\n",getnum1(),getnum2(),sum);

System.out.printf (" Average   : %.0f and %.0f = %.0f\n",getnum1(),getnum2(),average);

System.out.println(" Max       : "+(int)getnum1() +" and " +(int)getnum2()+" = "+Math.max((int)getnum1(),(int)getnum2()));

System.out.println(" Min       : "+(int)getnum1() +" and " +(int)getnum2()+" = "+Math.min((int)getnum1(),(int)getnum2()));

}


}

}