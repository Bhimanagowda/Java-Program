
package Constructor;


public class Constructor {
    int id;
    String name;
    
    Constructor(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    public static void main(String[] args) {
        
        Constructor c1=new Constructor(10,"Amith");
        Constructor c2=new Constructor(20,"Deepak");
        System.out.println(c1);
        System.out.println(c2);
        
    }
    
}
