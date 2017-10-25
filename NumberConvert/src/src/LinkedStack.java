package src;

public class LinkedStack<E> implements SStack<E>      //��ʽջ��
{
    private Node<E> top;
    
    public LinkedStack()                              //�����ջ
    {
        this.top=null;                                //ջ�����
    }
    public boolean isEmpty()                          //�ж��Ƿ��ջ
    {
        return this.top==null;
    }

    public boolean push(E element)                    //Ԫ��element��ջ���������ɹ�����true
    {
        if (element==null)
            return false;                             //�ն���null��������ջ

        this.top = new Node(element, this.top);       //��ԭջ��֮ǰ��������Ϊ�µ�ջ�����
        return true;
    } 

    public E pop()                                    //��ջ�����ص�ǰջ��Ԫ�أ���ջ�շ���null
    {
        if (!isEmpty())
        {
            E temp = this.top.data;                   //ȡ��ջ�����ֵ
            this.top = this.top.next;                 //ɾ��ջ�����
            return temp;
        }
        return null;
    }

    public E get()                                    //ȡջ��Ԫ��ֵ��δ��ջ����ջ�շ���null
    {
        if (!isEmpty())
            return this.top.data;
        return null;
    }

    public String toString()                          //����ջ�и�Ԫ�ص��ַ�������
    {
         String str="{";
         Node<E> p = this.top;
         while (p!=null)
         {
             str += p.data.toString();
             p = p.next;
             if (p!=null)
                 str += ", ";
         }
         return str+"} ";
    }
}
