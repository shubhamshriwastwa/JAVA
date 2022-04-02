  
public class Loop_Pattern1 { 
    public static void main(String[] args)
    {    
        int n=4;
        int m=5;
        
       
        System.out.println("enter any number"); 
        
        for(int i=1;i<=n;i++)//outer loop 
        { 
            for(int j=1;j<=m;j++){
                System.out.print("*"); 
                
            }  
            System.out.println();
            
        }
        
        
    }
            
    
}