//ѭ����������
public class CirSinglyList<T>
{
    public Node<T> head;                              //ͷָ�룬ָ��ѭ���������ͷ���

    public CirSinglyList()                      //Ĭ�Ϲ��췽���������ѭ��������
    {
        this.head = new Node<T>();                    //����ͷ���
        this.head.next = this.head;
    }

    //��element�����еĶ�������쵥��������β���빹�쵥����
    public CirSinglyList(T[] element)
    {
        this();                                            //�����յ�����ֻ��ͷ���
        Node<T> rear=this.head;                            //rearָ���������һ�����
        for (int i=0; i<element.length; i++)               //��element==null���׳��ն����쳣
        {                                                  //��element.length==0�����������
            rear.next=new Node<T>(element[i], this.head);  //β���룬�����������rear���֮��
            rear = rear.next;                              //rearָ���µ���β���
        }
    }
    
    public boolean isEmpty()                          //�ж�ѭ���������Ƿ��
    {
        return this.head.next==this.head;
    }
    
    public String toString()                          //����ѭ������������Ԫ�ص������ַ���
    {
        String str="(";
        Node<T> p = this.head.next;
        while (p!=this.head)                          //�����������ѭ�������ı���
        {
            str += p.data.toString();
            if (p!=this.head) 
                str += ", ";                          //�������һ�����ʱ��ӷָ���
            p = p.next;
        }
        return str+")";                               //�ձ���()
    }
    
    public int size()                               //����ѭ���������ȣ�����������㷨��O(n)    
    {
        int i=0; 
        for (Node<T> p=this.head.next;  p!=this.head;  p=p.next)
            i++;
        return i;
    }
    
    public T get(int i)                  //���ص�i����0����Ԫ�أ���i<0����ڱ��򷵻�null��O(n)
    {
        if (i>=0)
        {
            Node<T> p=this.head.next;
            for (int j=0; p!=this.head && j<i; j++)
                p = p.next;
            if (p!=this.head)
                return p.data;                             //pָ���i�����
        }
        return null;                                       //��i<0����ڱ�ʱ
    }
   
    //���õ�i����0����Ԫ��ֵΪx����i<0����ڱ����׳����Խ���쳣����x==null����������O(n)
    public void set(int i, T x)
    {
        if (x==null)  return;                              //�������ÿն���
        Node<T> p=this.head.next;
        for (int j=0; p!=this.head && j<i; j++)
            p = p.next;
        if (i>=0 && p!=this.head)
            p.data = x;                                    //pָ���i�����
        else throw new IndexOutOfBoundsException(i+"");    //�׳����Խ���쳣
    }
    
  //����x��Ϊ��i��Ԫ��
    public void insert(int i, T x) 
    {
    	//�ڴ˴���Ӵ���
    }
    
  //�����Ա�������Ԫ��x
    public void insert(T x)
    {
    	//�ڴ˴���Ӵ���
    }
    
  //ɾ����i��Ԫ�ز����ر�ɾ����Ԫ��
    public T remove(int i)
    {
		//�˴���Ӵ���
		return null;	//�����ֻ������֤�﷨������ʵ�������д�����
    }
    
  //ɾ�����Ա�����Ԫ��
    public void clear()
    {
    	//�ڴ˴���Ӵ���
    	return;
    }
    
  //���ң������״γ��ֹؼ���Ϊkey��Ԫ�ء�
    public T search(T key)
    {
		//�˴���Ӵ���
		return null;	//�����ֻ������֤�﷨������ʵ�������д�����
    }
}
  
