public class Ques27 {
    
    public static void main(String[] args) {
        
        int n=5;
        
        
       for(int i=1; i<=n; i++){
        int star =0;
        for(int j=n-i; j>=1; j--) System.out.print(" ");

        for(int k=1; k<=2*i-1; k++)
        {

            if(k<=i){
             star++;
             System.out.print(star);
            
            }
            else {
                star --;
            System.out.print(star);
            
            }
           
        }
        System.out.println();
     }
    }
}
