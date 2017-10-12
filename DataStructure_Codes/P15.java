public class P15{	
	public static void main(String args[]){
		int n=10,count=0,sum=0;
		for(int i=1;i<=n;i++)
			for(int j=1;j<=i;j++)
				for(int k=1;k<=j;k++)
					count++;
		sum=(int)(Math.pow(n,3)+3*Math.pow(n,2)+2*n)/6;
		System.out.println("count= "+count);
		System.out.println("sum= "+sum);		
	}
}