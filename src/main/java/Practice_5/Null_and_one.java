package Practice_5;

public class Null_and_one {
    public static void main(String[] args) {
        System.out.println(recurs(10,60));
    }
    //a - 0, b - 1
    public static double recurs(int a, int b){
        if (a==0) return 0;
        else if (a==1) return b+1;
        else if (a>1 && b==0) return 0;
        else return recurs(a-1,b-1)+recurs(a,b-1);
    }
}









