//循环单链表类
public class CirSinglyList<T>
{
    public Node<T> head;                              //头指针，指向循环单链表的头结点

    public CirSinglyList()                      //默认构造方法，构造空循环单链表
    {
        this.head = new Node<T>();                    //创建头结点
        this.head.next = this.head;
    }

    //由element数组中的多个对象构造单链表。采用尾插入构造单链表
    public CirSinglyList(T[] element)
    {
        this();                                            //创建空单链表，只有头结点
        Node<T> rear=this.head;                            //rear指向单链表最后一个结点
        for (int i=0; i<element.length; i++)               //若element==null，抛出空对象异常
        {                                                  //若element.length==0，构造空链表
            rear.next=new Node<T>(element[i], this.head);  //尾插入，创建结点链入rear结点之后
            rear = rear.next;                              //rear指向新的链尾结点
        }
    }
    
    public boolean isEmpty()                          //判断循环单链表是否空
    {
        return this.head.next==this.head;
    }
    
    public String toString()                          //返回循环单链表所有元素的描述字符串
    {
        String str="(";
        Node<T> p = this.head.next;
        while (p!=this.head)                          //遍历单链表的循环条件改变了
        {
            str += p.data.toString();
            if (p!=this.head) 
                str += ", ";                          //不是最后一个结点时后加分隔符
            p = p.next;
        }
        return str+")";                               //空表返回()
    }
    
    public int size()                               //返回循环单链表长度，单链表遍历算法，O(n)    
    {
        int i=0; 
        for (Node<T> p=this.head.next;  p!=this.head;  p=p.next)
            i++;
        return i;
    }
    
    public T get(int i)                  //返回第i（≥0）个元素，若i<0或大于表长则返回null，O(n)
    {
        if (i>=0)
        {
            Node<T> p=this.head.next;
            for (int j=0; p!=this.head && j<i; j++)
                p = p.next;
            if (p!=this.head)
                return p.data;                             //p指向第i个结点
        }
        return null;                                       //当i<0或大于表长时
    }
   
    //设置第i（≥0）个元素值为x。若i<0或大于表长则抛出序号越界异常；若x==null，不操作。O(n)
    public void set(int i, T x)
    {
        if (x==null)  return;                              //不能设置空对象
        Node<T> p=this.head.next;
        for (int j=0; p!=this.head && j<i; j++)
            p = p.next;
        if (i>=0 && p!=this.head)
            p.data = x;                                    //p指向第i个结点
        else throw new IndexOutOfBoundsException(i+"");    //抛出序号越界异常
    }
    
  //插入x作为第i号元素
    public void insert(int i, T x) 
    {
    	//在此处添加代码
    }
    
  //在线性表最后插入元素x
    public void insert(T x)
    {
    	//在此处添加代码
    }
    
  //删除第i号元素并返回被删除的元素
    public T remove(int i)
    {
		//此处添加代码
		return null;	//此语句只用来验证语法，根据实际情况改写此语句
    }
    
  //删除线性表所有元素
    public void clear()
    {
    	//在此处添加代码
    	return;
    }
    
  //查找，返回首次出现关键字为key的元素。
    public T search(T key)
    {
		//此处添加代码
		return null;	//此语句只用来验证语法，根据实际情况改写此语句
    }
}
  
