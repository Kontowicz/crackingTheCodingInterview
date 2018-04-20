import java.util.Scanner;
import java.util.Stack;

public class balancedBrackets {
    private static boolean isBalanced(String arg){
        Stack<Character> stak = new Stack<>();

        for(int i=0; i<arg.length(); i++){
            if(!stak.empty()) {
                switch(arg.charAt(i)) {
                    case '}' : if (stak.peek() == '{') {
                        stak.pop();
                    } break;
                    case ']' : if (stak.peek() == '[') {
                        stak.pop();
                    } break;
                    case ')' : if (stak.peek() == '(') {
                        stak.pop();
                    } break;
                    default: stak.push(arg.charAt(i));
                }
            }else{
                stak.push(arg.charAt(i));
            }
        }
        return stak.isEmpty();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}
