import java.util.LinkedList;

public class Main {

	//ѡ�������� 
	public static int[] dascSort(int[] param) {  
		int in, out;  
		int max;  
		int temp;  
		for (out = 0; out < param.length; out++) {  
		// Ĭ���������λ��  
		max = out;  
		for (in = out + 1; in < param.length; in++) {  
		if (param[max] < param[in]) {  
		// ��ȡ�������λ��  
		max = in;  
		}  
		}  
		// ��Ĭ��λ�õ������������ʵ�ʵ������ʱ����ʵ�ʵ����������λ��  
		if (out != max) {  
		temp = param[out];  
		param[out] = param[max];  
		param[max] = temp;  
		}  
		}  
		return param;  
		}  
	
	//ð��������
	public static int[] BubbledescSort(int[] param) {  
		int in, out;  
		int temp = 0;  
		for (out = 0; out < param.length; out++) {  
		for (in = param.length - 1; in > out; in--) {  
		if (param[in] > param[in - 1]) {  
		temp = param[in];  
		param[in] = param[in - 1];  
		param[in - 1] = temp;  
		}  
		}  
		}  
		return param;  
		}  
	
	//���뽵��
	 public static void downSort(Integer element,LinkedList<Integer> elemList) throws Exception
	    {
	        if(element == null)
	        {
	            throw new Exception("����Ԫ��Ϊnull");
	        }
	        if(elemList == null)
	        {
	            throw new Exception("Ԫ�ؼ���Ϊnull");
	        }
	        if(elemList.size() == 0)
	        {
	            elemList.add(element);
	        }else{
	            if(element > elemList.getFirst())
	            {
	                elemList.addFirst(element);
	            }else {
	                boolean insertFlag = false;
	                for (Integer e : elemList)
	                {
	                    if(element > e)
	                    {
	                        int index = elemList.indexOf(e);
	                        elemList.add(index, element);
	                        insertFlag = true;
	                    }
	                }
	                if(!insertFlag)
	                {
	                    elemList.addLast(element);
	                }
	            }
	        }
	    }
		
	 
	 //ϣ��������
	 public static void shellSort(int [] a)
	 {
	     System.out.println("");
	         System.out.println("����֮ǰ��");
	         for(int i=0;i<a.length;i++)
	         {
	             System.out.print(a[i]+" ");
	         }
	         //ϣ������
	         int d=a.length;
	             while(true)
	             {
	                 d=d/2;
	                 for(int x=0;x<d;x++)
	                 {
	                     for(int i=x+d;i<a.length;i=i+d)
	                     {
	                         int temp=a[i];
	                         int j;
	                         for(j=i-d;j>=0&&a[j]>temp;j=j-d)
	                         {
	                             a[j+d]=a[j];
	                        	 
	                         }
	                         a[j+d]=temp;
	                     }
	                 }
	                 if(d==1)
	                 {
	                     break;
	                 }
	             }
	             System.out.println();
	             System.out.println("����֮��");
	                 for(int i=0;i<a.length;i++)
	                 {
	                     System.out.print(a[i]+" ");
	                 }
	                 
	     }
	public static void main(String[] args) {
		int[] array = { 1, 6, 7, 5 };
		array = dascSort(array);  
		System.out.print("ѡ������Ϊ��");  
		for (int i = 0; i <array.length; i++) {  
		System.out.print(array[i]+".");  
		}  
        System.out.println("");
		int[] array_1 = { 11, 634, 72, 534,99 };
		array_1 =BubbledescSort(array_1);  
		System.out.print("ð�ݽ�����Ϊ��");  
		for (int i = 0; i <array_1.length; i++) {  
		System.out.print(array_1[i]+".");  
		}  
		int[]a={49,38,65,97,76,13,27,49,78,34,12,64,1};
		shellSort(a);
		
	}

}
