package day30;

public interface List<E> {
	
	boolean isEmpty();
	
	int size();
	
	void add(int i, E e);
	
	E remove(int i);
	
	E get(int i);
	
	E set(int i, E e);
	
	void clear();

}
