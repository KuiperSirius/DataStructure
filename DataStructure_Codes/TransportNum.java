public class TransportNum
{
	public static void main(String args[ ])
	{
        LinkedStack<Integer> stack = new LinkedStack<Integer>(); 
		int N=27;
		int d=2;
		System.out.print("("+N+")10 = (");
		while(N!=0)
		{
			int r;
			r=N%d;
			N=N/d;
			stack.push(new Integer(r));
		}
		while(!stack.isEmpty())
			System.out.print((int)stack.pop());
		System.out.println(")"+d);
	}
}
