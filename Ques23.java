public class Ques23 {
   public static void main(String[] args) {
    
    int n=5;
     for(int i=1; i<=n; i++){

        for(int j=n-i; j>=1; j--) System.out.print(" ");

        for(int k=1; k<=2*i-1; k++) System.out.print("1");

        System.out.println();
     }
   } 
}
