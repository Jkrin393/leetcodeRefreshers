/*
 Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
Return k.

 */

class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) 
    {
        int curr;
        int k = 1;

        for (curr=1; curr<nums.length; curr++)
        {
            if(nums[curr] != nums[curr-1])
            {
                nums[k] = nums[curr];
                k++;
            }
        }

        return k;

        
    }
     public static void main(String args[])
    {
        int inputArr[] = {0,0,1,1,1,2,2,3,3,4};

        int k = removeDuplicates(inputArr);
        System.out.println("k = " + k);

        for(int i = 0;i<k;i++){
            System.out.println(inputArr[i]);

        }
        
    }
    
}