public class SmallestMissingInteger
{
    public static int findSmallestMissingPositive(int[] nums)
    {
        int n=nums.length;
        // Rearrange the array
        for (int i=0;i<n;i++)
        {
            while (nums[i]>0&&nums[i]<=n&&nums[nums[i]-1]!=nums[i])
            {
                swap(nums,i,nums[i]-1);
            }
        }
        //Find the smallest missing positive 
        for (int i=0;i<n;i++)
        {
            if (nums[i]!=i+1)
            {
                return i+1;
            }
        }
        // If all elements match their desired values, return the next positive integer
        return n+1;
    }
    public static void swap(int[] nums,int i,int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static void main(String[] args)
    {
        int[] nums={3,4,-1,1};
        int smallestMissingPositive = findSmallestMissingPositive(nums);
        System.out.println("Smallest Missing Positive Number: "+smallestMissingPositive);
    }
}