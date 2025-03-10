import java.util.Arrays;
import java.util.HashSet;

public class script {
    public static int[] findIntersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> resultSet = new HashSet<>();

        // Add elements of nums1 to set1
        for (int num : nums1) {
            set1.add(num);
        }

        // Check for intersection
        for (int num : nums2) {
            if (set1.contains(num)) {
                resultSet.add(num);
            }
        }

        // Convert set to array
        int[] result = new int[resultSet.size()];
        int i = 0;
        for (int num : resultSet) {
            result[i++] = num;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 3, 4};
        int[] nums2 = {2, 2, 4, 5};

        int[] intersection = findIntersection(nums1, nums2);
        System.out.println("Intersection: " + Arrays.toString(intersection));
    }
}
