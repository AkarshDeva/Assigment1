class Codechef {
    public static void main(String[] args) {
        int n = 12345;
        int reversed = reverseNumber(n, 0);
        System.out.println("Reversed number: " + reversed);
    }

    static int reverseNumber(int n, int rev) {
        if (n == 0) return rev;
        int d = n % 10;
        rev = rev * 10 + d;
        return reverseNumber(n / 10, rev);
    }
}
