public class Ques6 {

public static void main(String[] args){
    int n =5;
    int space =0;
       for(int i=1; i<=n; i++){
        
          for(int j=1; j<=space; j++){
              System.out.print("\t");
          }

           space+=2;

            for(int k=1; k<=n-i+1; k++){
               System.out.print("*"+"\t");
           }

           System.out.println();
       }
}
    
}
