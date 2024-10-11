/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica.pkg2;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class PRACTICA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1,num2;
        
         Scanner captu=new Scanner(System.in);
          System.out.println("Introduce un numero");
          num1 =captu.nextInt();
          System.out.println("Introduce un numero");
          num2 =captu.nextInt();
          captu.nextLine();
          
          System.out.println("Acendente");
          for(int i=num1;i<=num2; i++){
              System.out.println(i + " ");
          }
          
          System.out.println("Dcendente");
          for(int i=num2;i>=num1; i--){
              System.out.println(i + " ");
          }
    }
    
}
