public class Ques13{
public static void main(String[] args) {
    

        
    int n=5;

    for(int i=1; i<=2*5-1; i++){
       if(i<=5) {
        for(int j=1; j<=i; j++) System.out.print("* ");
       }
       // loop for star
     else{
        for(int j=2*n-i; j>=1; j--) System.out.print("* ");
        }
        System.out.println();
    } 
    
}
}
