package day01;

public class maopao {
    public static void main(String[] args){
        int[] arr= new int[] {43,21,-52,123,75,-89,56,12,-65,12,78,32};


        //冒泡排序
        for (int i = 0; i < arr.length-1; i++)
        {
            for(int j = 0;j<arr.length-1-i;j++) {
                if (arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+"\t");
        }
    }
}
