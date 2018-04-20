import java.util.*;

public class ransomeNote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        String magazine[] = new String[m];
        for(int magazine_i=0; magazine_i < m; magazine_i++){
            magazine[magazine_i] = in.next();
        }
        String ransom[] = new String[n];
        for(int ransom_i=0; ransom_i < n; ransom_i++){
            ransom[ransom_i] = in.next();
        }

       /* Solution I complexity O(n^2)
       int counter=0;
        for(int i=0; i<magazine.length;i++){
            for(int j=0; j<ransom.length; j++){
                if(magazine[i].equals(ransom[j])){
                    counter++;
                    break;
                }
            }
        }
        System.out.println(counter==ransom.length?"Yes":"No");
        */

       //  Solution I complexity O(n)
        HashMap<String,Integer> words = new HashMap<>();
        for(int i=0; i<magazine.length; i++){
            if(words.containsKey(magazine[i])){
                words.put(magazine[i],words.get(magazine[i])+1);
            }else{
                words.put(magazine[i],1);
            }
        }
        boolean isOk=true;
        for(int i=0; i<ransom.length; i++){
            if(words.containsKey(ransom[i])){
                words.put(ransom[i],words.get(ransom[i])-1);
            }else{
                isOk = false;
                break;
            }
        }
        Set<String> set = words.keySet();
        for (String s: set) {
            if(words.get(s)<0){
                isOk = false;
                break;
            }
        }
        System.out.println(isOk?"Yes":"No");

    }
}
