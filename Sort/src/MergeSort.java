import java.util.Arrays;

public class MergeSort {

	/**�鲢�����㷨
	 * *
	 * 
	 * @param args
	 */
	public static void mergeSort(int[] value,int low,int high){
		int mid=(low+high)/2;
		if(low<high){
			//left
			mergeSort(value,low,mid);
			//right
			mergeSort(value,mid+1,high);
			//���ҹ鲢
			merge(value,low,mid,high);		
		}		
		System.out.println("�鲢��������Ϊ:"+Arrays.toString(value));
	}
	
	
	public static void merge(int[] value, int low,int mid,int high){
		int[] temp=new  int[high-low+1];
		int i=low;//��ָ��
		int j=mid+1;//��ָ��
		int k=0;//��ʱ��������
		//�ѽ�С�����ַ���������
		while(i<=mid&&j<=high){
			if(value[i]<value[j]){
				temp[k++]=value[i++];
			}
			else{
				temp[k++]=value[j++];
			}
		}
		
		//�����ʣ��Ԫ�ز�������
		while(i<=mid){
			temp[k++]=value[i++];
		}
		//���ұ�ʣ��Ԫ�ز�������
		while(j<=high){
					temp[k++]=value[j++];
		}
	   //��������
	    for(int num=0;num<temp.length;num++){
	    	value[num+low]=temp[num];
	    }
		
	}
	public static void main(String[] args) {
		int[] a=new int[]{51,46,20,18,65,97,77,50};
		/*for(int i:a){
			System.out.println("ԭʼ����Ϊ:"+i+",");
		}*/
		mergeSort(a,0,a.length-1);
		
	}

}
