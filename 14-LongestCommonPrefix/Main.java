class LongestCommonPrefix {
  public String longestCommonPrefix(String[] strs) {
    if (strs.length == 0 || strs == null) {
      return "";
    }

    String prefix = strs[0];
    if (strs.length == 1) {
      return prefix;
    }

    int minLen = prefix.length();
    for (String str: strs) {
      if (str.length() < minLen) {
        minLen = str.length();
      }
    }

    for (int i = 0; i < minLen; i++) {
      char c = prefix.charAt(i);
      for (int j = 1; j < strs.length; j++) {
        if (c != strs[j].charAt(i)) {
          return prefix.substring(0, i);
        }
      }
    }

    return prefix.substring(0, minLen);
  }

  public static void main(String[] args) {
    LongestCommonPrefix sol = new LongestCommonPrefix();
    System.out.println(sol.longestCommonPrefix(new String[]{"flow", "flower", "flight"}));
    System.out.println(sol.longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
    System.out.println(sol.longestCommonPrefix(new String[]{"abc", "a", "ab"}));
  }
}