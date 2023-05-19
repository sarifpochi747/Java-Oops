public class Factorial {

    void fact(int n){
        int x = 1;
        for(int i=1;i<=n;i++){
            x*=i;
        }
        System.out.println(x);
    }
    public static void main(String[] args) {
        new Factorial().fact(5);
    }
}
