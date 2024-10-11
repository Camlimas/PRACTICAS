/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica.pkg3;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class PRACTICA3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String tex;

        Scanner captu=new Scanner(System.in);
        
        System.out.println("Introduce el texto");
        tex =captu.nextLine();
        
      for(int i=0;i<tex.length();i ++){
            System.out.println( tex.charAt(i));
      }
    
    }
    
}
