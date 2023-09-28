class MergedArr {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int merged_len = m+n;
        int temp_arr[] = new int[merged_len];
        

        //index variable for temp array, arr1, and arr2
        int i = 0; //index of nums1
        int j = 0; // index of m, temp_arr
        int k = 0; //index of n, nums2
        
        // populate arr1 to temp array
        for(i=0;i<m;i++)
        {
            temp_arr[i] = nums1[i];
        }

  
               
        i=0;
        while(i < nums1.length && k<n && j<m) // merge copy of arr1 and arr2 into arr1. stop when the end of either array is found or the 
        {
            if(temp_arr[j] <= nums2[k]) // nums2 has higher value
            {
                nums1[i] = temp_arr[j];
                i++;
                j++;
                
            }
            else
            { // nums1 has higher value
                nums1[i] = nums2[k];
                i++;
                k++;
            }
        }

        //merge the remaining values of the arrays left out due to different lengths
        while(j<m)
        {
            nums1[i] = temp_arr[j];
            i++;
            j++;
        }
         
        while(k<n)
        {
            nums1[i] = nums2[k];
            i++;
            k++;
        }
        
 

    }
    
    public static void main(String args[])
    {
        int arr1[] = {1,2,3,0,0,0};
        int arr2[] = {2,5,6};
        int m = 3;
        int n = 3;

        MergedArr.merge(arr1, m, arr2, n);

        for(int x : arr1){
            System.out.print(x);
        }
    }
}