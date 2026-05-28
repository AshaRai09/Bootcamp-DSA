// Frequency sort means sorting elements based on how many times they occur.
import java.util.*;

public class FrequencySort {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();
    // frequency count
    for(int num: arr){
      map.put(num,map.getOrDefault(num))
    }