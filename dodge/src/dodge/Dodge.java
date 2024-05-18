/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dodge;

/**
 *
 * @author TOSHIBA
 */
public class Dodge {
public final static String Name = "DODGE";
public final static int Year = 2024;
String Class;
double Price;


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public Dodge(String Name,int Year,String Class,double Price){
        this.Class=Class;
        this.Price=Price;
    }
}
