public class ShiYan9{
	public static void main(String args[])
    {

        String[] prelist = {"A","B","D",null,"G",null,null,null,"C","E",null,null,"F","H"};
        BinaryTree<String> bitree = new BinaryTree<String>(prelist);
        System.out.print("先根次序遍历二叉树：  ");
        bitree.preorder();  
        System.out.print("中根次序遍历二叉树：  ");  
        bitree.inorder();
        System.out.print("后根次序遍历二叉树：  ");  
        bitree.postorder();
        bitree.levelorder();                               //层次遍历二叉树
   
        System.out.println("D结点的层次数为："+bitree.getLevel("D")); 
        System.out.print("bitree的叶子有：");
        bitree.leaf();
        System.out.println();
        System.out.println("bitree的叶子数为："+bitree.countLeaf());

    }	
}