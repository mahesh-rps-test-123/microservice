package com.cp.beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Day12Challenge {
	
	public static int findMaxValue(Map<Integer,Integer> map) {
		
		List<Map.Entry<Integer,Integer>> list=new LinkedList<Map.Entry<Integer,Integer>>(map.entrySet());
		
		
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter values");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> weights=new ArrayList<Integer>();
		ArrayList<Integer> values=new ArrayList<Integer>();
		ArrayList<Integer> averageValues=new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			weights.add(sc.nextInt());
		}
		for(int i=0;i<n;i++) {
			values.add(sc.nextInt());
		}
		System.out.println("");
		weights.stream().forEach(System.out::println);
		System.out.println("***************************************");
		values.stream().forEach(System.out::println);
		
		for(int i=0;i<n;i++) {
			int temp=Math.round(values.get(i)/weights.get(i));
			averageValues.add(values.get(i)/weights.get(i));
		}
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		averageValues.stream().forEach(System.out::println);
		
		Map<Integer,Integer> weightAndValuesMap=new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++) {
			weightAndValuesMap.put(weights.get(i), values.get(i));
		}
		
		int k=findMaxValue(weightAndValuesMap);

	}

}
