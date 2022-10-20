class TwoSums {
    public int[] twoSum(int[] nums, int target) {
        int z = 0;
        int y = 0;
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                if (i == j)
                    break;
                
                if(nums[i] + nums[j] == target) {
                	z = i;
                	y = j;
                	break;
            	}
            }
        }
        
        int[] arr = {z,y};
        return arr;
    }
}
