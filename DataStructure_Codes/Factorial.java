//����4.5��  ��n����

public class Factorial
{
    public static int factorial(int n)                    //��׳�n!���ݹ鷽��
    {
        if (n<0)
            throw new java.lang.IllegalArgumentException("n="+n); //�׳���Ч�����쳣
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
