public class script {
    // Binary Search function
    static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2; // Avoids overflow
            
            if (arr[mid] == target)
                return mid; // Target found at index mid
            
            if (arr[mid] < target)
                left = mid + 1; // Search in the right half
            else
                right = mid - 1; // Search in the left half
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13};
        int target = 7;
        
        int result = binarySearch(arr, target);
        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found");
    }
}
/*Example Input and Output:
pgsql
Copy
Edit
Input: arr = [1, 3, 5, 7, 9, 11, 13], target = 7
Output: Element found at index: 3*/