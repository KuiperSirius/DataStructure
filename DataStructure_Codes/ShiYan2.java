public class ShiYan2{	
	public static void reverseArray(int x[]){	
	//Ìí¼Ó´úÂë
	}
	
	public static void printArray(int x[]){
		for(int i=0;i<x.length;i++)
			System.out.print(x[i]+"  ");	
		System.out.println();
	}
	
	public static void main(String agrs[]){
		int[] a={1,2,3,4,5,6,7};
		System.out.print("before reverse:");
		printArray(a);
		
		System.out.println("---------------------------------------");
		
		reverseArray(a);
		
		System.out.print("after reverse :");
		printArray(a);
	}	
}