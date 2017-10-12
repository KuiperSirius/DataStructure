//【例4.5】  求n！。

public class Factorial
{
    public static int factorial(int n)                    //求阶乘n!，递归方法
    {
        if (n<0)
            throw new java.lang.IllegalArgumentException("n="+n); //抛出无效参数异常
        if (n==0 || n==1)
            return 1;
        return n*factorial(n-1);
    }

    public static void main(String args[])
    {
        int n=5;
        System.out.println(n+"!="+factorial(n));           //5!=120
      
    }
}
