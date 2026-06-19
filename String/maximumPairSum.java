/*  Minimize Maximum Pair sum
For example, if we have pairs (1,5), (2,3), and (4,4), the maximum pair sum would be max(1+5, 2+3, 4+4) = max(6, 5, 8) = 8.
  
amazon
*/
import java.util.*;
public class maximumPairSum{
  int minPairSum(int nums){
    Arrays.sort(nums);
    int i=0;
    int j= nums.length-1;
    int res=0;
    while(i<j){
      int sum = nums[i]+nums[j];
       res = Math.max(res,sum);
        i++;
        j--;
    }
    return res;
  }
}