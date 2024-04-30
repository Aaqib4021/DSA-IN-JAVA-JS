public class Check_prime {
    public static boolean checkprime(int num) {
        boolean flag = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        int num = 5;
        boolean res = checkprime(num);
        if (res == true) {
            System.out.println("number is prime:");
        } else {
            System.out.println("number is not prime:");
        }
    }
}
