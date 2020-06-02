package com.cp.beans;

import java.util.Iterator;
import java.util.LinkedList;

public class DfsSearch {
	
	private int V;
	
	private static LinkedList<Integer> adj[];
	
	public DfsSearch(int v) {
		V=v;
		adj=new LinkedList[v];
		for(int i=0;i<v;i++)
			adj[i]=new LinkedList();
	}
	
	public void addEdge(int v,int w) {
		adj[v].add(w);
	}
	
	void DfsUtil(int v,boolean visited[]) {
		visited[v]=true;
		System.out.print(v+" ");
		Iterator<Integer> i=adj[v].listIterator();
		while(i.hasNext()) {
			int n=i.next();
			if(!visited[n]) {
				DfsUtil(n,visited);
			}
			
		}
	}
	
	 void dfs(int v) {
		boolean visited[]=new boolean[V];
		DfsUtil(v,visited);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DfsSearch dfsSearch=new DfsSearch(4);
		dfsSearch.addEdge(0, 1);
		dfsSearch.addEdge(0, 2);
		dfsSearch.addEdge(1, 2);
		dfsSearch.addEdge(2, 0);
		dfsSearch.addEdge(2, 3);
		dfsSearch.addEdge(3, 3);
		
		dfsSearch.dfs(2);

	}

}
