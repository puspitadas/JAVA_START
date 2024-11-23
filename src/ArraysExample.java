import java.util.Arrays;
public class ArraysExample {
    public static void main(String[] args) {
//        float [] arr1 = {5,7,6,3.2f,7.5f};
//        float sum1 = 0;
//        for(float element : arr1){
//            sum1 = sum1 + element; // sum1+=element
//        }
//        System.out.println(sum1);

        //Problem 2: Given integer is present in an array or not

//        int [] arr2 = {3,6,4,8,9};
//        System.out.println("Enter the integer you want to find:");
//        Scanner sc2 = new Scanner(System.in);
//        int input = sc2.nextInt();
//        boolean isinArray = false;
//        for(int element:arr2) {
//            if (input == element) {
//                isinArray = true;
//                break;
//            }
//        }
//        if(isinArray){
//            System.out.println("The value is in the array");
//        }
//        else{
//            System.out.println("The value is not present in the array");
//        }

        //Problem 4 : Add 2 matrices of size 2 x 3
//        int [][] mat1 = {{2,3,4},
//                         {5,3,4}};
//        int [][] mat2 = {{1,2,3},
//                         {1,4,5}};
//
//        int [][] result = {{0,0,0},
//                           {0,0,0}};
//
//        for(int i=0; i<mat1.length;i++) { //row number of times
//            for (int j = 0; j < mat1[i].length; j++) { //column number of times
//                System.out.printf("Setting values for i=%d and j=%d\n",i,j);
//                result[i][j] = mat1[i][j] + mat2[i][j];
//            }
//        }
//
//        for(int i=0; i<mat1.length;i++){  //row number of times
//            for(int j=0; j< mat1[i].length;j++){  //column number of times
//
//                System.out.print(result[i][j]+" ");
//                result[i][j] = mat1[i][j] + mat2[i][j];
//            }
//            System.out.println(" ");
//        }
        // Problem 5: Reverse an array

//        int [] arr5 = {3,6,4,7,8};
//        int left =0;
//        int right = arr5.length-1;
//        while(left<right){
//            int temp = arr5[left];
//            arr5[left] = arr5[right];
//            arr5[right] = temp;
//            left++;
//            right--;
//        }
//        System.out.println("The reversed array is:"+Arrays.toString(arr5));

        //Problem 6: Maximum element in an array

        int[] arr6 = {4,7,5,2,9,1};
        int max=0;
        for(int e:arr6){
            if(e>max){
                max=e;
            }
        }
        System.out.println("The value of the maximum element in this array is:"+max);

        //Problem 8: find if the array is sorted or not
        int[] arr7 = {4,7,5,2,9,1};
        boolean isSorted = true;
        for(int i=0;i< arr7.length-1;i++){
            if (arr7[i]>arr7[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The array is sorted");
        }
        else{
            System.out.println("The array is not sorted");
        }


    }


}
