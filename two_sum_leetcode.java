class Solution{
Public int[] twosum(int[] nums,int target){
HashMap<Integer,Integer>map=new HashMap();
for(int i=0;i<nums.length;i++){
int complement=target-nums[i];
if(map.containskey(complement))
return new int[]{map.get(complement),i};
map.put(nums[i],I);
}
return null;
}
}