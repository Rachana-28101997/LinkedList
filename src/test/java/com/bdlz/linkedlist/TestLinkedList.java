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
}
