public class Ques21 {
    public static void main(String[] args) {
        
        int n=5;
        int space = 2*n-3;

        for(int i=1; i<=n; i++){

            for(int j=1; j<=2*n-1; j++){
             if(j<=i){
                 System.out.print("*");
             }

             else if(j<= space+i){
                System.out.print(" ");
             }
             else{
                System.out.print("*");
             }
            }
            space -=2;
          System.out.println();
        }
    }
}
