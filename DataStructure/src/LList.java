
public interface LList<T> {
    /**
     * 判断线性表是否空
     * @return
     */
    boolean isEmpty();
    
    /**
     * 返回线性表长度
     * @return
     */
    int length();
    
    /**
     * 返回第i（i≥0）个元素
     * @param i
     * @return
     */
    T get(int i);
    
    /**
     * 设置第i个元素值为x
     * @param i
     * @param x
     */
    void set(int i, T x);
    
    /**
     * 插入x作为第i个元素
     * @param i
     * @param x
     */
    void insert(int i, T x);
    
    /**
     * 在线性表最后插入x元素
     * @param x
     */
    void append(T x);
    
    /**
     * 删除第i个元素并返回被删除对象
     * @param i
     * @return
     */
    T remove(int i);
    
    /**
     * 删除线性表所有元素
     */
    void removeAll();
    
    /**
     * 查找，返回首次出现的关键字为key元素
     * @param key
     * @return
     */
    T search(T key);
}

