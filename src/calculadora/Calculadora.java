/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
import java.util.Scanner;
import javax.print.DocFlavor;
import javax.swing.JOptionPane;

/**
 *
 * @author Ismael
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("**************** CALCULADORA EN JAVA ****************\n");
        
        operacionesCalcu();
        
    }
    
    public static void operacionesCalcu (){
        System.out.println("Ingrese el simoblo de la operación que desea realizar");
        Scanner leer = new Scanner(System.in);
        var operacion = leer.nextLine();
        
        String suma= "+";
        String resta= "-";
        String multi= "*";
        String divi= "/";
        
        if ( operacion.equals(suma)) {
            System.out.println("Ingrese el primer valor de suma");
            var sumaresp1 = leer.nextInt();
            
            System.out.println("Ingrese el sgundo valor de suma");
            var sumaresp2 = leer.nextInt();
         
            int resp=sumaresp1+sumaresp2;
            
            System.out.println("El valor de la suma de los 2 números es igual a " + resp);
        } else {
                if (operacion.equals(resta)){
                    System.out.println("Ingrese el primer valor de la resta");
                    var resta1 = leer.nextInt();
                    
                    System.out.println("Ingrese el segundo valor de la resta");
                    var resta2 = leer.nextInt();
                    
                    int resp = resta1 - resta2;
                    
                    System.out.println("El valor de la resta de los 2 números es igual a "+resp);
                } else{
                    if (operacion.equals(multi)) {
                        System.out.println("Ingrese el primer valor de la multiplicación");
                        var multi1 = leer.nextDouble();
                        
                        System.out.println("Ingrese el segundo valor de la multiplicación");
                        var multi2 = leer.nextDouble();
                        
                        Double resp= multi1*multi2;
                        
                        System.out.println("El valor de la multiplicación de los 2 números es igual a "+resp);
                    } else {
                        if (operacion.equals(divi)) {
                            System.out.println("Ingrese el dividendo");
                            var divi1 = leer.nextDouble();
                            
                            System.out.println("Ingrese el divisor");
                            var divi2 = leer.nextDouble();
                            
                            Double resp= divi1/divi2;
                            
                            System.out.println("El resultado de la división de los 2 números es igual a "+resp);
                            
                        } else {
                            System.out.println("El valor ingresado es incorrecto intente de nuevo");
                        }
                    }
        }              
        }
}
}
    
