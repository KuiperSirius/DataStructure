public class ShiYan10{
	
	//��ֱ�Ӳ�����������бȽ��ܴ���
    public static int insertSortCompareNum(int[] table)            
    { 
		//�˴���Ӵ���
		return 0;	//�����ֻ������֤�﷨������ʵ�������д�����

    }
    
	//��ֱ�Ӳ�������������ƶ��ܴ���
    public static int insertSortMoveNum(int[] table)            
    { 
		//�˴���Ӵ���
		return 0;	//�����ֻ������֤�﷨������ʵ�������д�����

    }
    
	//��ϣ����������бȽ��ܴ���
    public static int shellSortCompareNum(int[] table)        
    {
		//�˴���Ӵ���
		return 0;	//�����ֻ������֤�﷨������ʵ�������д�����

    }

	//��ϣ������������ƶ��ܴ���
    public static int shellSortMoveNum(int[] table)        
    {
		//�˴���Ӵ���
		return 0;	//�����ֻ������֤�﷨������ʵ�������д�����

    }

	//��ð����������бȽ��ܴ���
    public static int bubbleSortCompareNum(int[] table)            
    {
		//�˴���Ӵ���
		return 0;	//�����ֻ������֤�﷨������ʵ�������д�����

    }
	//��ð������������ƶ��ܴ���
    public static int bubbleSortMoveNum(int[] table)            
    {
		//�˴���Ӵ���
		return 0;	//�����ֻ������֤�﷨������ʵ�������д�����
		
    }
    
	//��ֱ��ѡ����������бȽ��ܴ���
    public static int selectSortCompareNum(int[] table)         
    {
		//�˴���Ӵ���
		return 0;	//�����ֻ������֤�﷨������ʵ�������д�����
	
    }
    //��ֱ��ѡ������������ƶ��ܴ���
    public static int selectSortMoveNum(int[] table)         
    {
		//�˴���Ӵ���
		return 0;	//�����ֻ������֤�﷨������ʵ�������д�����
		
    }
    
    public static void main(String[] args)
    {       

        int[] value={32,26,87,72,26,17};  
        System.out.print("data list is:   ");
        Array1.print(value);
        
        int[] a=Array1.copy(value);
		System.out.println("ֱ�Ӳ�������Ƚ��ܴ�����"+insertSortCompareNum(a));
		a=Array1.copy(value);
		System.out.println("ֱ�Ӳ��������ƶ��ܴ�����"+insertSortMoveNum(a));
		
		System.out.println("----------------------------------");
		
		a=Array1.copy(value);
		System.out.println("ϣ������Ƚ��ܴ�����"+shellSortCompareNum(a));
		a=Array1.copy(value);
		System.out.println("ϣ�������ƶ��ܴ�����"+shellSortMoveNum(a));
		
		System.out.println("----------------------------------");
		
		a=Array1.copy(value);					
		System.out.println("ð������Ƚ��ܴ�����"+bubbleSortCompareNum(a));
		a=Array1.copy(value);
		System.out.println("ð�������ƶ��ܴ�����"+bubbleSortMoveNum(a));
		
		System.out.println("----------------------------------");
					
		a=Array1.copy(value);
		System.out.println("ֱ��ѡ�������ܱȽϴ�����"+selectSortCompareNum(a));
		a=Array1.copy(value);
		System.out.println("ֱ��ѡ���������ƶ�������"+selectSortMoveNum(a));	

    }
}