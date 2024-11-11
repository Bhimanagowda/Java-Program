

package director;

public class Constructor {
    
         int rollno;
        String name,college_name;
        float marks;
        
         Constructor()
                {
                 rollno=001;
                 name="Lavanya";
                 college_name="SSIT";
                    System.out.println("\nrollno is="+rollno+"\nname is="+name+"\ncollege is="+college_name);
                }
          
           Constructor(int a,String b,String c)
                {
                 this.rollno=a;
                 this.name=b;
                 this.college_name=c;
                 System.out.println("\nrollno is="+rollno+"\nname is="+name+"\ncollege is="+college_name);
                }
               
          
             Constructor(String m,float n)
                {
                 name=m;
                 this.marks=n;
                 System.out.println("\nname is="+name+"\ncollege is="+college_name);
                }
               Constructor(int a,String d)
                {
                 rollno=001;
                 this.name=d;
                 System.out.println("\nrollno is="+rollno+"\nname is="+name);
             }
               
              public static void main(String[] args) {
        
                  Constructor d=new Constructor();
                  Constructor d1=new Constructor("ramya",98.6f);
                 Constructor d2=new Constructor(1,"Lavanya","Ssit");
                 Constructor d3=new Constructor(101,"Rama");
                
                  
    }

 
               
    
}
