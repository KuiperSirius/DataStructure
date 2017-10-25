package src;

//����������
public class Node<E>                             //����������
{
    public E data;                               //�����򣬱�������Ԫ��
    public Node<E> next;                         //��ַ�����ú�̽��

    public Node(E data, Node<E> next)            //�����㣬ָ������Ԫ�غͺ�̽��
    {
        this.data = data;
        this.next = next;
    }

    public Node(E data)
    {
        this(data, null);
    }

    public Node()
    {
        this(null, null);
    }

    public String toString()                     //���ؽ��Ԫ��ֵ��Ӧ���ַ���
    {
        return this.data.toString();
    }
}
