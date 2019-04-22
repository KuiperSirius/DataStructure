
public interface LList<T> {
    /**
     * �ж����Ա��Ƿ��
     * @return
     */
    boolean isEmpty();
    
    /**
     * �������Ա���
     * @return
     */
    int length();
    
    /**
     * ���ص�i��i��0����Ԫ��
     * @param i
     * @return
     */
    T get(int i);
    
    /**
     * ���õ�i��Ԫ��ֵΪx
     * @param i
     * @param x
     */
    void set(int i, T x);
    
    /**
     * ����x��Ϊ��i��Ԫ��
     * @param i
     * @param x
     */
    void insert(int i, T x);
    
    /**
     * �����Ա�������xԪ��
     * @param x
     */
    void append(T x);
    
    /**
     * ɾ����i��Ԫ�ز����ر�ɾ������
     * @param i
     * @return
     */
    T remove(int i);
    
    /**
     * ɾ�����Ա�����Ԫ��
     */
    void removeAll();
    
    /**
     * ���ң������״γ��ֵĹؼ���ΪkeyԪ��
     * @param key
     * @return
     */
    T search(T key);
}

