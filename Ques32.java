public class Ques32 {
    public static void main(String[] args) {
        
        int n=5;
        int space=1, value=1;
        for(int i=1; i<=2*n-1; i++){
        if(i<=5){
            
                for(int k=1; k<=space; k++){
               if(k%2==0) System.out.print("* ");

               else System.out.print(value+" ");
                }
                space +=2;
                value ++;
                 System.out.println();
            }

            
        else{
            space -=2;
            value -=1;
           
            for(int k=1; k<=space; k++){
                if(k%2==0) System.out.print("* ");
        
                else System.out.print(value+" ");
            }
            System.out.println();
        }
        }
        
    }
}
