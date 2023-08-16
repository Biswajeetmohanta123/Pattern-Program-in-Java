public class Ques33 {
    public static void main(String[] args) {
        
        int n=10, val=10;

        for(int i=1; i<=n; i++){
            for(int j=n-i; j>=1; j--) System.out.print(" ");
            
            for(int j=1; j<=2*i-1; j++){
               if(j==i) System.out.print("0");
               else System.out.print(val);

            }
            val--;
            System.out.println();
        }
    }
}
