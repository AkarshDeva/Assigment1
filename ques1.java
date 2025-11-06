
class ques1
{
	static int count=0;
	public static void main (String[] args) throws java.lang.Exception
	{
        int n=655;
        countofdigits(n);
        System.out.println(count);
    }
    static void  countofdigits(int n)
    {
        if(n==0) return;

        
        count++;
        countofdigits(n/10);
    }

}