/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double fahrenheit= 20;
        double acumulador= 0;
        double celsius=0;
        double operacion;
    
        for (int i = 1; i <= 20; i++) {
            fahrenheit = 20 + (i * 4);
            celsius = (5.0 / 9.0) * (fahrenheit - 32);
            acumulador += celsius;
           System.out.printf("Operación(%d) Fahrenheit: %.2f ===> Celsius: %.2f%n", i, 
                   fahrenheit, celsius);

        }
      System.out.printf("El valor acumulado de todas las conversiones es: %.2f%n", 
              acumulador);

    }
    
    
}

    
    

