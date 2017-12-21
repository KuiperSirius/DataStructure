import java.util.Scanner;

public class SortedSearch {
	public static void main(String[] arg) {  
	    int[] a={4,6,2,8,1,9,0,3};
	    Scanner input=new Scanner(System.in);
	    System.out.println("请输入你要查找的数：");
	    //存放控制台输入的语句
	    int num=input.nextInt();
	    int result=search(a, num);
	    if(result==-1){
	         System.out.println("你输入的数不存在与数组中。");
	    }
	    else
	         System.out.println("你输入的数字存在，在数组中的位置是第："+(result+1)+"个");
	}
	public static int search(int[] a, int num) {        
	    for(int i = 0; i < a.length; i++) {
	        if(a[i] == num){//如果数据存在
	            return i;
	        }
	    } 
	    return -1;
	}
}
