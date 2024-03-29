package com.example;

public class CustomPair<K,V> implements Pair<K,V> {

	private K key;
	private V value;
	
	public CustomPair(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}

	@Override
	public K getKey() {
		// TODO Auto-generated method stub
		return key;
	}

	@Override
	public V getValue() {
		// TODO Auto-generated method stub
		return value;
	}

	
}
