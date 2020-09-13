package org.trishinfotech.singleton.example3;

public class SingletonClass {
	private static SingletonClass SINGLE_INSTANCE = null;

	private SingletonClass() {
	}

	public static SingletonClass getInstance() {
		if (SINGLE_INSTANCE == null) {
			synchronized (SingletonClass.class) {
				if (SINGLE_INSTANCE == null) {
					SINGLE_INSTANCE = new SingletonClass();
				}
			}
		}
		return SINGLE_INSTANCE;
	}
}