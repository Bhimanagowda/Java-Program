package director;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows
 */
import java.util.Scanner;
public class BillGenrate {
    public static void main(String[] args) {
        {
            double rate,tax,total;
            int unit;
            Scanner sc=new Scanner(System.in);
            for(;;)
            {
            System.out.println("Enter the units");
            unit=sc.nextInt();
          
            if(unit<=30)
            {
                total=(unit*7.3)+50;
                System.out.println(total);
            }
            else if(unit>=31 && unit<=100)
            {
                total=(unit*6.25)+50;
                System.out.println(total);
            }
            else if(unit>=100 && unit<=200)
            {
                total=(unit*3.70)+50;
                System.out.println(total);
            }
            else
            {
                total=(unit*3.25)+50;
                System.out.println(total);
                        break;
           }
    
            
            }
                   
        }
    }
    
}
