package view;

import model.*;

public class Principal {
	
	public static void main(String[] args) throws Exception {
		Lista l = new Lista();
		Lista l2 = new Lista();
		int i, j, menor = 999, reg = 0;
		l.addFirst(10);
		l.addLast(5);
		l.addLast(8);
		l.addLast(1);
		l.addLast(9);
		l.addLast(2);
		l.addLast(4);
		l.addLast(7);
		l.addLast(3);
		l.addLast(6);
		System.out.println("Lista normal: ");
		for (i = 0; i < l.size(); i++) {
			System.out.print(l.get(i) + " - ");
		}
		System.out.println();
		for (j = 0; j < 10; j++) {
			for (i = 0; i < l.size(); i++) {
				if (l.get(i) < menor) {
					menor = l.get(i);
					reg = i;
				}
			}
			l.remove(reg);
			l2.addLast(menor);
			menor = 999;
		}
		System.out.println("Lista ordenada: ");
		for (i = 0; i < l2.size(); i++) {
			System.out.print(l2.get(i) + " - ");
		}
		
	}

}
