
class ques4 {
    public static void main (String[] args) throws java.lang.Exception {
        String s = "12345"; // you can try "akarsh" or "123a" to test
        boolean result = isDigits(s, 0);
        
        if (result)
            System.out.println("All characters are digits");
        else
            System.out.println("Not all characters are digits");
    }

    static boolean isDigits(String s, int i) {
        if (i == s.length()) return true; 
        if (!Character.isDigit(s.charAt(i))) return false;
        return isDigits(s, i + 1);
    }
}
