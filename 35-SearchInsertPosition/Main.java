class SearchInsertPosition {
  public int searchInsertPosition(int[] nums, int target){
    int left = 0;
    int right = nums.length - 1;

    while (left <= right) {
      int mid = (left + right) / 2;
      if (nums[mid] == target) {
        return mid;
      } else if(nums[mid] < target) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }

    return left;
  }

  public static void main(String[] args) {
    SearchInsertPosition sol = new SearchInsertPosition();
    System.out.println(sol.searchInsertPosition(new int[]{1, 3, 5, 6}, 5));
    System.out.println(sol.searchInsertPosition(new int[]{1, 3, 5, 6}, 2)); 
    System.out.println(sol.searchInsertPosition(new int[]{1, 3, 5, 6}, 7));
  }
}
