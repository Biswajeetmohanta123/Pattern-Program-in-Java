public class Ques25 {
     public static void main(String[] args) {
        
        int n=5;
        int star =1;
        
       for(int i=1; i<=n; i++){

        for(int j=n-i; j>=1; j--) System.out.print(" ");

        for(int k=1; k<=2*i-1; k++)
        {
            System.out.print(star);
            star ++;
           
        }
        System.out.println();
     }
     }
}
