class SqrtX {
  public int mySqrt(int x) {
    if (x < 2) {
      return x;
    }

    int left = 1;
    int right = x/2;
    int result = 0;

    while (left <= right) {
      int mid = left + (right-left)/2;
      if (mid*mid == x) {
        return mid;
      } else if (mid*mid < x) {
        result = mid;
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }

    return result;
  }

  public static void main(String[] args) {
    SqrtX sol = new SqrtX();
    System.out.println(sol.mySqrt(4));
    System.out.println(sol.mySqrt(8));
  }
}
