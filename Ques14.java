public class Ques14 {
    
    public static void main(String[] args) {
        
    
        int n=5;
    
        for(int i=1; i<=2*5-1; i++){
            if(i<=5){
            for(int j=n-i; j>=1; j--) System.out.print(" ");  
            
            for(int j=1; j<=i; j++) System.out.print("*");
            }
            else{
                 for(int j=1; j<=i-n; j++) System.out.print(" ");
               
            for(int j=2*5-i; j>=1; j--) System.out.print("*");  
            
           
            }

           
            
            System.out.println();
        } 
        
    }
    
}

