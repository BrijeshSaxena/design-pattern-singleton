package org.trishinfotech.singleton.example4;

public class SingletonClass {
	private SingletonClass() {
	}

	private static class SingletonClassHolder {
		static final SingletonClass SINGLE_INSTANCE = new SingletonClass();
	}

	public static SingletonClass getInstance() {
		return SingletonClassHolder.SINGLE_INSTANCE;
	}
}