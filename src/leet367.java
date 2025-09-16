public class leet367 {
    public static void main(String[] args) {
        int num=16;
        System.out.println(isPerfectSquare(num));
    }
    public static boolean isPerfectSquare(int num) {
        double x=Math.sqrt(num);
        return (int)x*x==num;

    }
}
