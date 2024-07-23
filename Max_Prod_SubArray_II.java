package Tcs_Ques;

public class Max_Prod_SubArray_II {
    public static void main(String[] args) {
        int[] arr={1,-2,-3,0,-4,-5};
        int n=arr.length;

        int max=Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            int product=1;
            for (int j=i;j<n;j++){
                product=product*arr[j];
                max=Math.max(max,product);
            }
        }


        System.out.println("Max:"+max);
    }
}
