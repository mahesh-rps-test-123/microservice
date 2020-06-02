package com.cp.beans;

import java.util.Iterator;
import java.util.LinkedList;

public class BfsGraph {
	
	private int V;
	private LinkedList<Integer> adj[];
	
	public BfsGraph(int v) {
		
		V=v;
		adj=new LinkedList[v];
		for(int i=0;i<v;i++)
			adj[i]=new LinkedList();
		
	}
public void addEdge(int v,int w) {
	adj[v].add(w);
}
public void bfs(int s) {
	
	boolean visited[]=new boolean[V];
	LinkedList<Integer> queue=new LinkedList<Integer>();
	visited[s]=true;
	queue.add(s);
	while(queue.size()!=0) {
		int n=queue.poll();
		System.out.print(n+" ");
		Iterator<Integer> i=adj[s].listIterator();
		while(i.hasNext()) {
			int k=i.next();
			if(!visited[k]) {
				visited[k]=true;
				queue.add(k);
			}
			
		}
		
		
		
	}
	
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BfsGraph bfsGraph=new BfsGraph(4);
		
		bfsGraph.addEdge(0, 1);
		bfsGraph.addEdge(0, 2);
		bfsGraph.addEdge(1, 2);
		bfsGraph.addEdge(2, 0);
		bfsGraph.addEdge(2, 3);
		bfsGraph.addEdge(3, 3);
		
		bfsGraph.bfs(2);
		

	}

}
