
public class SinglyLinkedList<T> implements LList<T> {

	 public Node<T> head;
	 
	 protected Object[] element;                            //对象数组，保护成员
	    protected int n;   
	 public int[] data;
	 public int last;
	  
	    public SinglyLinkedList() {
	        // 创建头结点，data和next值均为null
	        this.head = new Node<T>();
	    }

	    public SinglyLinkedList(int length)                             //构造容量为length的空表
	    {
	        this.element = new Object[length];                 //申请数组的存储空间，元素为null。
	                //若length<0，Java抛出负数组长度异常 java.lang.NegativeArraySizeException
	        this.n = 0;
	    }
	    
	    public SinglyLinkedList(int[] data)                             //构造顺序表，由values数组提供元素，忽略其中空对象
	    {
	       this.data=data;
	       if(data!=null){
	    	   last=data.length-1;
	       }
	
	    }
	   
	    /**
	     * 判断单链表是否空，O(1)
	     */
	    @Override
	    public boolean isEmpty() {
	        return this.head.next == null;
	    }

	    /**
	     * 返回单链表长度，O(n), 基于单链表遍历算法
	     */
	    @Override
	    public int length() {
	        int i = 0;
	        // p从单链表第一个结点开始
	        Node<T> p = this.head.next;
	        // 若单链表未结束
	        while (p != null) {
	            i++;
	            // p到达后继结点
	            p = p.next;
	        }
	        return i;
	    }

	    /**
	     * 返回第i（≥0）个元素，若i<0或大于表长则返回null，O(n)
	     */
	    @Override
	    public T get(int i) {
	        if (i >= 0) {
	            Node<T> p = this.head.next;
	            for (int j = 0; p != null && j < i; j++) {
	                p = p.next;
	            }

	            // p指向第i个结点
	            if (p != null) {
	                return p.data;
	            }
	        }
	        return null;
	    }

	    /**
	     * 设置第i（≥0）个元素值为x。若i<0或大于表长则抛出序号越界异常；若x==null，不操作。O(n)
	     */
	    @Override
	    public void set(int i, T x) {
	        if (x == null)
	            return;

	        Node<T> p = this.head.next;
	        for (int j = 0; p != null && j < i; j++) {
	            p = p.next;
	        }

	        if (i >= 0 && p != null) {
	            p.data = x;
	        } else {
	            throw new IndexOutOfBoundsException(i + "");
	        }
	    }

	    /**
	     * 插入第i（≥0）个元素值为x。若x==null，不插入。 若i<0，插入x作为第0个元素；若i大于表长，插入x作为最后一个元素。O(n)
	     */
	    @Override
	    public void insert(int i, T x) {
	        // 不能插入空对象
	        if (x == null) {
	            return;
	        }

	        // p指向头结点
	        Node<T> p = this.head;
	        // 寻找插入位置
	        for (int j = 0; p.next != null && j < i; j++) {
	            // 循环停止时，p指向第i-1结点或最后一个结点
	            p = p.next;
	        }
	        // 插入x作为p结点的后继结点，包括头插入（i<=0）、中间/尾插入（i>0）
	        p.next = new Node<T>(x, p.next);
	    }

	    /**
	     * 在单链表最后添加x对象，O(n)
	     */
	    @Override
	    public void append(T x) {
	        insert(Integer.MAX_VALUE, x);
	    }

	    /**
	     * 删除第i（≥0）个元素，返回被删除对象。若i<0或i大于表长，不删除，返回null。O(n)
	     */
	    @Override
	    public T remove(int i) {
	        if (i >= 0) {
	            Node<T> p = this.head;
	            for (int j = 0; p.next != null && j < i; j++) {
	                p = p.next;
	            }

	            if (p != null) {
	                // 获得原对象
	                T old = p.next.data;
	                // 删除p的后继结点
	                p.next = p.next.next;
	                return old;
	            }
	        }
	        return null;
	    }

	    /**
	     * 删除单链表所有元素 Java将自动收回各结点所占用的内存空间
	     */
	    @Override
	    public void removeAll() {
	        this.head.next = null;
	    }

	    /**
	     * 顺序查找关键字为key元素，返回首次出现的元素，若查找不成功返回null
	     * key可以只包含关键字数据项，由T类的equals()方法提供比较对象相等的依据
	     */
	    @Override
	    public T search(T key) {
	        if (key == null)
	            return null;
	        for (Node<T> p = this.head.next; p != null; p = p.next)
	            if (p.data.equals(key))
	                return p.data;
	        return null;
	    }

	    /**
	     * 返回单链表所有元素的描述字符串，形式为“(,)”，覆盖Object类的toString()方法，O(n)
	     */
	    @Override
	    public String toString() {
	        String str = "(";
	        for (Node<T> p = this.head.next; p != null; p = p.next) {
	            str += p.data.toString();
	            if (p.next != null)
	                str += ","; // 不是最后一个结点时后加分隔符
	        }
	        return str + ")"; // 空表返回()
	    }

	    /**
	     * 比较两条单链表是否相等
	     */
	    @SuppressWarnings("unchecked")
	    @Override
	    public boolean equals(Object obj) {
	        if (obj == this)
	            return true;

	        if (obj instanceof SinglyLinkedList) {
	            SinglyLinkedList<T> list = (SinglyLinkedList<T>) obj;
	            return equals(this.head.next, list.head.next);
	        }
	        return false;
	    }

	    /**
	     * 比较两条单链表是否相等，递归方法
	     * 
	     * @param p
	     * @param q
	     * @return
	     */
	    private boolean equals(Node<T> p, Node<T> q) {
	        return p == null && q == null || p != null && q != null
	                && p.data.equals(q.data) && equals(p.next, q.next);
	    }
	
}
