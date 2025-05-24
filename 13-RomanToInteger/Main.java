import java.util.Map;
import java.util.HashMap;

class RomanToInteger {
  public int romanToInteger(String s) {
    Map<Character, Integer> roman = new HashMap<>();
    roman.put('I', 1);
    roman.put('V', 5);
    roman.put('X', 10);
    roman.put('L', 50);
    roman.put('C', 100);
    roman.put('D', 500);
    roman.put('M', 1000);

    int total = 0;
    int length = s.length();

    for (int i = 0; i < length; i++) {
      int val = roman.get(s.charAt(i));
      if (i + 1 < length && val < roman.get(s.charAt(i + 1))) {
        total -= val;
      } else {
        total += val;
      }
    }

    return total;
  }

  public static void main(String[] args) {
    RomanToInteger sol = new RomanToInteger();
    System.out.println(sol.romanToInteger("III"));
    System.out.println(sol.romanToInteger("LVIII"));
    System.out.println(sol.romanToInteger("MCMXCIV"));
  }
}