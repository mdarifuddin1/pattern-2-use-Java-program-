
package code;

import java.util.Scanner;


public class Pattern2 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        int num,row,col;
        
        System.out.println("Enter a  Number : ");
        num=input.nextInt();
        
        for(row=num; row>=1; row--){
            
            for(col=1; col<=row; col++){
                
                System.out.print(" "+col);
            }
             System.out.println("");
        }
       
    }
}
