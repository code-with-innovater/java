public class palindrome {
        public static boolean isPalindrome(int x) {
            if (x < 0) {
                return false;
            }
    
            int temp = x;
            int rev = 0, rem;
    
    
            while (temp != 0) {
                rem = temp % 10;
                rev = rev * 10 + rem;
                temp = temp / 10;
            }
    
    
            return x == rev;
        }
    
        public static void main(String args[]) {
            int x = -121; 
            System.out.println(isPalindrome(x)); 
        }
    }

