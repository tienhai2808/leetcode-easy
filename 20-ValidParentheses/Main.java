import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class ValidParentheses {
  public boolean isValid(String s) {
    Map<Character, Character> pairs = new HashMap<>();
    pairs.put(')', '(');
    pairs.put(']', '[');
    pairs.put('}', '{');

    Stack<Character> stack = new Stack<>();

    for (char c: s.toCharArray()) {
      if (pairs.containsKey(c)) {
        if (stack.isEmpty() || stack.peek() != pairs.get(c)) {
          return false;
        }

        stack.pop();
      } else {
        stack.add(c);
      }
    }

    return stack.isEmpty();
  }

  public static void main(String[] args) {
    ValidParentheses sol = new ValidParentheses();
    System.out.println(sol.isValid("()"));
    System.out.println(sol.isValid("()[]{}"));
    System.out.println(sol.isValid("(]"));
    System.out.println(sol.isValid("([])"));
  }
}