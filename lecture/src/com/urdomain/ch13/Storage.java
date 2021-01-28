package com.urdomain.ch13;

public interface Storage<T> {
	public void add(T item, int index);
	public T get(int index);
}