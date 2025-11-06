

class ques2 {
    public static void main (String[] args) throws java.lang.Exception {
        int arr[] = {2, 5, 8, 1, 3};
        int n = arr.length;
        int i = 1;
        int max = arr[0];
        max = high(arr, i, n, max);
        System.out.println("Maximum element: " + max);
    }

    static int high(int arr[], int i, int n, int max) {
        if (i == n) return max;
        if (arr[i] > max) {
            max = arr[i];
        }
        return high(arr, i + 1, n, max);
    }
}

    

