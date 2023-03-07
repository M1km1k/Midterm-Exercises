import javax.swing.*;

public class CountryCapital{

private String country;

public CountryCapital(String country){

this.country = country;

}

public String getcapital(){

return this.country;

}

public void determinecapital(){

switch(getcapital()){

case "Saudi Arabia":
JOptionPane.showMessageDialog(null,"Riyadh");
break;

case "United Kingdom":
JOptionPane.showMessageDialog(null,"London");
break;

case "United States of America":
JOptionPane.showMessageDialog(null,"Washington");
break;

case "Canada":
JOptionPane.showMessageDialog(null,"Montreal");
break;

case "France":
JOptionPane.showMessageDialog(null,"Paris");
break;

case "Germany":
JOptionPane.showMessageDialog(null,"Berlin");
break;

case "Italy":
JOptionPane.showMessageDialog(null,"Rome");
break;

case "Tunisia":
JOptionPane.showMessageDialog(null,"Tunis");
break;

case "Morocco":
JOptionPane.showMessageDialog(null,"Rabat");
break;

case "Algeria":
JOptionPane.showMessageDialog(null,"Alger");
break;

default:
JOptionPane.showMessageDialog(null,"Not Valid");
break;


}

}


}