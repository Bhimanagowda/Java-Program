
package ExampleProblem;

public class DuplicateElements {
    public static void main(String[] args) {
        
        int a[]={1,2,3,7,3,2,1,7};
        
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(a[i]==a[j])
                {
            System.out.print(a[j]+" ");
                }
            }
        }
    }
    
}
