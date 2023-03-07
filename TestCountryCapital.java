import javax.swing.*;

public class TestCountryCapital{

public static void main(String [] args){

String country;

country = JOptionPane.showInputDialog("Type a specific Country");
CountryCapital c = new CountryCapital(country);

c.determinecapital();


}


}