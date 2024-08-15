public class SquareChecker {
    public static boolean isSquare(int number) {
        if (number < 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(number);
        return sqrt * sqrt == number;
    }

    public static void main(String[] args) {

        System.out.println("isPerfectSquare(25) → " + isSquare(25));
        System.out.println("isPerfectSquare(20) → " + isSquare(20));
        System.out.println("isPerfectSquare(9) → " + isSquare(9));
    }
}