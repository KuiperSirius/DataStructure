import java.util.ArrayList;
import java.util.LinkedList;

public class SearchGraph<T> {
/**定义图，节点类型为泛型T
*/
int edgeNum;//定义图的边数
int[][] edgeMatrix;//用邻接矩阵储存图的边
ArrayList<T> vertexList;//采用可变数组存储图的节点	

public 	SearchGraph(int n){
	vertexList=new ArrayList<T>(n);
	edgeNum=0;
	edgeMatrix=new int[n][n];
}

//得到图中所包含结点数
	public int getVertexNum(){
		return vertexList.size();
	}
//得到图中的边数
	public int getEdgeNum(){
		return edgeNum;
	}
//插入指定T类型的节点
	public void insertVertex(T value){
		vertexList.add(vertexList.size(),value);
	}
//得到指定下标的结点数值
	public T getVertexValue(int i){
		return vertexList.get(i);
	}
//获得指定结点之间边的权
	public int getWeight(int i,int j){
		return edgeMatrix[i][j];
	}
//赋值给特定边权
	public void insertEdge(int i,int j,int value){
		edgeMatrix[i][j]=value;
		edgeNum++;
	}
//删除特定边
	public void deletetEdge(int i,int j){
			edgeMatrix[i][j]=0;
			edgeNum--;
		}	
//获得指定结点的第一个邻接节点的下标
	public int getFirstNeighbor(int vertexIndex){
		if(vertexIndex>=0&&vertexIndex<vertexList.size()){
			for(int j=0;j<vertexList.size();j++){
				if(edgeMatrix[vertexIndex][j]>0){
					return j;
				}
				return -1;
			}
		}	
		return -1;
	}
//获得指定节点的下一个邻接节点的下标	,index为指定节点，knownNeighbor为上次获得邻接结点下标
	public int getNextNeighbor(int index,int knownNeighbor){
		for(int j=knownNeighbor+1;j<vertexList.size();j++){
			if(edgeMatrix[index][j]>0){
				return j;
			}
		}
		return -1;
	}
//深度优先遍历算法DFS，私有方法，用作重载
	private void depthFirstSearch(boolean[] visited,int v){
		System.out.println(vertexList.get(v)+"");
		visited[v]=true;//表示已经访问过的下标
		
		int next=getFirstNeighbor(v);
		while(next!=-1){
			if(!visited[next]){
				depthFirstSearch(visited,next);
			}
			next= getNextNeighbor(v,next);
		}	
	}	
//可供外部调用的深度优先算法
	public void depthFirstSearch(){
		//默认布尔类型数组false
	boolean[] visited=new boolean[getVertexNum()];	
		for(int i=0;i<getVertexNum();i++){
			//未访问的元素下标，判断条件visited[i]==false
			if(!visited[i]){
				this.depthFirstSearch(visited,i);
			}
		}	
	}
	
	//可供外部调用的广度优先算法	
	public void boardFirstSearch(){
		//默认布尔类型数组false
		boolean[] visited=new boolean[getVertexNum()];	
			for(int i=0;i<getVertexNum();i++){
				//未访问的元素下标，判断条件visited[i]==false
				if(!visited[i]){
					this.depthFirstSearch(visited,i);
				}
			}	
	
	}
	
	private void boardFirstSearch(boolean[] visited,int w){
		System.out.println(vertexList.get(w)+"");
		visited[w]=true;
		LinkedList queue=new LinkedList();
		queue.addLast(w);
		int first;
		first=getFirstNeighbor(w);
		while(first!=-1){
			System.out.println(vertexList.get(first)+"");
			
			
			
			getNextNeighbor(w,first);
		}
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
