/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica.pkg5;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class PRACTICA5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int num;
        Scanner captu=new Scanner(System.in);
          System.out.println("Introduce un numero");
          num=captu.nextInt();
          captu.nextLine();
          
          
          for(int i=1;i<=num; i++){
  
              for(int j=1;j<=i;j++){
               System.out.print("*");    
          }
              System.out.println();
          }
      
    
}
}
