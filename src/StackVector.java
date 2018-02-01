import java.util.Vector;

public class StackVector<E> implements Stack<E> {
	protected Vector<E> datos;
	
	public StackVector() {
		datos = new Vector<E>();
	}
	
	@Override
	public void push(E item) {
		/*Añadimos datos al stack*/
		datos.addElement(item);
		
	}

	@Override
	public E pop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean empty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

}
