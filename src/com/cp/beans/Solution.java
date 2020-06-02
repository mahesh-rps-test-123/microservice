package com.cp.beans;
import java.util.Scanner;
import java.util.*;
class Runner {

	static TreeNode<Integer> max1 = null;

	static TreeNode<Integer> max2 = null;

	public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root) {

		second(root);

		return max2;

	}

	static void second(TreeNode<Integer> root)

	{

		if (max1 == null)

			max1 = root;

		else if (max2 == null)

		{

			if (max1.data < root.data)

			{

				max2 = max1;

				max1 = root;

			}

			else if (max1.data != root.data)

				max2 = root;

		}

		else

		{

			if (root.data > max1.data)

			{

				max2 = max1;

				max1 = root;

			}

			else if (root.data > max2.data && root.data < max1.data)

				max2 = root;

		}

		for (int i = 0; i < root.children.size(); i++)

			second(root.children.get(i));

	}

}

class QueueEmptyException extends Exception {

}

class QueueUsingLL<T> {

	class Node<T> {

		T data;

		Node<T> next;

		Node(T data) {

			this.data = data;

		}

	}

	private Node<T> head;

	private Node<T> tail;

	private int size = 0;

	public int size() {

		return size;

	}

	public boolean isEmpty() {

		if (size == 0) {

			return true;

		}

		return false;

	}

	public T front() throws QueueEmptyException {

		if (size == 0) {

			QueueEmptyException e = new QueueEmptyException();

			throw e;

		}

		return head.data;

	}

	public void enqueue(T element) {

		Node<T> newNode = new Node<T>(element);

		if (head == null) {

			head = newNode;

			tail = newNode;

		}

		else {

			tail.next = newNode;

			tail = newNode;

		}

		size++;

	}

	public T dequeue() throws QueueEmptyException {

		if (head == null) {

			QueueEmptyException e = new QueueEmptyException();

			throw e;

		}

		if (head == tail) {

			tail = null;

		}

		T temp = head.data;

		head = head.next;

		size--;

		return temp;

	}

}

class TreeNode<T> {

	T data;

	ArrayList<TreeNode<T>> children;

	TreeNode(T data) {

		this.data = data;

		children = new ArrayList<TreeNode<T>>();

	}

}

class Solution {

	static Scanner s = new Scanner(System.in);

	public static TreeNode<Integer> takeInputLevelWise() {

		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<TreeNode<Integer>>(); // Queue of node that are
																								// entered themselves
																								// but their children
																								// aren't added yet

		int rootData = s.nextInt();

		TreeNode<Integer> root = new TreeNode<Integer>(rootData);

		pendingNodes.enqueue(root);

		while (!pendingNodes.isEmpty()) {

			TreeNode<Integer> currentNode;

			try {

				currentNode = pendingNodes.dequeue();

				int numChild = s.nextInt();

				for (int i = 0; i < numChild; i++) {

					int currentChild = s.nextInt();

					TreeNode<Integer> childNode = new TreeNode<Integer>(currentChild);

					pendingNodes.enqueue(childNode);

					currentNode.children.add(childNode);

				}

			} catch (QueueEmptyException e) {

			}

		}

		return root;

	}

	public static void main(String[] args) {

		TreeNode<Integer> root = takeInputLevelWise();

		TreeNode<Integer> ans = Runner.findSecondLargest(root);

		if (ans == null) {

			System.out.println(Integer.MIN_VALUE);

		} else {

			System.out.println(ans.data);

		}

	}

}
