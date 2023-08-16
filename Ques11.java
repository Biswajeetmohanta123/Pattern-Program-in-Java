public class Ques11 {
    
   public static void main(String[] args) {
        
    int n=5;

    for(int i=1; i<=5; i++){
        // loop for space
        for(int j=n-i; j>0; j--) System.out.print(" ");
        // loop for star
        for(int j=1; j<=i; j++) System.out.print("* ");
        
        System.out.println();
    }
    }
}
