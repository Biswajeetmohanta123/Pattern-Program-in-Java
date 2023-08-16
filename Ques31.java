public class Ques31 {
    public static void main(String[] args) {
        
        int n=5; 
        for(int i=1; i<=5; i++){
            for(int j=n; j>=1; j--){
                if(i+j==6) System.out.print("*"+" ");
                else
                System.out.print(j+" ");
               
            }
            System.out.println();
        }
    }
}
