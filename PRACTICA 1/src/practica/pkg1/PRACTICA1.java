/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica.pkg1;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class PRACTICA1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String tex;
        int num;
        Scanner captu=new Scanner(System.in);
        
        System.out.println("Introduce el texto");
        tex =captu.nextLine();
        System.out.println("Introduce la cantidad de repeticion");
       num =captu.nextInt();
       captu.nextLine();
        
        for(int i=0; i<num; i++){
            System.out.print( tex + "-");
        
        }
    }
    
}
