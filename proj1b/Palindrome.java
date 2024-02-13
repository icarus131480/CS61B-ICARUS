public class Palindrome {
    public Deque<Character> wordToDeque(String word){
        Deque<Character> result = new LinkedListDeque<Character>();
        for (int x = 0;x<word.length();x++)
        {
            result.addLast(word.charAt(x));
        }
        return result;
    }
    public boolean isPalindrome(String word){
        Deque<Character> d = wordToDeque(word);
        int front = 0,back = d.size()-1;
        while(front<=back){
            if(d.get(front).equals(d.get(back))){
             front++;
             back--;
            }
            else
                return false;
        }
        return true;
    }
    public boolean isPalindrome(String word, CharacterComparator cc){
        Deque<Character> d = wordToDeque(word);
        int front = 0,back = d.size()-1;
        while(front<back){
            if ( cc.equalChars( d.get(front),d.get(back) ) ){
                front++;
                back--;
            }
            else
                return false;
        }
        return true;
    }
}
