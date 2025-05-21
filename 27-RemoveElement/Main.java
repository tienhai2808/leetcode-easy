class RemoveElement {
  public int removeElement(int[] nums, int val) {
    if (nums.length == 0) {
      return 0;
    }

    int i = 0;
    for (int j = 0; j < nums.length; j++) {
      if (nums[j] != val) {
        nums[i] = nums[j];
        i++;
      }
    }

    return i;
  }

  public static void main(String[] args) {
    RemoveElement sol = new RemoveElement();
    System.out.println(sol.removeElement(new int[] {3, 2, 2, 3}, 3));
    System.out.println(sol.removeElement(new int[] {0, 1, 2, 2, 3, 0, 4, 2}, 2))
  }
}