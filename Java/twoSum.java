// Two Sum program

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res=new int[2];
        Map<Integer, Integer>map= new HashMap<Integer, Integer>();
        
            int n=nums.length;
        for(int i=0;i<n;i++){
            if(map.containsKey(target - nums[i])){
                res[1]=i;
                res[0]=map.get(target- nums[i]);
                return res;
            }
            map.put(nums[i],i);
            
        }
        return res;
    }
}

/*
Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
*/
