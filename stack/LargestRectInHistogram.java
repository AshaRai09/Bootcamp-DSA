// Two pointer Approch
import java.util.*;
public class LargestRectInHistogram{
  public static void main(String args[]){

  }
}
/*
Brute force ---
for(int i=0;i<height.length ;i++){
int h = height[i];
for(int j=i ;j<height.length;j++){
     h= Math.min(h,height[j]);
     width = j-i+1;
     Area = h*width;
     maxArea = Math.max(maxArea , Area);
}
}
return max_Area;
*/