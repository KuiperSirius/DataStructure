//�����ݽṹ��Java�棩����4�棩�������ߣ�Ҷ���ǣ�2014��8��14��
//8.2   ��������˳��洢�Ķ��ַ�����    
//��������

public class SortedArray
{
    public static int count=0;                                    //ͳ�ƱȽϴ���������ASL�ɹ�
    
    //��֪value����Ԫ�ذ�����������begin��end��Χ�ڣ����ַ����ҹؼ���ΪkeyԪ�أ������ҳɹ������±꣬���򷵻�-1��
    //��begin��endԽ�磬����-1����key==null��Java�׳��ն����쳣��
    public static <T extends Comparable<? super T>> int binarySearch(T[] value, int begin, int end, T key)
    {
        count=0;                                           //ͳ�ƱȽϴ���������ASL�ɹ�

        while (begin<=end)                                 //�߽���Ч
        {
            int mid = (begin+end)/2;                       //ȡ�м�λ�ã���ǰ�Ƚ�Ԫ��λ��
            System.out.print("["+mid+"]="+value[mid]+"��"); //��ʾ�Ƚ��м�������ʡ��
            count++;
            if (key.compareTo(value[mid])==0)              //���������
                return mid;                                //���ҳɹ�
            if (key.compareTo(value[mid])<0)               //key�����С
                end = mid-1;                               //���ҷ�Χ��С��ǰ���
            else begin = mid+1;                            //���ҷ�Χ��С������
        }
        return -1;                                         //���Ҳ��ɹ�
    }
    //��֪value����Ԫ�ذ��������򣬶��ַ����ҹؼ���ΪkeyԪ�أ������ҳɹ������±꣬���򷵻�-1
    public static <T extends Comparable<? super T>> int binarySearch(T[] value, T key)
    {
        return binarySearch(value, 0, value.length-1, key);
    }      
    

    //@author��Yeheya��2015-8-22
    
    //�ǵݹ��㷨�۰���ҹؼ���Ϊkey��Ԫ�أ������ҳɹ������±꣬���򷵻�-1
    //������Ϊ��value==null�����׳��ն����쳣
/*    public static int binarySearch(int[] value, int key)
    {
        int begin=0, end=value.length-1;                   //���ҷ�Χ���½���Ͻ�
        while (begin<=end)                                 //�߽���Ч 
        {
            int mid = (begin+end)/2;                       //�м�λ�ã���ǰ�Ƚ�Ԫ��λ��
            System.out.print(value[mid]+"? ");             //��ʾ�Ƚ��м�������ʡ��
            if (value[mid]==key) 
                return mid;                                //���ҳɹ�
            if (value[mid]>key)                            //����ֵС
                end = mid-1;                               //���ҷ�Χ��С��ǰ���
            else
                begin = mid+1;                             //���ҷ�Χ��С������
        }
        return -1;                                         //���Ҳ��ɹ�
    }  */

    //��10�£�ʹ�ñȽ���
    //�ڴ�begin��end��Χ�ڡ��Ѱ��������е�value�����У����ַ����ҹؼ���Ϊkey��Ԫ��
    //���Ѱ��������е�value�����������۰���ҹؼ���Ϊkey��Ԫ�أ��ɱȽ�������comparatorָ������Ƚϴ�С�Ĺ���
    //�����ҳɹ������±꣬���򷵻�-1
    public static<T> int binarySearch(T[] value, T key, java.util.Comparator<? super T> comparator)
    {
        return binarySearch(value, 0, value.length-1, key, comparator);
    }  
    //���Ѱ��������е�value�����У���low��highָ�����ҷ�Χ���½���Ͻ磬�۰����cobj
    //�����ҳɹ�����Ԫ���±꣬���򷵻�-1
    public static<T> int binarySearch(T[] value, int begin, int end, T key, java.util.Comparator<? super T> comparator)
    {
        if (value!=null && key!=null)
            while (begin<=end)                              //�߽���Ч
            {
                int mid = (begin+end)/2;                    //�м�λ�ã���ǰ�Ƚ�Ԫ��λ��
                System.out.print(value[mid]+"? ");
                if (comparator.compare(value[mid],key)==0)  //����Ƚϴ�С
                    return mid;                             //���ҳɹ�
                if (comparator.compare(value[mid],key)>0)   //��������С
                    end = mid-1;                            //���ҷ�Χ��С��ǰ���
                else
                    begin = mid+1;                          //���ҷ�Χ��С������
            }
        return -1;                                          //���Ҳ��ɹ�
    }  
    public static void main(String[] args)
    {
    	Integer values[]={new Integer(8),new Integer(17),new Integer(26),new Integer(32),new Integer(40),new Integer(72),new Integer(87),new Integer(99)};
        Integer key=new Integer(39);     //ͼ8.1������������
        Array1.print(values); 
        System.out.print("���ַ����� "+key+"��");
        System.out.println(((SortedArray.binarySearch(values,key)==-1)?"��":"")+"�ɹ�");
    }
}
//@author��Yeheya��2015-3-17