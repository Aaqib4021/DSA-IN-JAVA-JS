//!JAVA CODE
public class Check_palidromeNumber {
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
        if (res == num) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
//!JAVASCRIPT CODE
// var isPalindrome = function(x) {
//     let temp=x;
//     let rev=0;
//     while(x!==0){
//         if(x>0){
//             let lstdgt =x%10;
//         rev=(rev*10)+lstdgt;
//         x=Math.trunc(x/10)
//         }else{
//             return false;
//         }
        
//     }
//     if(rev===temp){
//         return true;
//     }else{
//         return false;
//     }
// };
