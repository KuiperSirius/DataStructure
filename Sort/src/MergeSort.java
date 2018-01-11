import java.util.Arrays;

public class MergeSort {

	/**归并排序算法
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
			//左右归并
			merge(value,low,mid,high);		
		}		
		System.out.println("归并排序数组为:"+Arrays.toString(value));
	}
	
	
	public static void merge(int[] value, int low,int mid,int high){
		int[] temp=new  int[high-low+1];
		int i=low;//左指针
		int j=mid+1;//右指针
		int k=0;//临时数组索引
		//把较小的数字放入数组中
		while(i<=mid&&j<=high){
			if(value[i]<value[j]){
				temp[k++]=value[i++];
			}
			else{
				temp[k++]=value[j++];
			}
		}
		
		//把左边剩余元素补入数组
		while(i<=mid){
			temp[k++]=value[i++];
		}
		//把右边剩余元素补入数组
		while(j<=high){
					temp[k++]=value[j++];
		}
	   //整合数组
	    for(int num=0;num<temp.length;num++){
	    	value[num+low]=temp[num];
	    }
		
	}
	public static void main(String[] args) {
		int[] a=new int[]{51,46,20,18,65,97,77,50};
		/*for(int i:a){
			System.out.println("原始数组为:"+i+",");
		}*/
		mergeSort(a,0,a.length-1);
		
	}

}
