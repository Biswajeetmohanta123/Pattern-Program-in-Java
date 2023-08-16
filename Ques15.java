public class Ques15 {
    public static void main(String[] args) {
        
        int n=5;
        int space =0,star=n;
        
        for(int i=1; i<=2*n-1; i++){
        if(i<=5){
            for(int j=1; j<=space; j++) {
            System.out.print("\t");
            }
            space+=2;
              for(int k=1; k<=star; k++){
                 System.out.print("*"+"\t");
                
              }
               star--;
            }
            else{
                for(int j=1; j<=space; j++) {
                System.out.print("\t");
           
               }
            space -=2;
              for(int k=1; k<=star; k++){
                 System.out.print("*"+"\t");
                 
              }
              star++;
            }
            System.out.println();
            }
    }
}
