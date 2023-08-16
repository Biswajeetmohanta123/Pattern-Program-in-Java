public class Ques18 {
  
    public static void main(String[] args) {
        int n=7, space=3, star =1,space1=1, star1=5;

        for(int i=1; i<=n; i++){
         if(i<=4){
           for(int j=1; j<=space; j++) System.out.print(" ");

           for(int k=1; k<=star; k++ ) System.out.print("*");
           System.out.println();   
           star +=2;
           space --;       
        }
        
   
       else{
           for(int j=1; j<=space1; j++) System.out.print(" "); 
           for(int k=star1; k>=1; k--) System.out.print("*");
           space1++;
           star1 -=2;
           System.out.println();
            
       }
        }
   
        }
    }
    

