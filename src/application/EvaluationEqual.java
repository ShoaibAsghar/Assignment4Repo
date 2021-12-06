package application;
import java.util.Stack;
public class EvaluationEqual 
{
  
	public int evaluate(String expression)
    {
        char[] ch_Array = expression.toCharArray();
 
         
        Stack<Integer> values = new Stack<Integer>();
 
        Stack<Character> ops = new Stack<Character>();
                              
 
        for (int i = 0; i < ch_Array.length; i++)
        {
             
            if (ch_Array[i] == ' ')
                continue;
 
            if (ch_Array[i] >= '0' && ch_Array[i] <= '9')               
                {
                  StringBuffer sbuf = new  StringBuffer();
                           
                    while (i < ch_Array.length && ch_Array[i] >= '0' && ch_Array[i] <= '9')                                                 
                           sbuf.append(ch_Array[i++]);
                           values.push(Integer.parseInt(sbuf.toString()));                                                                     
                           i--;
                }
           
            else if(ch_Array[i] == '(')
                    ops.push(ch_Array[i]);
 
            else if(ch_Array[i] == ')')
                    {
                      while (ops.peek() != '(')
                      values.push(applyOp(ops.pop(),
                      values.pop(),
                      values.pop()));
                      ops.pop();
                    }
          
            else if(ch_Array[i] == '+' || ch_Array[i] == '-' || ch_Array[i] == '*' || ch_Array[i] == '/' || ch_Array[i] == '%')           		           				            						
                    {
               
                     while(!ops.empty() && hasPrecedence(ch_Array[i], ops.peek()))                                                        
                             values.push(applyOp(ops.pop(),
                             values.pop(),
                             values.pop()));
                
                     ops.push(ch_Array[i]);
                    }
          }
 
        
              while(!ops.empty())
                     values.push(applyOp(ops.pop(), values.pop(), values.pop()));
                             
                      return values.pop();
    }
 
    
             public static boolean hasPrecedence(char op1, char op2)                        
                        {
                           if(op2 == '(' || op2 == ')')
                              return false;
                           
                           if((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))          
                               return false;
                          
                           else
                                return true;
                         }
 
    public static int applyOp(char op, int b, int a)                         
              {
                switch (op)
                       {
                        case '+':
                          return a + b;
                        
                        case '-':
                            return a - b;
        
                        case '*':
                            return a * b;
        
                        case '%':
                              return a % b;
            
                        case '/':
                          if(b == 0)
                             throw new UnsupportedOperationException("Cannot divide by zero");
                             return a / b;
                                
               }
                
        return 0;
    }	

}
