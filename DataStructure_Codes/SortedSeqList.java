public class SortedSeqList
{
	private Integer[] element;//对象数组，私有成员
	private int n;         //排序顺序表长度

	public SortedSeqList(int size)                 
	{
		this.element = new Integer[size];  
		this.n = 0;
	}

	public SortedSeqList()                       
	{
		this(64);
	}

	public boolean isEmpty()      //判断排序顺序表是否为空
	{
		return this.n==0;
	}

	public int size()     //返回排序顺序表的长度
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

	public void insert(Integer x) //插入元素x，使得顺序表中的所有元素仍然有序。 
	{                                          
		//此处添加代码
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

	public void remove(Integer x)     //删除指定对象，未找到指定元素，不删除，O(n)
	{
		//此处添加代码
	}

	public void clear()                    
	{
		this.n=0;
	}
}


