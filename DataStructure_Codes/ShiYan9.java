public class ShiYan9{
	public static void main(String args[])
    {

        String[] prelist = {"A","B","D",null,"G",null,null,null,"C","E",null,null,"F","H"};
        BinaryTree<String> bitree = new BinaryTree<String>(prelist);
        System.out.print("�ȸ����������������  ");
        bitree.preorder();  
        System.out.print("�и����������������  ");  
        bitree.inorder();
        System.out.print("������������������  ");  
        bitree.postorder();
        bitree.levelorder();                               //��α���������
   
        System.out.println("D���Ĳ����Ϊ��"+bitree.getLevel("D")); 
        System.out.print("bitree��Ҷ���У�");
        bitree.leaf();
        System.out.println();
        System.out.println("bitree��Ҷ����Ϊ��"+bitree.countLeaf());

    }	
}