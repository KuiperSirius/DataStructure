//《数据结构（Java版）（第4版）》，作者：叶核亚，2014年8月14日
//8.2   基于排序顺序存储的二分法查找    
//排序数组

public class SortedArray
{
    public static int count=0;                                    //统计比较次数，计算ASL成功
    
    //已知value数组元素按升序排序，在begin～end范围内，二分法查找关键字为key元素，若查找成功返回下标，否则返回-1；
    //若begin、end越界，返回-1。若key==null，Java抛出空对象异常。
    public static <T extends Comparable<? super T>> int binarySearch(T[] value, int begin, int end, T key)
    {
        count=0;                                           //统计比较次数，计算ASL成功

        while (begin<=end)                                 //边界有效
        {
            int mid = (begin+end)/2;                       //取中间位置，当前比较元素位置
            System.out.print("["+mid+"]="+value[mid]+"？"); //显示比较中间结果，可省略
            count++;
            if (key.compareTo(value[mid])==0)              //两对象相等
                return mid;                                //查找成功
            if (key.compareTo(value[mid])<0)               //key对象较小
                end = mid-1;                               //查找范围缩小到前半段
            else begin = mid+1;                            //查找范围缩小到后半段
        }
        return -1;                                         //查找不成功
    }
    //已知value数组元素按升序排序，二分法查找关键字为key元素，若查找成功返回下标，否则返回-1
    public static <T extends Comparable<? super T>> int binarySearch(T[] value, T key)
    {
        return binarySearch(value, 0, value.length-1, key);
    }      
    

    //@author：Yeheya。2015-8-22
    
    //非递归算法折半查找关键字为key的元素，若查找成功返回下标，否则返回-1
    //若数组为空value==null，将抛出空对象异常
/*    public static int binarySearch(int[] value, int key)
    {
        int begin=0, end=value.length-1;                   //查找范围的下界和上界
        while (begin<=end)                                 //边界有效 
        {
            int mid = (begin+end)/2;                       //中间位置，当前比较元素位置
            System.out.print(value[mid]+"? ");             //显示比较中间结果，可省略
            if (value[mid]==key) 
                return mid;                                //查找成功
            if (value[mid]>key)                            //给定值小
                end = mid-1;                               //查找范围缩小到前半段
            else
                begin = mid+1;                             //查找范围缩小到后半段
        }
        return -1;                                         //查找不成功
    }  */

    //第10章，使用比较器
    //在从begin到end范围内、已按升序排列的value数组中，二分法查找关键字为key的元素
    //在已按升序排列的value对象数组中折半查找关键字为key的元素，由比较器对象comparator指定对象比较大小的规则
    //若查找成功返回下标，否则返回-1
    public static<T> int binarySearch(T[] value, T key, java.util.Comparator<? super T> comparator)
    {
        return binarySearch(value, 0, value.length-1, key, comparator);
    }  
    //在已按升序排列的value数组中，由low、high指定查找范围的下界和上界，折半查找cobj
    //若查找成功返回元素下标，否则返回-1
    public static<T> int binarySearch(T[] value, int begin, int end, T key, java.util.Comparator<? super T> comparator)
    {
        if (value!=null && key!=null)
            while (begin<=end)                              //边界有效
            {
                int mid = (begin+end)/2;                    //中间位置，当前比较元素位置
                System.out.print(value[mid]+"? ");
                if (comparator.compare(value[mid],key)==0)  //对象比较大小
                    return mid;                             //查找成功
                if (comparator.compare(value[mid],key)>0)   //给定对象小
                    end = mid-1;                            //查找范围缩小到前半段
                else
                    begin = mid+1;                          //查找范围缩小到后半段
            }
        return -1;                                          //查找不成功
    }  
    public static void main(String[] args)
    {
    	Integer values[]={new Integer(8),new Integer(17),new Integer(26),new Integer(32),new Integer(40),new Integer(72),new Integer(87),new Integer(99)};
        Integer key=new Integer(39);     //图8.1，按升序排序
        Array1.print(values); 
        System.out.print("二分法查找 "+key+"，");
        System.out.println(((SortedArray.binarySearch(values,key)==-1)?"不":"")+"成功");
    }
}
//@author：Yeheya。2015-3-17
