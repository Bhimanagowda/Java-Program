
package Polimorphism;

public class UpCasting {
    public void show()
    {
        System.out.println("site");
    }
    
}
class UpCasting1 extends UpCasting
{
    public void show()
    {
        System.out.println("Ram");
    }
    public static void main(String[] args) {
        UpCasting a=new UpCasting1();
        a.show();
    }
}

        
