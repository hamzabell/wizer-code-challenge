public class rotatearray {
    public static void main(String[] args){
        int[] array = {1,2,3,4,5};

        int[] result = rotateArrayByN(array, 4);
        for (int i =0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
    }

    static int[] rotateArrayOnce(int[] a){
        int m = a.length -1;
        int n = m - 1;
        int lastElement = a[m];

        for (int i = 0; i < a.length -1; i++){
            a[m] = a[n];
            m--;
            n--;
        }
        a[0] = lastElement;
        return a;
    }

    public static int[] rotateArrayByN(int[] array, int n){
        int[] inputArray = array;
        for (int i= 0; i< n; i++){
            inputArray = rotateArrayOnce(inputArray);
        }
        return inputArray;
    }
}