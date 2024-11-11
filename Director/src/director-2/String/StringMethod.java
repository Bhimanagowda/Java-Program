
package String;

public class StringMethod {
    
    public static void main(String[] args) {
        
        String s1="Amith";
        String s6="Aa1";
        String s2="                Deepak                   .";
        String s3="Rama is God";
        String s4="amith";
        String s5="";
        //ChatAt Method
        for(int i=0;i<s1.length();i++)
                {
                    System.out.print(" "+s1.charAt(i));
                }
        System.out.println(" ");
        
        //compareTo Method
        System.out.println(s4.compareTo(s1));
        System.out.println(s1.compareToIgnoreCase(s4)+"\n");
        
        //concat Method
        System.out.println(10+20+30+" Blore "+10+20+30+"\n");
        
        //Contain mathod
        System.out.println(s1.contains("AMITH")+"\n");
        
        //split Mathod
        String s="Welcome to Rooman";
        String[] s7=s.split("\\s");
        for(String s8:s7)
        {
            System.out.println(s8);
        }
        
        
        //Replace Method
        String replaceString=s1.replace("AMITH","amith");
        System.out.println("\n"+replaceString+"\n");
        
        String replaceALlString=s3.replaceAll("a", "aa");
        System.out.println(replaceALlString+"\n");
        
        //Equals MEthod
        System.out.println(s1.equals(s4));
        System.out.println(s1.equalsIgnoreCase(s4)+"\n");
        
        //StartWith Method
        System.out.println(s1.startsWith("A"));
        System.out.println(s1.startsWith("a")+"\n");
        
        //EndWith Method
        System.out.println(s1.endsWith("H"));
        System.out.println(s1.endsWith("h")+"\n");
        
        //toLowerCAse Method
        System.out.println(s1.toLowerCase()+"\n");
        
        //toUpperCase Method
        System.out.println(s2.toUpperCase()+"\n");
        
        //isEmpty
        System.out.println(s5.isEmpty()+"\n");
        
        //join Method
        System.out.println(s3.join(":","Amith","rama","deepak"));
       
        //getBytes Method
        byte arr[]=s6.getBytes();
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }                                   // it encode the values,send the outpur in ASCII format
        
        //lastIndexeof Method
        System.out.println(s3.lastIndexOf("a")+"\n");
        
        //Trim Method
        System.out.println(s2.trim());
        
    }
}
