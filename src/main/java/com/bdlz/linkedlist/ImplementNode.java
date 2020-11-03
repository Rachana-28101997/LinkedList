package com.bdlz.linkedlist;

public class ImplementNode<K> implements InterfaceNode<K> {

	private K key;
	private InterfaceNode<K> next;

	public ImplementNode(K key) {
		super();
		this.key = key;
		this.next = null;
	}

	public InterfaceNode<K> getNext() {
		return next;
	}

	public void setNext(InterfaceNode<K> next) {
		this.next = next;
	}

	@Override
	public K getKey() {
		return key;
	}

	@Override
	public void setKey(K key) {
		this.key = key;
	}
}