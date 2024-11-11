
package String;


public class SimpleString {
    
    String s="Amith";
    String s1="Amith";
    String s2="Amith";
    String s3="Amith";
    String s4=s.concat("Deepak");
    
    
    public static void main(String[] args) {
        
        String a="john";
        a.concat("Rama");
        System.out.println(a); //will print john becoz string os immutable
        
    }
    
    
    
}
