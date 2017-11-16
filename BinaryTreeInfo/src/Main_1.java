import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main_1<T> {
	;
	
	//层序遍历构造完全二叉树
     public  BinaryNode<T> creatLevelTree(String str){ 
	 int temp=0;//二叉链表下标
	 if(str.length()==1){		 
		 return new BinaryNode(String.valueOf(str.charAt(0)));
	 }
	 BinaryNode<T> p=null;
	 BinaryNode<T> root=null;
	 //控制循环体条件：不大于完全二叉树尾叶子结点的父母节点下标
	 while(temp<=(int)(str.length()-1)/2){
		 p=new BinaryNode(String.valueOf(str.charAt(temp)));
		 //左孩子判断条件
		 if((temp*2+1)<str.length()){
			 p.left=new BinaryNode(String.valueOf(str.charAt(temp*2+1)));
		 }
		 //右孩子判断条件
		 if((temp*2+2)<str.length()){
			 p.right=new BinaryNode(String.valueOf(str.charAt(temp*2+2)));			 
		 }	
		 if(temp==0){ 
			 root=p;
			 }
		 temp++;
	 }
	return root; 
 }
     public String levelorder(BinaryNode<T> root){
    	 Queue<T> nodeQueue=new ArrayDeque<T>();	 
    	 BinaryNode<T> temp =new BinaryNode<T>(); 
    	 nodeQueue.add(root.data);
    	 int currentLevel=1;//当前节点数
    	 int nextLevel=0;//下一层节点数
    	 String str ="";
    	 while((temp.data=nodeQueue.poll())!=null){           //Notice
    		 if(temp.left!=null){
    			 nodeQueue.add(temp.left.data);
    			 nextLevel++;
    		 }
             if(temp.right!=null){
            	 nodeQueue.add(temp.right.data);
            	 nextLevel++;
    		 }
    		 str+=nodeQueue.poll();
    		 currentLevel--;
    		 //当本层节点数为零时，表示所有该层的左右孩子节点已经进入双端队列。
    		 if(currentLevel==0){
    			 str+="\n";
    			 currentLevel=nextLevel;
    			 nextLevel=0;   					 
    		 }   		    		 
    	 }
 	 
    	 return str;
     }
     
	
	public static void main(String[] args) {	 
		//定义输入输出流，获取键盘输入字符串。
		/*
		InputStreamReader stdin = new InputStreamReader(System.in);//键盘输入 
		BufferedReader bufin = new BufferedReader(stdin); 
        try {
			str = bufin.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		} 
        */
		String str="ABCDEFG";
        Main_1<String> main_1=new Main_1<String>();
       BinaryNode<String> node= main_1.creatLevelTree(str);
      //  String str_1=new Main_1<String>().levelorder(node);
        System.out.println(main_1.levelorder(node));
        
		
		
	}

}
