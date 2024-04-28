public class Count_Digits {
    public static int dgts(int num) {
        int count = 0;
        while (num != 0) {
            num = num / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int num = 12345;
        int res = dgts(num);
        System.out.println(res);
    }
}
