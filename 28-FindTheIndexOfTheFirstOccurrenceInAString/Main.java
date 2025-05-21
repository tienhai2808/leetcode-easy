class FindTheIndexOfTheFirstOccurrenceInAString {
  public int strStr(String haystack, String needle) {
    if (needle.length() == 0) {
      return 0;
    }

    int m = haystack.length();
    int n = needle.length();
    if (m < n) {
      return -1;
    }

    for (int i = 0; i <= m - n; i++) {
      if (haystack.substring(i, i + n).equals(needle)) {
        return i;
      }
    }

    return -1;
  }

  public static void main(String[] args) {
    FindTheIndexOfTheFirstOccurrenceInAString sol = new FindTheIndexOfTheFirstOccurrenceInAString();
    System.out.println(sol.strStr("sadbutsad", "sad"));
    System.out.println(sol.strStr("leetcode", "leeto"));
  }
}
