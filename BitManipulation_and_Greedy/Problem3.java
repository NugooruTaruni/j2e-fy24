/*

Question 3:

There are n boxes with different quantities of candies in each of them. The 𝑖-th box has 𝑎𝑖 candies inside. You also
have n friends that you want to give the candies to, so you decided to give each friend a box of candies. But, you
don't want any friends to get upset so you decided to eat some (possibly none) candies from each box so that all
boxes have the same quantity of candies in them.
Note that you may eat a different number of candies from different boxes and you cannot add candies to any of the
boxes.
What's the minimum total number of candies you have to eat to satisfy the requirements?


Example 1:
Input: n = 5, a = [1,2,3,4,5]
Output: 10


Example 2:
Input: n = 10, a = [1, 2, 3, 5, 1, 2, 7, 9, 13, 5]
Output: 38

*/



import java.util.*;
public class Problem3 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(minCandies(arr));
        sc.close();
    }
    public static int minCandies(int[] arr) {
        int count = 0;
        Arrays.sort(arr);
        for(int i=arr.length - 1; i>=0; i--){
            while(arr[i] != arr[0])
            {
                arr[i]--;
                count++;
            }
        }
        return count;
    }    
}
