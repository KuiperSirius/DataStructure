import java.util.Scanner;

public class SortedSearch {
	public static void main(String[] arg) {  
	    int[] a={4,6,2,8,1,9,0,3};
	    Scanner input=new Scanner(System.in);
	    System.out.println("��������Ҫ���ҵ�����");
	    //��ſ���̨��������
	    int num=input.nextInt();
	    int result=search(a, num);
	    if(result==-1){
	         System.out.println("����������������������С�");
	    }
	    else
	         System.out.println("����������ִ��ڣ��������е�λ���ǵڣ�"+(result+1)+"��");
	}
	public static int search(int[] a, int num) {        
	    for(int i = 0; i < a.length; i++) {
	        if(a[i] == num){//������ݴ���
	            return i;
	        }
	    } 
	    return -1;
	}
}