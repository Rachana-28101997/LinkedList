package com.bdlz.linkedlist;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestLinkedList {

	@Test
	public void ThreeNumbersSimpleLinkedList() {
		ImplementNode<Integer> firstNode = new ImplementNode<Integer>(56);
		ImplementNode<Integer> secondNode = new ImplementNode<Integer>(30);
		ImplementNode<Integer> thirdNode = new ImplementNode<Integer>(70);
		firstNode.setNext(secondNode);
		secondNode.setNext(thirdNode);
		boolean result = firstNode.getNext().equals(secondNode) && secondNode.getNext().equals(thirdNode);
		Assert.assertTrue(result);
	}

	@Test
	public void whenAddedToLinkedListShouldBeAddedAtTheTop() {
		ImplementNode<Integer> firstNode = new ImplementNode<Integer>(70);
		ImplementNode<Integer> secondNode = new ImplementNode<Integer>(30);
		ImplementNode<Integer> thirdNode = new ImplementNode<Integer>(56);
		LinkedListDs lst = new LinkedListDs();
		lst.add(firstNode);
		lst.add(secondNode);
		lst.add(thirdNode);
		boolean result = LinkedListDs.head.equals(thirdNode) && LinkedListDs.head.getNext().equals(secondNode)
				&& LinkedListDs.tail.equals(firstNode);
		Assert.assertTrue(result);
	}

	@Test
	public void whenAppendedToLinkedListShouldBeAddedAtTheLast() {
		ImplementNode<Integer> firstNode = new ImplementNode<Integer>(56);
		ImplementNode<Integer> secondNode = new ImplementNode<Integer>(30);
		ImplementNode<Integer> thirdNode = new ImplementNode<Integer>(70);
		LinkedListDs lst = new LinkedListDs();
		lst.add(firstNode);
		lst.append(secondNode);
		lst.append(thirdNode);
		boolean result = LinkedListDs.head.equals(firstNode) && LinkedListDs.head.getNext().equals(secondNode)
				&& LinkedListDs.tail.equals(thirdNode);
		Assert.assertTrue(result);
	}
	@Test
	public void whenInsertedToLinkedListShouldBeAddedInBetweenElements() {
		ImplementNode<Integer> firstNode = new ImplementNode<Integer>(56);
		ImplementNode<Integer> secondNode = new ImplementNode<Integer>(30);
		ImplementNode<Integer> thirdNode = new ImplementNode<Integer>(70);
		LinkedListDs lst = new LinkedListDs();
		lst.add(firstNode);
		lst.append(thirdNode);
		lst.insert(firstNode, thirdNode);
		boolean result = LinkedListDs.head.equals(firstNode) && LinkedListDs.head.getNext().equals(secondNode)
				&& LinkedListDs.tail.equals(thirdNode);
		Assert.assertTrue(result);
	}
}
