public class Main {
    // Birinci yöntem: İki indeks ile kontrol etme
    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    // İkinci yöntem: String'in tersini alıp karşılaştırma
    static boolean isPalindrome2(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        return str.equals(reverse);
    }

    public static void main(String[] args) {
        System.out.println("Birinci yöntemle:");
        System.out.println(isPalindrome("abba"));  // true döner
        System.out.println(isPalindrome("asa"));   // true döner
        System.out.println(isPalindrome("hello")); // false döner

        System.out.println("\nİkinci yöntemle:");
        System.out.println(isPalindrome2("abba")); // true döner
        System.out.println(isPalindrome2("asa"));  // true döner
        System.out.println(isPalindrome2("hello")); // false döner
    }
}