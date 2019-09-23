package br.cesed.rb;

public class Teste {

	public static void main(String[] args) {
		SequentialList sequentialList = new SequentialList();
		
		sequentialList.addFirst(5);
		sequentialList.addFirst(10);
		sequentialList.addFirst(20);
		sequentialList.addFirst(30);
		sequentialList.addFirst(40);
		sequentialList.addFirst(50);
		sequentialList.addFirst(14);
		
		System.out.println(sequentialList.toString());
		
		sequentialList.addLast(1);
		
		System.out.println(sequentialList.toString());
		
	}

}
