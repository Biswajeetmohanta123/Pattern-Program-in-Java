public class Ques10 {
    public static void main(String[] args){

         
         int n=5;
         int t=n;

for(int i=0; i<n; i++){
   // loop for space
    for(int j=0; j<=i; j++){
        System.out.print("  ");
    }

    // loop  for star
    for(int j=0; j<2*t-1; j++){
        System.out.print("* ");
        
    }
    t--;
    System.out.println();
}


    }
}

