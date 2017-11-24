import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.io.BufferedReader;
public class Main_1<T> {
	
	
	
	public static void main(String[] args){	
		String str_1="AbcDEFG";		
	/*	//定义输入输出流，获取键盘输入字符串。	
		InputStreamReader stdin = new InputStreamReader(System.in);//键盘输入 
		BufferedReader bufin = new BufferedReader(stdin); 
        try {
		   str_1 = bufin.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		} 
        */	
		String[] strArray=new String[str_1.length()];
		for(int i=0;i<str_1.length();i++){
		strArray[i]=String.valueOf(str_1.charAt(i));
		}
		//构造方法生成数组方式，链式存储二叉树层序结构。
		BinaryTree<String> tree=new BinaryTree<String>(strArray);		
        //tree.preorder(); 	
		//System.out.println(tree.levelorder()); 
		//tree.inorder();
		System.out.println("测试原始二叉树层序输出");
		System.out.println(tree.levelorder());//测试原始二叉树层序输出
		System.out.println("测试非递归后序输出");
		tree.postOrder(tree.root);
		System.out.println("测试镜像二叉树层序输出");
		tree.mirrorTree(tree.root);//更改镜像二叉树根节点
		System.out.println(tree.levelorder());//测试镜像二叉树层序输出
		
		Integer[] preSort={1,2,4,5,3,6};//先序序列
		Integer[] inSort={4,2,5,1,6,3};//中序序列*/
	
		BinaryTree<Integer> tree_1=new BinaryTree<Integer>(preSort,inSort);
		System.out.println(tree_1.levelorder());
		
	}

}
