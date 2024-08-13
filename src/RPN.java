import java.rmi.server.RMIClassLoader;
import java.util.Stack;

import Stack.ArrayStack;

public class RPN {
    // public RPN(String[] args){
    //     Stack stack=new ArrayStack(args.length);

    //     for (int i = 0; i < args.length; i++) {
    //         String input=args[i];

    //         if (isAnOperator(input)) {
    //             double y=Double.parseDouble((String)stack.pop());
    //             double x=Double.parseDouble((String)stack.pop());
    //             double z=evaluate(x,y,input);
    //             stack.push(" "+z);
    //         }
    //         else stack.push(input);
    //     }

    // }
    // private boolean isAnOperator(String s){
    //     return (s.length()==1&& "ASMD".indexOf(s)>=0);
    // }
    // private double evaluate(double x,double y,String op){
    //     double z=0;
    //     if (op.equals("A")) z=x+y;
    // else if (op.equals("S")) z=x-y;
    // else if (op.equals("M")) z=x*y;
    //     else                          z=x/y;

    //     System.out.println(x+" "+op+" "+y+" "+z );
    //     return z;
    //    }
    public static int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();
        for (String s: tokens) 

        if ("+".equals(s)) stack.push(stack.pop() + stack.pop());
        
        else if ("-".equals(s)) stack.push (-stack.pop() + stack.pop ());

        else if("/".equals(s)) stack.push ((int) (1D / stack.pop() * stack.pop()));

       else if("*".equals (s)) stack.push (stack.pop() * stack.pop());

       else stack.push (Integer. valueOf(s));

                return stack.pop();
        }

        public static void main(String[] args) {
          String[] str={"6","*","3","-","(","4","-","5",")","+","2"};
          System.out.println(RPN.evalRPN(str));
        }
}
