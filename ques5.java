
class ques5{
    static int count = 0;
    
    public static void main(String[] args) {
        int n = 10102030;
        countZeros(n);
        System.out.println("Number of zeros: " + count);
    }

    static void countZeros(int n) {
        if (n == 0) return;
        int d = n % 10;
        if (d == 0) count++;
        countZeros(n / 10);
    }
}

    

