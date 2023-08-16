public class Ques24 {
   public static void main(String[] args) {
    
    int n=5;
     for(int i=1; i<=n; i++){

        for(int j=n-i; j>=1; j--) System.out.print(" ");

        for(int k=1; k<=2*i-1; k++) 
        {
            if(i%2 ==0) System.out.print("2");

            else  System.out.print("1");
        }
        System.out.println();
     }
   } 
}
