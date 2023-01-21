class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> a = new HashSet<>();
        Arrays.sort(nums);
        System.out.print(nums[0]);
        int n=nums.length;
        for(int i=0;i<n-2;i++)
        {
            int k=i+1;
            int j=n-1;
            while(k<j)
            {
                if(nums[i]+nums[k]+nums[j]==0)
            {
                a.add(Arrays.asList(nums[i],nums[k++],nums[j--]));
            }
            else if(nums[i]+nums[k]+nums[j]<0)
            {
                j--;
            }
            else if(nums[i]+nums[k]+nums[j]>0)
            {
                k++;
            }
            }
        }
        return new ArrayList<>(a);
    }
}
