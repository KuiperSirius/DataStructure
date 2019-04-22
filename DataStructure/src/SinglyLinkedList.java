
public class SinglyLinkedList<T> implements LList<T> {

	 public Node<T> head;
	 
	 protected Object[] element;                            //�������飬������Ա
	    protected int n;   
	 public int[] data;
	 public int last;
	  
	    public SinglyLinkedList() {
	        // ����ͷ��㣬data��nextֵ��Ϊnull
	        this.head = new Node<T>();
	    }

	    public SinglyLinkedList(int length)                             //��������Ϊlength�Ŀձ�
	    {
	        this.element = new Object[length];                 //��������Ĵ洢�ռ䣬Ԫ��Ϊnull��
	                //��length<0��Java�׳������鳤���쳣 java.lang.NegativeArraySizeException
	        this.n = 0;
	    }
	    
	    public SinglyLinkedList(int[] data)                             //����˳�����values�����ṩԪ�أ��������пն���
	    {
	       this.data=data;
	       if(data!=null){
	    	   last=data.length-1;
	       }
	
	    }
	   
	    /**
	     * �жϵ������Ƿ�գ�O(1)
	     */
	    @Override
	    public boolean isEmpty() {
	        return this.head.next == null;
	    }

	    /**
	     * ���ص������ȣ�O(n), ���ڵ���������㷨
	     */
	    @Override
	    public int length() {
	        int i = 0;
	        // p�ӵ������һ����㿪ʼ
	        Node<T> p = this.head.next;
	        // ��������δ����
	        while (p != null) {
	            i++;
	            // p�����̽��
	            p = p.next;
	        }
	        return i;
	    }

	    /**
	     * ���ص�i����0����Ԫ�أ���i<0����ڱ��򷵻�null��O(n)
	     */
	    @Override
	    public T get(int i) {
	        if (i >= 0) {
	            Node<T> p = this.head.next;
	            for (int j = 0; p != null && j < i; j++) {
	                p = p.next;
	            }

	            // pָ���i�����
	            if (p != null) {
	                return p.data;
	            }
	        }
	        return null;
	    }

	    /**
	     * ���õ�i����0����Ԫ��ֵΪx����i<0����ڱ����׳����Խ���쳣����x==null����������O(n)
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
	     * �����i����0����Ԫ��ֵΪx����x==null�������롣 ��i<0������x��Ϊ��0��Ԫ�أ���i���ڱ�������x��Ϊ���һ��Ԫ�ء�O(n)
	     */
	    @Override
	    public void insert(int i, T x) {
	        // ���ܲ���ն���
	        if (x == null) {
	            return;
	        }

	        // pָ��ͷ���
	        Node<T> p = this.head;
	        // Ѱ�Ҳ���λ��
	        for (int j = 0; p.next != null && j < i; j++) {
	            // ѭ��ֹͣʱ��pָ���i-1�������һ�����
	            p = p.next;
	        }
	        // ����x��Ϊp���ĺ�̽�㣬����ͷ���루i<=0�����м�/β���루i>0��
	        p.next = new Node<T>(x, p.next);
	    }

	    /**
	     * �ڵ�����������x����O(n)
	     */
	    @Override
	    public void append(T x) {
	        insert(Integer.MAX_VALUE, x);
	    }

	    /**
	     * ɾ����i����0����Ԫ�أ����ر�ɾ��������i<0��i���ڱ�����ɾ��������null��O(n)
	     */
	    @Override
	    public T remove(int i) {
	        if (i >= 0) {
	            Node<T> p = this.head;
	            for (int j = 0; p.next != null && j < i; j++) {
	                p = p.next;
	            }

	            if (p != null) {
	                // ���ԭ����
	                T old = p.next.data;
	                // ɾ��p�ĺ�̽��
	                p.next = p.next.next;
	                return old;
	            }
	        }
	        return null;
	    }

	    /**
	     * ɾ������������Ԫ�� Java���Զ��ջظ������ռ�õ��ڴ�ռ�
	     */
	    @Override
	    public void removeAll() {
	        this.head.next = null;
	    }

	    /**
	     * ˳����ҹؼ���ΪkeyԪ�أ������״γ��ֵ�Ԫ�أ������Ҳ��ɹ�����null
	     * key����ֻ�����ؼ����������T���equals()�����ṩ�Ƚ϶�����ȵ�����
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
	     * ���ص���������Ԫ�ص������ַ�������ʽΪ��(,)��������Object���toString()������O(n)
	     */
	    @Override
	    public String toString() {
	        String str = "(";
	        for (Node<T> p = this.head.next; p != null; p = p.next) {
	            str += p.data.toString();
	            if (p.next != null)
	                str += ","; // �������һ�����ʱ��ӷָ���
	        }
	        return str + ")"; // �ձ���()
	    }

	    /**
	     * �Ƚ������������Ƿ����
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
	     * �Ƚ������������Ƿ���ȣ��ݹ鷽��
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
