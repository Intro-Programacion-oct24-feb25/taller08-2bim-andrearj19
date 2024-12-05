/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1 = 30;
        int num2 = 60;
        int num3 = 90;
        int num4 = 120;

        for (int i = 30; i >= 10; i--) {

            System.out.println(num1 + "-" + num2 + "-" + num3 + "-" + num4 + "-");
            num1 -= 1;
            num2 -= 2;
            num3 -= 3;
            num4 -= 4;
        }
    }
}

    

