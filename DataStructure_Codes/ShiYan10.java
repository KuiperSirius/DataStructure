public class ShiYan10{
	
	//求直接插入排序过程中比较总次数
    public static int insertSortCompareNum(int[] table)            
    { 
		//此处添加代码
		return 0;	//此语句只用来验证语法，根据实际情况改写此语句

    }
    
	//求直接插入排序过程中移动总次数
    public static int insertSortMoveNum(int[] table)            
    { 
		//此处添加代码
		return 0;	//此语句只用来验证语法，根据实际情况改写此语句

    }
    
	//求希尔排序过程中比较总次数
    public static int shellSortCompareNum(int[] table)        
    {
		//此处添加代码
		return 0;	//此语句只用来验证语法，根据实际情况改写此语句

    }

	//求希尔排序过程中移动总次数
    public static int shellSortMoveNum(int[] table)        
    {
		//此处添加代码
		return 0;	//此语句只用来验证语法，根据实际情况改写此语句

    }

	//求冒泡排序过程中比较总次数
    public static int bubbleSortCompareNum(int[] table)            
    {
		//此处添加代码
		return 0;	//此语句只用来验证语法，根据实际情况改写此语句

    }
	//求冒泡排序过程中移动总次数
    public static int bubbleSortMoveNum(int[] table)            
    {
		//此处添加代码
		return 0;	//此语句只用来验证语法，根据实际情况改写此语句
		
    }
    
	//求直接选择排序过程中比较总次数
    public static int selectSortCompareNum(int[] table)         
    {
		//此处添加代码
		return 0;	//此语句只用来验证语法，根据实际情况改写此语句
	
    }
    //求直接选择排序过程中移动总次数
    public static int selectSortMoveNum(int[] table)         
    {
		//此处添加代码
		return 0;	//此语句只用来验证语法，根据实际情况改写此语句
		
    }
    
    public static void main(String[] args)
    {       

        int[] value={32,26,87,72,26,17};  
        System.out.print("data list is:   ");
        Array1.print(value);
        
        int[] a=Array1.copy(value);
		System.out.println("直接插入排序比较总次数："+insertSortCompareNum(a));
		a=Array1.copy(value);
		System.out.println("直接插入排序移动总次数："+insertSortMoveNum(a));
		
		System.out.println("----------------------------------");
		
		a=Array1.copy(value);
		System.out.println("希尔排序比较总次数："+shellSortCompareNum(a));
		a=Array1.copy(value);
		System.out.println("希尔排序移动总次数："+shellSortMoveNum(a));
		
		System.out.println("----------------------------------");
		
		a=Array1.copy(value);					
		System.out.println("冒泡排序比较总次数："+bubbleSortCompareNum(a));
		a=Array1.copy(value);
		System.out.println("冒泡排序移动总次数："+bubbleSortMoveNum(a));
		
		System.out.println("----------------------------------");
					
		a=Array1.copy(value);
		System.out.println("直接选择排序总比较次数："+selectSortCompareNum(a));
		a=Array1.copy(value);
		System.out.println("直接选择排序总移动次数："+selectSortMoveNum(a));	

    }
}