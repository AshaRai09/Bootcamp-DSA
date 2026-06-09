// Two pointer Approch
import java.util.*;
public class LargestRectInHistogram{
  public static  int largestRectArea(int[] heights){
    int n= heights.length;
    int maxArea = 0;
    Stack<Integer> stack = new Stack<>();
    for(int i=0 ;i<=n ;i++){   //i gives the Next Smaller Element (NSE).
      int h= (i==n)? 0 : heights[i];
      while(!stack.isEmpty() && h < heights[stack.peek()]){   // stack.peek() after popping gives the Previous Smaller Element (PSE).
        int height = stack.pop();
        int width = stack.isEmpty()? i : i-stack.peek()-1;
        int area = height*width;
        maxArea = Math.max(maxArea , area);
      }
       stack.push(i);
    }
    return maxArea;
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int heights[] = new int[n];
    for(int i=0 ; i<n ; i++){
      heights[i] = sc.nextInt();
    }
    System.out.println(largestRectArea(heights));
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