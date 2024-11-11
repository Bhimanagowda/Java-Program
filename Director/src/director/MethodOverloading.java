package director;

public class MethodOverloading {

   
            float result;
   
  
        public int add(int a,int b)
        {
        result=a+b;
            System.out.println(result);
        return  (int) result;
        }  
        public float add(float y,float b)
        {
            result=y*b;
            System.out.println(result);
            return  result;
        }
        public float add(float x,int b)
        {
            result=x/b;
            System.out.println(result);
            return result;
        }
               public static void main(String[] args) {
   MethodOverloading m=new MethodOverloading();
  m.add(10,20);
  
   float y=m.result;   
   m.add(y,20.0f);
   
   float x=m.result;
   m.add(x,5);
   
               }
}

