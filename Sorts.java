public class Sorts {

    public static int[] selectionSort(int[] numbers){

        for(int i = 0;i<numbers.length-1;i++){

            int position = i;

            for(int j = i + 1; j<numbers.length; j++){
                if(numbers[j] < numbers[position]){
                    position = j;
                }
            }

            int temp = numbers[i];
            numbers[i] = numbers[position];
            numbers[position] = temp;

        }

        return numbers;
    }

    public static int[] insertionSort(int[] x){
        for(int i = 1;i<x.length;i++){
            int temp = x[i];
            int j = i-1;
            while(j>=0 && x[j]>temp){
                x[j+1] = x[j];
                j--;
            }
            x[j+1] = temp;
        }
        return x;
    }


    
}
