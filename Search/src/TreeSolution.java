
public class TreeSolution {
	boolean isSymmetrical(Tree r1,Tree r2) {  
        if (r1 == null&&r2 == null)  
           return true;  
        if (r1 == null||r2 == null)  
           return false;  
        return r1.val==r2.val&&isSymmetrical(r1.left,r2.right)&&isSymmetrical(r1.right,r2.left);  
    }  
  
    boolean isSymmetrical(Tree pRoot)  
    {  
        return isSymmetrical(pRoot,pRoot);  
    }  
}
