public class SortedSeqList
{
	private Integer[] element;//�������飬˽�г�Ա
	private int n;         //����˳�����

	public SortedSeqList(int size)                 
	{
		this.element = new Integer[size];  
		this.n = 0;
	}

	public SortedSeqList()                       
	{
		this(64);
	}

	public boolean isEmpty()      //�ж�����˳����Ƿ�Ϊ��
	{
		return this.n==0;
	}

	public int size()     //��������˳���ĳ���
	{
		return this.n;
	}

	public Integer get(int i)                 
	{                                         
		if (i>=0 && i<this.n)
			return (Integer)this.element[i];           
		return null;
	}
	
	public String toString()         
	{
		String str="(";
		if (this.n>0)
			str += this.element[0].toString();
		for (int i=1; i<this.n; i++)
			str += ", "+this. element[i].toString();
		return str+") ";
	}

	public void insert(Integer x) //����Ԫ��x��ʹ��˳����е�����Ԫ����Ȼ���� 
	{                                          
		//�˴���Ӵ���
	}

	public void remove(int i)                
	{                                       
		if (this.n==0 || i<0 || i>=this.n) 
			return;
		for (int j=i; j<this.n-1; j++)  
			this.element[j] = this.element[j+1];
		this.element[this.n-1]=null;
		this.n--;               
	}

	public void remove(Integer x)     //ɾ��ָ������δ�ҵ�ָ��Ԫ�أ���ɾ����O(n)
	{
		//�˴���Ӵ���
	}

	public void clear()                    
	{
		this.n=0;
	}
}


