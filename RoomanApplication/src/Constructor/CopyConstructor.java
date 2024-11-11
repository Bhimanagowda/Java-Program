
package Constructor;


public class CopyConstructor {
    int rollno;
        String name;
        
        CopyConstructor(int rollno,String name)
        {
            this.rollno=rollno;
            this.name=name;
            
        }
        CopyConstructor(CopyConstructor s)
        {
            rollno=s.rollno;
            name=s.name;
        }
     
        public void print()
        {
            System.out.println(rollno+" "+name);
        }
        
        public static void main(String[] args) {
            CopyConstructor c1=new CopyConstructor(01,"Amith");
             CopyConstructor c2=new CopyConstructor(c1);
             
             
        //     without constructor
        //  CopyConstructor c3=new CopyConstructor();
        //     c2.rollno=c1.rollno;
         //    c2.name=c1.name;
         
             c1.print(); 
             c2.print(); 
             
        }  
}
