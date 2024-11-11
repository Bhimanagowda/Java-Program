
public class SimpleMethodOverloading {
    
    public void sum(String c,int a,int b)
     {
         int add=a=b;
         System.out.println(a+b);
         System.out.println(c); 
     }
     
    public void sum(float a,float b)
    {
        float div=a/b;
        System.out.println(div);
        
         
    }
    public void sum(double a,float b,char c)
    {
        double mul= (a*b);
        System.out.println(mul);
        System.out.println(c);
    }
    public static void main(String[] args) 
    {
        SimpleMethodOverloading s=new SimpleMethodOverloading();
        s.sum("Amith",10,20);
        s.sum(20.0f,10.0f);
        s.sum(20d,10f,'D');
    }
}
