//SinglyList_Recursion<T>类中的求长度，判断是否相等等方法用递归实现。
class SinglyList_Recursion<T>{
	public Node<T> head;                              //头指针，指向单链表的头结点
	public SinglyList_Recursion()                         //默认构造方法，构造空单链表
	{
		this.head = new Node<T>();                    //创建头结点，data和next值均为null
	}

	public boolean isEmpty()                          //判断单链表是否空，O(1)
	{
		return this.head.next==null;
	}

	public void insert(int i, T x) 
	{
		if (x==null)  return;                         //不能插入空对象         
		Node<T> p=this.head;                          //p指向头结点
		for (int j=0;  p.next!=null && j<i;  j++)     //寻找插入位置
			p = p.next;                               //循环停止时，p指向第i-1结点或最后一个结点
		p.next = new Node<T>(x, p.next);              //插入x作为p结点的后继结点，包括头插入（i<=0）、中间/尾插入（i>0）
	}

	public T remove(int i)
	{
		if (i>=0)
		{
			Node<T> p=this.head;
			for (int j=0;  p.next!=null && j<i;  j++)      //定位到待删除结点（i）的前驱结点（i-1）
				p = p.next;
			if (p.next!=null)
			{
				T old = p.next.data;                       //获得原对象
				p.next = p.next.next;                      //删除p的后继结点
				return old;
			}
		}
		return null;                                       //当i<0或大于表长时
	}

	public String toString()                               //返回单链表描述字符串
	{
		return "("+ this.toString(this.head.next) +")";
	}
	public String toString(Node<T> p)                      //返回从p结点开始的子表描述字符串，递归方法
	{
		if (p==null)
			return "";
		String str=p.data.toString();
		if (p.next!=null) 
			str+=", ";
		return str+this.toString(p.next);                 //递归调用
	}           

	public int size()                                    //返回单链表长度
	{
		return size(this.head.next);
	}
	public int size(Node<T> p)                           //返回从p结点开始的单链表长度，递归方法
	{
		//此处添加代码
		return 0;	//此语句只用来验证语法，根据实际情况改写此语句
	}

	public boolean equals(Object obj)                      //比较两条单链表是否相等 
	{
		if (obj == this)
			return true;
		if (obj instanceof SinglyList_Recursion)    
		{
			SinglyList_Recursion<T> list = (SinglyList_Recursion<T>)obj;
			return equals(this.head.next, list.head.next);
		}
		return false;
	}
	private boolean equals(Node<T> p, Node<T> q)           //比较两条单链表是否相等，递归方法
	{
		//此处添加代码
		return true;	//此语句只用来验证语法，根据实际情况改写此语句
	}  	
}

public class ShiYan7{
	public static void main(String args[])
	{
		SinglyList_Recursion<Integer> list1=new SinglyList_Recursion<Integer>();
		System.out.println(list1.toString());
		System.out.println(list1.isEmpty());
		System.out.println(list1.size());

		list1.insert(0,new Integer(20));
		list1.insert(100,new Integer(200));
		System.out.println(list1.toString());
		System.out.println(list1.isEmpty());
		System.out.println(list1.size());	

		System.out.println(list1.remove(0).toString());
		System.out.println(list1.toString());
		System.out.println(list1.isEmpty());
		System.out.println(list1.size());
		
		System.out.println("----------------------------------");		
		SinglyList_Recursion<Integer> list2=new SinglyList_Recursion<Integer>();		
		System.out.println(list1.equals(list2));
		list2.insert(0,new Integer(200));
		System.out.println(list1.equals(list2));	
	}	
}
