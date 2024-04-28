//!JAVA CODE 
public class Reverse_a_Number {
    public static int revnumber(int num) {
        int reverse = 0;
        while (num != 0) {
            int lstdigit = num % 10;
            reverse = (reverse * 10) + lstdigit;
            num = num / 10;
        }
        return reverse;
    }
    public static void main(String[] args) {
        int num = 123;
        int res = revnumber(num);
        System.out.println(res);
    }
}
//!JAVASCRIPT CODE
// var reverse = function(x) {
//     let rev=0;
//     let h= -2147483648;
//     let k=2147483647;
//     while(x!==0){
//         let lstdigit=x%10;
//         rev=(rev*10)+lstdigit;
//         x = Math.trunc(x / 10);
//         if( rev <=h || rev >=k){
//              return 0;
//             }
//     }
//     return rev;
// };
