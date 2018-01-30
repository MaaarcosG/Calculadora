/**
 * @author Marcos Gutierrez 			17909
 * @author Raul Monzon					17014
 * @since 26 de enero 2018
 */

import java.util.ArrayList;

public class StackArrayList<E> implements Stack<E> {
	
	/*Creamos la lista a utilizar*/
	protected ArrayList<E> datos;
	
	/*Constructos de la clase*/
	public StackArrayList() {
		datos = new ArrayList<E>();
	}
	/**
	 * @param E item
	 */
	@Override
	public void push(E item) {
		/*Añadimos algo a los datos*/
		datos.add(item);
	}
	/**
	 * @return datos removidos
	 */
	@Override
	public E pop()
	{
		return datos.remove(size()-1);
	}

	/**
	 * @return 
	 */
	@Override
	public E peek() {
		/*Si no esta vacio*/
		return datos.get(size()-1);
	}
	/**
	 * @return 0
	 */
	@Override
	public boolean empty() {
		/*Si esta vacio*/
		return size() == 0;
	}
	/**@return tamaño de los datos
	 * 
	 */
	@Override
	public int size() {
		/*Da el tamaño de los datos*/
		return datos.size();
	}
}
