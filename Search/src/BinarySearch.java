import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
        int[] arr={12,45,9,8,45,56,25,77,98};
       
        System.out.println("ԭʼ�����������£�");
        for (int n : arr) {
            System.out.print(n+" ");
        }
        System.out.println();
        //���ȶ������������������ð������
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        //�����������õ�����
        System.out.println("����ð�����������飺");
        for(int n:arr){
            System.out.print(n+" ");
        }
        System.out.println();//����
        Scanner input=new Scanner(System.in);
        System.out.println("��������Ҫ���ҵ�����");
        int num=input.nextInt();
        int result=binarySearch(arr, num);
        if(result==-1){
            System.out.println("��Ҫ���ҵ��������ڡ���");
        }
        else{
            System.out.println("��Ҫ���ҵ������ڣ��������е�λ���ǣ�"+result);
        }
    }
    //���ֲ����㷨
    public static int binarySearch(int[] arr,int num){
    
        int low=0;
        int upper=arr.length-1;
        while(low<=upper){
            int mid=(upper+low)/2;
            if(arr[mid]<num){
                low=mid+1;
            }
            else if(arr[mid]>num){
                upper=mid-1;
            }
            else
                return mid;
        }
        return -1;
    }
	
}
