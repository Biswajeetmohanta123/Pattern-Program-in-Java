public class Ques9 {
  public static void main(String[] args) {
    int n=5;

    for(int i=1; i<=5; i++){
        for(int j=n-i; j>=1; j--){
            System.out.print("  ");
        }
        for(int k=1; k<=i*2-1; k++){
            System.out.print("* ");
        }
        System.out.println();
    }
        
    }
}
