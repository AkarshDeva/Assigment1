

class ques3 {
    public static void main (String[] args) throws java.lang.Exception {
        int arr[] = {5, 6, 7, 10, 9};
        int i = 0;
        boolean isIncreasing = checkIncreasing(arr, i);
        
        if (isIncreasing)
            System.out.println("Array is strictly increasing");
        else
            System.out.println("Array is not strictly increasing");
    }

    static boolean checkIncreasing(int arr[], int i) {
        int n = arr.length;
        if (i == n - 1) return true;
        if (arr[i] >= arr[i + 1]) return false;
        return checkIncreasing(arr, i + 1);
    }
}
