/** This class outputs all palindromes in the words file in the current directory. */
public class PalindromeFinder {
    static CharacterComparator cc = new OffByOne();
    public static void main(String[] args) {
        int minLength = 4;
        In in = new In("../library-sp18/data/words.txt");
        Palindrome palindrome = new Palindrome();

        while (!in.isEmpty()) {
            String word = in.readString();
            /*if (word.length() >= minLength && palindrome.isPalindrome(word)) {
                System.out.println(word);
            }**/
            if (word.length() >= minLength && palindrome.isPalindrome(word,cc)){
                System.out.println(word);
            }
        }
    }
}
