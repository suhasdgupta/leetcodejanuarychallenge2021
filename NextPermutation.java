class NextPermutation {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        if(n<2)
            return;
        int index=n-1;        
        while(index>0){
            if(nums[index-1]<nums[index])
                break;
            index--;
        }
        if(index==0){
            reverseSort(nums,0,n-1);
            return;
        }
        else{
            int val=nums[index-1];
            int j=n-1;
            while(j>=index){
                if(nums[j]>val)
                    break;
                j--;
            }
            swap(nums,j,index-1);
            reverseSort(nums,index,n-1);
            return;
        }
    }

    public void swap(int[] nums, int i, int j){
        int temp=0;
        temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public void reverseSort(int[] nums, int start, int end){   
        if(start>end)
            return;
        for(int i=start;i<=(end+start)/2;i++)
            swap(nums,i,start+end-i);
    }
}
