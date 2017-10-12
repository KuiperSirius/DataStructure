//SinglyList_Recursion<T>���е��󳤶ȣ��ж��Ƿ���ȵȷ����õݹ�ʵ�֡�
class SinglyList_Recursion<T>{
	public Node<T> head;                              //ͷָ�룬ָ�������ͷ���
	public SinglyList_Recursion()                         //Ĭ�Ϲ��췽��������յ�����
	{
		this.head = new Node<T>();                    //����ͷ��㣬data��nextֵ��Ϊnull
	}

	public boolean isEmpty()                          //�жϵ������Ƿ�գ�O(1)
	{
		return this.head.next==null;
	}

	public void insert(int i, T x) 
	{
		if (x==null)  return;                         //���ܲ���ն���         
		Node<T> p=this.head;                          //pָ��ͷ���
		for (int j=0;  p.next!=null && j<i;  j++)     //Ѱ�Ҳ���λ��
			p = p.next;                               //ѭ��ֹͣʱ��pָ���i-1�������һ�����
		p.next = new Node<T>(x, p.next);              //����x��Ϊp���ĺ�̽�㣬����ͷ���루i<=0�����м�/β���루i>0��
	}

	public T remove(int i)
	{
		if (i>=0)
		{
			Node<T> p=this.head;
			for (int j=0;  p.next!=null && j<i;  j++)      //��λ����ɾ����㣨i����ǰ����㣨i-1��
				p = p.next;
			if (p.next!=null)
			{
				T old = p.next.data;                       //���ԭ����
				p.next = p.next.next;                      //ɾ��p�ĺ�̽��
				return old;
			}
		}
		return null;                                       //��i<0����ڱ�ʱ
	}

	public String toString()                               //���ص����������ַ���
	{
		return "("+ this.toString(this.head.next) +")";
	}
	public String toString(Node<T> p)                      //���ش�p��㿪ʼ���ӱ������ַ������ݹ鷽��
	{
		if (p==null)
			return "";
		String str=p.data.toString();
		if (p.next!=null) 
			str+=", ";
		return str+this.toString(p.next);                 //�ݹ����
	}           

	public int size()                                    //���ص�������
	{
		return size(this.head.next);
	}
	public int size(Node<T> p)                           //���ش�p��㿪ʼ�ĵ������ȣ��ݹ鷽��
	{
		//�˴���Ӵ���
		return 0;	//�����ֻ������֤�﷨������ʵ�������д�����
	}

	public boolean equals(Object obj)                      //�Ƚ������������Ƿ���� 
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
	private boolean equals(Node<T> p, Node<T> q)           //�Ƚ������������Ƿ���ȣ��ݹ鷽��
	{
		//�˴���Ӵ���
		return true;	//�����ֻ������֤�﷨������ʵ�������д�����
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
