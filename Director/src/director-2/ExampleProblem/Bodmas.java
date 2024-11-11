package ExampleProblem;


public class Bodmas {
    public static void main(String[] args) {
        
        int x=4,y=2,z=0;
        z=x-=y/=x*y;
        System.out.println(z);
    } 
    
}
