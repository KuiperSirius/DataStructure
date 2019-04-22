
public class SortedSinglyLinkedList {
void SeqList_Merge(SinglyLinkedList A,SinglyLinkedList B,SinglyLinkedList C){
	int i,j,k;
	i=0;j=0;k=0;
	while(i<=A.last&&j<=B.last){
		if(A.data[i]<B.data[j]){
			//数组下标k会随着运算的进行一直改变自增，但i,j的自增不会同时发生。
			C.data[k++]=A.data[i++];
		}else
			C.data[k++]=B.data[j++];
		
	}
	
	while(i<=A.last){
		C.data[k++]=A.data[i++];
	}
	
	while(j<=B.last){
		C.data[k++]=B.data[j++];
	}
	C.last=k-1;
}
	
	
	
	
	public static void main(String[] args) {
		SinglyLinkedList a=new SinglyLinkedList(new int[]{3,5,8,11});
		SinglyLinkedList b=new SinglyLinkedList(new int[]{2,6,8,9,11});
		SinglyLinkedList c=new SinglyLinkedList(new int[new int[]{3,5,8,11}.length+new int[]{2,6,8,9,11}.length]);

		new SortedSinglyLinkedList().SeqList_Merge(a,b,c);
for(int i:c.data){
		System.out.println(""+i);}
	}

}
