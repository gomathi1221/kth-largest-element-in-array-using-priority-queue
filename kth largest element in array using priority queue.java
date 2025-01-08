class Solution {
    public int findKthLargest(int[] nums, int k) {
       PriorityQueue<Integer> st=new PriorityQueue<>();
       for(int i=0;i<nums.length;i++){
         st.add(nums[i]);
        if(st.size()>k){
            st.poll();
        }
       
       }
       return st.peek();

    }
}