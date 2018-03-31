package com.ww.testproject.Question3;

import java.util.PriorityQueue;
import java.util.Random;
import java.util.Scanner;

public class Question3 {

	private static void println(String str) {
		System.out.println(str);
	}

	private static void print(String str) {
		System.out.print(str);
	}

	/**
	 * Find the Kth smallest element of an array
	 *
	 * @param array
	 *            : Given array
	 * @param k
	 *            : value of K
	 * @return : Kth smallest element
	 */
	public static int findKthSmallestElement(int[] array, int k) {
		PriorityQueue priorityQueue = new PriorityQueue();
		for (int i = 0; i < array.length; i++) {
			priorityQueue.offer(array[i]);
		}
		println("Final priority-queue " + priorityQueue);
		int currentNo = 0;
		while (k > 0) {
			currentNo = (int) priorityQueue.poll();
			k--;
		}
		return currentNo;
	}

	/**
	 * Utility method to print all elements of an array
	 *
	 * @param arr
	 *            : Array to print
	 */
	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			print(arr[i] + " ");
		}
	}

	public static void main(String args[]) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		println("How many numbers you want to add to the array : ");
		int total_num = scanner.nextInt();
		int[] num_array = new int[total_num];
		for (int i = 0; i < total_num; i++)
			num_array[i] = Math.abs(random.nextInt(10000));
		println("Random array : ");
		printArray(num_array);
		println("");
		println("Enter k : ");
		int k = scanner.nextInt();
		System.out.println("Smallest element for k = " + k + " : " + findKthSmallestElement(num_array, k));
	}
}
