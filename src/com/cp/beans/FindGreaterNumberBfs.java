package com.cp.beans;

import java.util.LinkedList;

public class FindGreaterNumberBfs {
	
	
	private int V;
	private LinkedList<Integer>adj[];
	public FindGreaterNumberBfs(int v) {
		V=v;
		adj=new LinkedList[v];
		for(int i=0;i<v;i++) {
			adj[i]=new LinkedList();
		}
	}

	//pulbic void
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
