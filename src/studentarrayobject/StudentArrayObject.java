/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentarrayobject;
import java.util.Scanner;

/**
 *
 * @author Mamou
 */
public class StudentArrayObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //Intialize Scanner
        Scanner scanN = new Scanner(System.in);
       
        //declare variables
               
      Student[] arr = new Student[3];
       
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Student();
            System.out.println("Enter id");
            arr[i].setId(scanN.nextInt());
            
            System.out.println("enter name");
            arr[i].setName(scanN.next());
            
            System.out.println("enter program name");
            arr[i].setProgramName(scanN.next());
        
             System.out.println(arr[i].getId());
             System.out.println(arr[i].getName());
             System.out.println(arr[i].getProgramName());
        }
        
        
        
           
        //System.out.println(arr);
      
       
       
       
       
       
        
        
        
    }
    
}
