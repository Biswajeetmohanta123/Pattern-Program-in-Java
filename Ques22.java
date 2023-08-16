public class Ques22 {
   public static void main(String[] args) {
    
    int n=5;
        int space = 0;

        for(int i=n; i>=1; i--){

            for(int j=1; j<=2*n-1; j++){

             if(j<=i){
                 System.out.print("*");
             }

             else if(j<= space+i-1){
                System.out.print(" ");
             }

             else{
                System.out.print("*");
             }

            }

            space +=2;
          System.out.println();
        }
        
   } 
}
