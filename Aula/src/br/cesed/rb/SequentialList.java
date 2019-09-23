/**
 * 
 */
package br.cesed.rb;

import java.util.Iterator;

/**
 * @author Allef
 *
 */
public class SequentialList {
	
	
	private static final int NUMEROINICIAL = 3;
	private Object[] arrayInter = new Object[NUMEROINICIAL];
	private int inseridos = 0;

//	public SequentialList(Object[] arrayInter) {
//		super();
//		this.arrayInter = arrayInter;
//		
//	}
	

	public void addFirst(Object o) {
		if (this.inseridos == this.arrayInter.length) {
			this.duplicate();
		}
		this.arrayInter[this.inseridos] = o;
		this.inseridos++;
	}
	
	public void ordenar() {
		int aux = 0;
		
		for (int i = (this.inseridos - 1); i >= 0; i--) {
			this.arrayInter[i];
		}
	}
	
	public void addLast(Object o) {
		if (this.inseridos == this.arrayInter.length) {
			this.duplicate();
		}
		Object[] arrayTemp = new Object[arrayInter.length];
		arrayTemp[0] = o;
		
		for (int i = 0; i < this.inseridos; i++) {
			arrayTemp[i+1] = arrayInter[i];
		}
		this.arrayInter = arrayTemp;
		this.inseridos++;
	}
	
	private void duplicate() {
		Object[] arrayTemp = new Object[(this.inseridos * 2)];
		
		for (int i = 0; i < this.arrayInter.length; i++) {
			arrayTemp[i] = this.arrayInter[i];
		}
		
		this.arrayInter = arrayTemp;
	}
	
	@Override
	public String toString() {
		String valores = "";
		for (int i = 0; i < this.arrayInter.length; i++) {
			if (this.arrayInter[i] != null) {
				if (i == (this.inseridos - 1)) {
					valores += this.arrayInter[i];
				} else {
					valores += this.arrayInter[i] + ", ";
				}
			}
		}
		
		return valores;
	}
	
	public Object[] getArrayInter() {
		return arrayInter;
	}
	public void setArrayInter(Object[] arrayInter) {
		this.arrayInter = arrayInter;
	}
	public int getInseridos() {
		return inseridos;
	}
	public void setInseridos(int inseridos) {
		this.inseridos = inseridos;
	}
	public static int getNumeroinicial() {
		return NUMEROINICIAL;
	}
	
	
	
	


	
	
	
}
