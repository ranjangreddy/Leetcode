class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> position = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            position.put(nums[i],i);
        }
        for(int i=0; i<nums.length; i++){
            System.out.println(position.get(target-nums[i]));
            if(position.containsKey(target-nums[i]) && position.get(target-nums[i])!=i){
                return new int[]{position.get(target-nums[i]),i};
            }
        }
        return new int[]{0,0};
    }
}