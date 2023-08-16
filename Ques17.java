public class Ques17 {
    public static void main(String[] args) {
        
int n=7;
int star =3;
int space=1;
for(int i=1; i<=n; i++){
    if(i<=3){

        // first upper half
    for(int j=1; j<=n; j++){
        if(j<=star) System.out.print("*");
        else if(j<=star+space) System.out.print(" ");
        else System.out.print("*");
    }
    star --;
    space +=2;
    System.out.println();
}
else if(i>=4){
    // second half down
for(int j=1; j<=n; j++){
        if(j<=star) System.out.print("*");
        else if(j<=star+space) System.out.print(" ");
        else System.out.print("*");
    }
    star ++;
    space -=2;
    System.out.println();
}
else {
    System.out.print(" ");
}
}
    }
}
