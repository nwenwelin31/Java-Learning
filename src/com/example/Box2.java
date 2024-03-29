package com.example;

public class Box2<T> {
	private T name;
	public void set(T name) {
		this.name = name;
	}
	public T get() {
		return name;
	}
}
