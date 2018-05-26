package learnjava;

public class Compair<K,V> implements Pair<K,V> {

	private K key;
	private V value;
	
	public Compair(K key, V value){
		
		this.key = key;
		this.value = value;
	}
	
	@Override
	public K getkey() {
		
		return this.key;
	}

	@Override
	public V getvalue() {
	
		return this.value;
	}
	
	

}
