package src;

public interface SStack<E>             //ջ�ӿ�
{
    boolean isEmpty();                 //�ж��Ƿ��ջ������ջ����true
    boolean push(E element);           //Ԫ��element��ջ���������ɹ�����true
    E pop();                           //��ջ�����ص�ǰջ��Ԫ�أ���ջ�շ���null 
    E get();                           //ȡջ��Ԫ��ֵ��δ��ջ����ջ�շ���null
}
