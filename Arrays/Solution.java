package Arrays;
import java.util.Scanner;
class Solution {
    public static void main(String[] args){
        int [] happiness={2,83,62};
        System.out.println(maximumHappinessSum(happiness,3));
    }
    public static long maximumHappinessSum(int[] happiness, int k) {
        int max,happy=0,n=happiness.length,index=0;
        for(int i=1;i<=k;i++){
            max=0;
            for(int j=0;j<n;j++){
                if(happiness[j]>max){
                    max=happiness[j];
                    index=j;
                }
            }
            happy=happy+max;
            n--;
            for(int s=index;s<happiness.length-1;s++){
                happiness[s]=happiness[s+1];
            }
            for(int l=0;l<n;l++){
                if(happiness[l]>0){
                    happiness[l]=happiness[l]-1;
                }
            }
        }
        return happy;
    }
}