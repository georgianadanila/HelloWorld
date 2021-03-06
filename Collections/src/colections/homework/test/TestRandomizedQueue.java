package colections.homework.test;

import java.util.Random;

import colections.homework.main.RandomizedQueue;

public class TestRandomizedQueue {

	public RandomizedQueue<Integer> randomizedQueue = new RandomizedQueue<>();
	Random randomObject = new Random();
	
	@Override
	public String toString() {
		return randomizedQueue.toString();
	}
	/*
	 * testeaza metoda enqueue - adaug elemente in ordine crescatoare
	 */
	public void testEnqueue() {
		int nr = 55;
		for (int i=0; i<nr; i++) {
			randomizedQueue.enqueue(i);
		}
		System.out.println("Coada initiala are " + nr + " elemente");
	}
	
	/*
	 * testeaza metoda dequeue - elementele sunt scoase random si afisate
	 */
	public void testDequeue() {
		int nr = 20;
		System.out.println(nr + " elemente scose din coada (in ordinea in care sunt scoase)");
		for (int i=0; i<nr; i++) {
			System.out.print(randomizedQueue.dequeue() + " ");	
		}
		System.out.println("\nAu mai ramas " + randomizedQueue.size() + " elemente.");
		System.out.println(randomizedQueue);
	}
	
	public void testIterator() {
		System.out.println("Parcurgere elemente cu iterator si afisarea lor");
		for (Integer elem : randomizedQueue) {
			System.out.print(elem + " ");
		}
		System.out.println();
	}
}
