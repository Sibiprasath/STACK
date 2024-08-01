import java.util.Scanner;
import java.util.Stack;

class Main{
    public static String posttoinfix(String n){
        Stack <String> stack = new Stack<>();
        
        for(int i=0;i<n.length();i++){
            char c = n.charAt(i);
            
            if(Character.isLetterOrDigit(c)){
                stack.push(Character.toString(c));
            }
            else{
                String top1 = stack.pop();
                String top2 = stack.pop();
                
                String exp = "("+top2 + c+ top1+")";
                
                stack.push(exp);
            }
            
        }
        return stack.pop();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        
        String result = posttoinfix(n);
        System.out.println(result);
    }
}