import java.util.Scanner;

public class makingAnagrams {
    public static int numberNeeded(String first, String second) {
        int letters[] = new int[26];
        for(int i=0; i<letters.length;i++){
            letters[i] = 0;
        }
        for (char c: first.toCharArray()) {
            letters[c-'a']++;
        }
        for (char c: second.toCharArray()) {
            letters[c-'a']--;
        }
        int count = 0;
        for (int i: letters) {
            count += Math.abs(i);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }

}
