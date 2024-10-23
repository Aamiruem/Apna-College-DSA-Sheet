// import java.util.Arrays;

// public class MajorityElement {

//     public int majorityElement(int[] nums) {
//         Arrays.sort(nums);
//         return nums[nums.length/2];
//     }
//     public static void main(String[] args) {
//         int[] nums = {2,2,1,1,1,2,2};
//         MajorityElement me = new MajorityElement();
//         System.out.println(me.majorityElement(nums));
//         // Output: 2

//         int[] nums2 = {3,2,3};
//         MajorityElement me2 = new MajorityElement();
//         System.out.println(me2.majorityElement(nums2));
//         // Output: 3
//         int[] nums3 = {1};
//         MajorityElement me3 = new MajorityElement();
//         System.out.println(me3.majorityElement(nums3));
//         // Output: 1
//     }
// }

// import java.util.HashMap;
// import java.util.Map;

// public class MajorityElement {
//     public int majorityElement(int[] nums) {
//         int n = nums.length;
//         Map<Integer, Integer> map = new HashMap<>();

//         for (int i = 0; i < n; i++) {
//             map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
//         }

//         n = n / 2;
//         for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//             if (entry.getValue() > n) {
//                 return entry.getKey();
//             }
//         }

//         return 0;
//     }

//     public static void main(String[] args) {
//         int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
//         MajorityElement me = new MajorityElement();
//         System.out.println(me.majorityElement(nums));
//     }
// }


public class MajorityElement {
    // Boyer-Moore Voting Algorithm
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
        MajorityElement me = new MajorityElement();
        System.out.println(me.majorityElement(nums));
    }
}