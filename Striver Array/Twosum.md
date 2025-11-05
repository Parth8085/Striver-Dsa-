**This is below the optimal approach using Map we have another approach for better solution using greedy 2-pointer if someone ask specifically about not using hashmap**



import java.util.\*;



class Solution {

&nbsp;   public int\[] twoSum(int\[] nums, int target) {

&nbsp;       Map<Integer, Integer> map = new HashMap<>();



&nbsp;       for (int i = 0; i < nums.length; i++) {

&nbsp;           int more = target - nums\[i];



&nbsp;           // check if the complement exists in map

&nbsp;           if (map.containsKey(more)) {

&nbsp;               return new int\[] { map.get(more), i };

&nbsp;           }



&nbsp;           // otherwise, store this element with its index

&nbsp;           map.put(nums\[i], i);

&nbsp;       }



&nbsp;       // if not found (edge case)

&nbsp;       return new int\[] { -1, -1 };

&nbsp;   }

}





**Greedy Approach (will only work in case of sorted array)**



**right-0th element
left-n-1th element**



int left=0;

int right=n-1;

while(left<right)

{

int sum=arr{i}+arr{j}

if(sum==target)

{
return left,right

}else if(sum <target)

{

left++;

}

else

{

right--
}



