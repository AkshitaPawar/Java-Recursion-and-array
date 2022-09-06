public class NaturalNum {
    public static int natural(int n){
        if(n == 1){
            return 1;
        }
        System.out.print(n+" ");
        return natural(n-1);
    }

    public static void main(String[] args) {
        int n=10;
        natural(n);
        if(n<0){
            System.out.println("not a natural num");
        }
    }
}
