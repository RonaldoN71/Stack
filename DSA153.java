
import java.util.Stack;
public class DSA153 {
    static int evaluatePostfix(String []arr){
        Stack<Integer> stack = new Stack<>();
        for(String token : arr){
            if(token.matches("-?\\d+")){
                stack.push(Integer.parseInt(token));
            }
            else{
                int val1 = stack.pop();
                int val2 = stack.pop();

                switch(token){
                    case "+" : stack.push(val2 + val1);
                    break;
                    case "-" : stack.push(val2 - val1);
                    break;
                    case "*": stack.push(val2 * val1);
                    break;
                    case "/" : stack.push(val2 / val1);
                    break;
                }
            }
        }
        return stack.pop();
              
    }
    public static void main(String[] args) {
        String []arr = {"2", "3", "1", "*", "+", "9", "-"};
        System.out.println(evaluatePostfix(arr));
    }
}
