
class ques6 {
    public static void main(String[] args) {
        int n = 13;
        decToBin(n);
    }

    static void decToBin(int n) {
        if (n == 0) return;
        decToBin(n / 2);
        System.out.print(n % 2);
    }
}
 
