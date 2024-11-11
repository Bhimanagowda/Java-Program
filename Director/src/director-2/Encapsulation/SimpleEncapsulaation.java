
package Encapsulation;

public class SimpleEncapsulaation {
    
    private String name="Amith";
    public String getName()
    {
        return name;
    }
    public String setName(String s)
    {
        return this.name=s;
    }
}
 class Test2
    {
        public static void main(String[] args) {
            
            SimpleEncapsulaation s=new SimpleEncapsulaation();
            s.setName("Amith");
            System.out.println(s.getName());
        }
    
    
}
