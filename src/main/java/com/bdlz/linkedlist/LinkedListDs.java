package com.bdlz.linkedlist;

public class LinkedListDs<K> {
	public static InterfaceNode head;
	public static InterfaceNode tail;

	public LinkedListDs() {
		this.head = null;
		this.tail = null;
	}

	public void add(InterfaceNode<K> newNode) {
		if (this.tail == null && this.head == null) {
			this.tail = newNode;
			this.head = newNode;
		} else {
			InterfaceNode<K> tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
	}
}
