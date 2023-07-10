package Practice_set;
import java.util.Scanner;
public class Practice_set_6_array {
    public static void main(String[] args) {
//        Question 1: sum of all element present in an array ==>

        float [] items = {30.2f,20.7f,10.5f,15.5f,25.4f};
        float sum = 0;
        for (float element:items){
            sum = sum + element;

        }
        System.out.println( "The value of sum is : " + sum);

//        Question 2 : value of an element present in array or not ==>

        int [] marks = { 12,45,56,14,54,34,23,56,32,29};
        int num = 56;
        boolean isInArray = false;
        for(int element:marks){
            if (num == element){
                isInArray = true;
                break;
            }
        }
        if (isInArray){
            System.out.println("The num is present in the array");
        }
        else {
            System.out.println("The num is not present in the array");
        }



        //Question 3: avg of an arrays element ==>

        float [] marks = {30.2f,20.7f,10.5f,15.5f,25.4f};
        float sum = 0;
        for (float element:marks){
            sum= sum+element;
        }
        System.out.println("The value of avg marks of student in physics = " +sum/ marks.length);

        //Question 4: sum of two 2-D arrays ==>

         int [][] mat1 = {{1,2,3},{4,5,6}};
        int [][] mat2 = {{2,6,13},{3,7,1}};
        int [][] result = {{0,0,0},{0,0,0}};

        for (int i=0;i<mat1.length;i++){
            for (int j=0;j<mat1[i].length;j++){
                System.out.format("setting value for i=%d and j=%d\n",i,j);
                result[i][j]= mat1[i][j] + mat2[i][j];
            }
        }

for (int i=0;i<mat1.length;i++){
            for (int j=0;j<mat1[i].length;j++){
                System.out.print(result [i][j] +" ");
                result[i][j]= mat1[i][j] + mat2[i][j];
            }
            System.out.println(" ");
        }

        //Question 5: reverse of an array ==>
        int [] arr = {1, 21, 3, 4, 5,6,78 };
        int l = arr.length;
        int n = Math.floorDiv(l , 2);
        int temp;
        int i;
        for( i=0;i<n; i++);
        {
            // swap a[i] <--> a[l-1-i]
            temp = arr[i];
            arr[i] = arr[l - 1 - i];
            arr[l - 1 - i] = temp;
        }
        for(int element: arr){
            System.out.print(element +" ");
        }
    }
}
