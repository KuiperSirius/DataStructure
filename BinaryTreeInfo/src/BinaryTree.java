import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

//《数据结构（Java版）（第4版）》，作者：叶核亚，2014年7月19日
//6.2.6   二叉树的二叉链表实现
//2.  采用二叉链表存储的二叉树类声明
//【思考题6-2】 基于遍历的操作
//【例6.1】  二叉树的构造、遍历及插入。

public class BinaryTree<T>                       //二叉树类，二叉链表存储，T指定结点的元素类型 
{
    public  BinaryNode<T> root;                  //根结点，二叉链表结点结构

    public BinaryTree()                          //构造空二叉树
    {
        this.root=null;
    }
    
    
    public boolean isEmpty()                     //判断是否空二叉树
    {
        return this.root==null;
    }

    //3. 二叉树的插入结点
    public BinaryNode<T> insert(T x)             //插入x作为根结点，原根结点作为x的左孩子；返回插入结点
    {
        return this.root = new BinaryNode<T>(x, this.root, null);
    }
    //注意：不能声明为insertRoot(T x)，因为，该方法将被二叉排序树类覆盖。
    
    //插入x为parent结点的左/右孩子，leftChild指定孩子，取值为true（左）、false（右）；
    //parent的原左/右孩子成为x结点的左/右孩子；返回插入结点。
    //若x==null，不插入，返回null。若parent==null，Java抛出空对象异常。
    public BinaryNode<T> insert(BinaryNode<T> parent, T x, boolean leftChild)
    {
        if (x==null)
            return null;
        if (leftChild)                           //插入x为parent结点的左/右孩子，返回插入结点
            return parent.left=new BinaryNode<T>(x, parent.left, null);
        return parent.right=new BinaryNode<T>(x, null, parent.right);
    }    

    //4.  二叉树删除子树
    //删除parent结点的左或右子树，leftChild指定子树，取值为true（左）、false（右）。
    //Java自动收回被删除子树占用的存储空间。
    public void remove(BinaryNode<T> parent, boolean leftChild)
    {
        if (leftChild)
            parent.left = null;                  //若parent==null，Java抛出空对象异常
        else  parent.right = null;
    }    
    public void clear()                                    //删除二叉树的所有结点
    {
        this.root = null;
    }

    //5. 二叉树孩子优先的遍历算法
    public void preorder()                                 //输出先根次序遍历序列
    {
//        System.out.print("先根次序遍历二叉树：  ");
        preorder(this.root);                               //调用先根次序遍历二叉树的递归方法
        System.out.println();
    }    
    private void preorder(BinaryNode<T> p)                 //先根次序遍历以p结点为根的子树，递归方法
    {
        if (p!=null)                                       //若二叉树不空
        {
            System.out.print(p.data.toString()+" ");       //先访问当前结点元素
            preorder(p.left);                              //按先根次序遍历p的左子树，递归调用，参数为左孩子
            preorder(p.right);                             //按先根次序遍历p的右子树，递归调用，参数为右孩子
        }
    }
    
    public String toString()                               //返回先根次序遍历二叉树所有结点的描述字符串
    {
        return toString(this.root);
    }
    private String toString(BinaryNode<T> p)               //返回先根次序遍历以p为根的子树描述字符串，递归方法
    {
        if (p==null)
            return "∧";                                    //输出空子树标记
        return p.data.toString()+" " + toString(p.left) + toString(p.right);
    }

    public void inorder()                                  //输出中根次序遍历序列
    {
//        System.out.print("中根次序遍历二叉树：  ");
        inorder(this.root);
        System.out.println();
    }    
    private void inorder(BinaryNode<T> p)                  //中根次序遍历以p结点为根的子树，递归方法
    {
        if (p!=null)
        {
            inorder(p.left);                               //中根次序遍历p的左子树，递归调用
            System.out.print(p.data.toString()+" ");
            inorder(p.right);                              //中根次序遍历p的右子树，递归调用
        }
    }

    public void postorder()                                //输出后根次序遍历序列
    {
//        System.out.print("后根次序遍历二叉树：  ");
        postorder(this.root);
        System.out.println();
    }
    private void postorder(BinaryNode<T> p)                //后根次序遍历以p结点为根的子树，递归方法
    {
        if (p!=null)
        {
            postorder(p.left);
            postorder(p.right);
            System.out.print(p.data.toString()+" ");       //后访问当前结点元素
        }
    }
/**
 * 后续遍历方法
 * 非递归
 * @return
 */
    public void postOrder(BinaryNode<T> getNode){
    	Stack<BinaryNode<T>> stack1=new Stack<BinaryNode<T>>();//栈1表示节点的存储
    	Stack<Integer> stack2=new Stack<Integer>();//栈2表示节点的存储
    	int i=1;
    	while(getNode!=null||!stack1.empty()){
    		while(getNode!=null){
    			stack1.push(getNode);
    			stack2.push(0);
    			getNode=getNode.left;
    		}
    		while(!stack1.empty()&&stack2.peek()==i){
    			stack2.pop();
    			System.out.println(stack1.pop().data.toString()+"");
    		}
    		if(!stack1.empty()){
    			stack2.pop();
    			stack2.push(1);
    			getNode=stack1.peek();
    			getNode=getNode.right;
    		} 		
    	}//while	
    }
    
    //【思考题6-2】 基于遍历的操作【习题解答】
    public int size()                                      //返回二叉树的结点数
    {
        return size(root);
    }
    public int size(BinaryNode<T> p)                       //返回以p结点为根的子树的结点数
    {
        if (p==null)
            return 0;
        return 1+size(p.left)+size(p.right);
    }

    public int height()                                    //返回二叉树的高度
    {
        return height(root);
    }
    public int height(BinaryNode<T> p)                     //返回以p结点为根的子树高度，后根次序遍历
    {
        if (p==null)
            return 0;
        int lh = height(p.left);                           //返回左子树的高度
        int rh = height(p.right);                          //返回右子树的高度
        return (lh>=rh) ? lh+1 : rh+1;                     //当前子树高度为较高子树的高度加1
    }

    //6. 构造二叉树
    //（2） 标明空子树的先根序列表示        
  /*  public BinaryTree(T[] prelist)                         //以标明空子树的先根遍历序列构造二叉树
    {
        this.root = create(prelist);
    }  
    //以从i开始的标明空子树的先根序列，创建一棵以prelist[i]为根的子树，返回根结点，递归方法
    private int i=0;
    private BinaryNode<T> create(T[] prelist)
    {
        BinaryNode<T> p = null;
        if (i<prelist.length)
        {
            T elem=prelist[i];
            i++;
            if (elem!=null)                                //不能elem!="∧"，因为T不一定是String
            {
                p = new BinaryNode<T>(elem);               //创建叶子结点
                p.left = create(prelist);                  //创建p的左子树，递归调用，实际参数与形式参数相同
                p.right= create(prelist);                 //创建p的右子树，递归调用，实际参数与形式参数相同
            }
        }
        return p;
    }
    **/
    
    //根据先序中序序列来构造二叉树
    public BinaryTree(T[] preSort, T[] inSort){
    	this.root=creatTreePreInSort(preSort,0,preSort.length-1,inSort,0,inSort.length-1);
    } 
    /*私有先序中序数组构造方法
     分别定义先序数组开始结点下标终止结点下标；
     分别定义中序数组开始结点下标终止结点下标；  
    */
    private BinaryNode<T> creatTreePreInSort(T[] preSort,int preStrat,int preEnd,T[] inSort,int inStart,int inEnd){
    	if(preStrat>preEnd||inStart>inEnd){
    		return null;//表示当前结点为叶节点
    	}
    	BinaryNode<T> getRoot=new BinaryNode<T>(preSort[preStrat]);
    	//int i=0;
    	for(int i=inStart;i<=inEnd;i++){  		
    	if(inSort[i]==preSort[preStrat]){
    	//	getRoot=new BinaryNode<T>(inSort[i]);	
    	
    		getRoot.left=creatTreePreInSort(preSort,preStrat+1,preStrat+i-inStart,inSort,inStart,i-1);
    		getRoot.right=creatTreePreInSort(preSort,preStrat+i-inStart+1,preEnd,inSort,i+1,inEnd);
    		/**getRoot.left=creatTreePreInSort(Arrays.copyOfRange(preSort,1,i+1),Arrays.copyOfRange(inSort,0,i));
    		getRoot.right=creatTreePreInSort(Arrays.copyOfRange(preSort,i+1,preSort.length),Arrays.copyOfRange(inSort,i+1,inSort.length));		
    	*/
    	}  	
    	}
    	return getRoot;
    }
  //用字符串保存树结点的值,求二叉树中各结点数值的平均值
    String str="";
    public void getValueOfTotalNode(){
    	getValue(this.root);
    	int integer=0;
    	for(int i=0;i<str.length();i++){
    	integer+=Integer.parseInt(String.valueOf(str.charAt(i)));
    	}
    	System.out.println("二叉树中各结点数值的平均值"+integer/str.length());
    }
    private void getValue(BinaryNode<T> p)                 //先根次序遍历以p结点为根的子树，递归方法
    {
        if (p!=null)                                       //若二叉树不空
        {
            str+=p.data.toString();                       //先访问当前结点元素并输出
            getValue(p.left);                              //按先根次序遍历p的左子树，递归调用，参数为左孩子
            getValue(p.right);                             //按先根次序遍历p的右子树，递归调用，参数为右孩子
        }
    }
    
    
    
    //镜像二叉树算法
    public BinaryNode<T> mirrorTree(BinaryNode<T> node){
    	if(node==null){
    		return null;
    	} 
    	return this.root=getMirrirTree(node);
    }
    //结点P为传入的根节点
    private BinaryNode<T> getMirrirTree(BinaryNode<T> p){
    	if(p==null){
    		return null;
    	}
    	BinaryNode<T> leftTree=this.getMirrirTree(p.left);
    	BinaryNode<T> rightTree=this.getMirrirTree(p.right);
    	
    	p.right=leftTree;
    	p.left=rightTree;
    	   	
    	return p;
    }
    
    
    
    //构造二叉树，层序遍历方法
    public BinaryTree(T[] array)                         //以标明空子树的层序遍历方法构造二叉树
    {
      this.root =creatLevelTree(array);
    }
    
  //输入二叉树层序遍历序列，构造完全二叉树
    public  BinaryNode<T> creatLevelTree(T[] values){ 
	 int temp=0;//二叉链表下标
	 if(values.length==1){		 
		 return new BinaryNode<T>(values[0]);
	 }
	 
//构造相应长度的列表来储存完全二叉树链表节点。	 
	 List<BinaryNode<T>> list=new ArrayList<BinaryNode<T>>(values.length);
	 for(int i=0;i<values.length;i++){
	 list.add(new BinaryNode<T>(values[i]));
	 }
	// BinaryNode<T> p=null;//定义当前遍历节点
	 BinaryNode<T> inRoot=null;
	 //控制循环体条件：不大于完全二叉树尾叶子结点的父母节点下标
	 while(temp<=(int)((values.length-2)/2)){
		// p=new BinaryNode<T>(values[temp]);
		 //左孩子判断条件
		 if((temp*2+1)<values.length){
			 list.get(temp).left=list.get(temp*2+1);
					 //new BinaryNode<T>(values[temp*2+1]);
		 }
		 //右孩子判断条件
		 if((temp*2+2)<values.length){
			 list.get(temp).right=list.get(temp*2+2);			 
		 }	
		 if(temp==0){ 
			 inRoot=list.get(0);
			 }
		 temp++;
	 }
	return inRoot; 
}
    
               
  //输出层序遍历节点字符串，返回str。
    public String levelorder(){
    	//ArrayDeque数组双端队列没有容量限制
   	 Queue<BinaryNode<T>> nodeQueue=new ArrayDeque<BinaryNode<T>>();	 
   	 BinaryNode<T> temp=null; 
   	 nodeQueue.add(this.root);
   	 int currentLevel=1;//当前节点数
   	 int nextLevel=0;//下一层节点数
   	 String str="";
 
   	 while((temp=nodeQueue.poll())!=null){           //Notice 输出了 null
   		    if(temp.left!=null){
   			 nodeQueue.add(temp.left);
   			 nextLevel++;
   		 }
            if(temp.right!=null){
           	 nodeQueue.add(temp.right);
           	 nextLevel++;
   		 }
          //  System.out.print(temp.data + " ");
   		 /*str+=nodeQueue.poll().data;
   		  * nodeQueue.poll()会获取并移除双端队列所表示的对队列头
   		  * 如此操作会使temp左孩子率先出队列，节点提前
   		  * 循环体造成最后一个节点位置为空（null),造成空指针异常。
   		  * 2017-11-17-21:13
   		  */
            str+=temp.data;
   		 currentLevel--;
   		 //当本层节点数为零时，表示所有该层的左右孩子节点已经进入双端队列。
   		 if(currentLevel==0){
   			 str+="\n";
   			 //System.out.println("\n");
   			 currentLevel=nextLevel;
   			 nextLevel=0;   					 
   		 }   	    		 
   	 } 
   	 return str;
    } 
    //【例6.1】  二叉树的构造、遍历及插入。
    //【思考题6-3】【习题解答】
    public BinaryTree(BinaryTree<T> bitree)      //拷贝构造方法，深拷贝
    {
        this.root = copy(bitree.root);
    }

    //复制以p根的子二叉树，返回新建子二叉树的根结点
    private BinaryNode<T> copy(BinaryNode<T> p)
    {
        if (p==null)
            return null;
        BinaryNode<T> q = new BinaryNode<T>(p.data);
        q.left = copy(p.left);                   //复制左子树，递归调用
        q.right = copy(p.right);                 //复制右子树，递归调用
        return q;                                //返回建立子树的根结点
    }
    
    //7.  二叉树的广义表表示
    //（1） 广义表表示
    public void printGenList()                             //输出二叉树的广义表表示字符串
    {
        System.out.print("二叉树的广义表表示：");
        printGenList(this.root);
        System.out.println();
    }
    //输出以p结点为根的一棵子树的广义表表示字符串，先根次序遍历，递归算法
    private void printGenList(BinaryNode<T> p)
    {
        if (p==null)                                       //若二叉树空
            System.out.print("∧");                         //输出空子树标记
        else            
        {   System.out.print(p.data.toString());           //访问当前结点
            if (p.left!=null || p.right!=null)             //非叶子结点，有子树
            {
                System.out.print("(");
                printGenList(p.left);                      //输出p的左子树，递归调用
                System.out.print(",");
                printGenList(p.right);                     //输出p的右子树，递归调用
                System.out.print(")");
            }
        }
    }
    //【例6.2】 二叉树的广义表表示。
    //author：Yeheya。2014-7-19     
    
  //返回x结点所在的层次，若空树或未查找到x返回-1
    public int getLevel(T x)
    {
        return getLevel(root, 1, x);                  //令根结点的层次为1
    }
    //在以p结点（层次为i）为根的子树中，求x结点所在的层次
    private int getLevel(BinaryNode<T> p, int i, T x)
    { 
		//此处添加代码
		return 0;	//此语句只用来验证语法，根据实际情况改写此语句
    }
    public void leaf()                           //遍历输出叶子结点
    {
        leaf(root);
    }
    //输出以p结点为根的子树的所有叶子结点。 
    private void leaf(BinaryNode<T> p)
    {
		//此处添加代码
    }
    
    public int countLeaf()                       //返回二叉树的叶子结点数
    {
        return countLeaf(root);
    }
    private int countLeaf(BinaryNode<T> p)  //返回以p结点为根的子树的叶子结点个数
    {
		//此处添加代码
		return 0;	//此语句只用来验证语法，根据实际情况改写此语句
    }
}
