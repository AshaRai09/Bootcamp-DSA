// 12. Container With Most Water 
import java.util.*;
class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int l=0;
        int r= height.length-1;
        int maxArea1=0;
        while(l<=r){
           int  length= Math.min(height[l],height[r]);
           int  width= r-l;
           int  Area = length* width;
        maxArea1= Math.max(Area , maxArea1);
        if(height[l]<=height[r]){
            l++;
        }
        else{
            r--;
        }
        }
        return maxArea1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int height[] = new int[n];
        for(int i=0 ; i<n ; i++){
            height[i]= sc.nextInt();
        }
        maxArea(height);
    }
}