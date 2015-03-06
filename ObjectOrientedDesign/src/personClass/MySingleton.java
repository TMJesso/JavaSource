/*
 * How to use only one object of a class
 * using the singleton design pattern we can make sure
 * that only one instantiation of a object exists
 * 
 * 
 * 
 * 
 *
 */
 package personClass;
// implementing a singleton in Java
public class MySingleton {
	// placeholder for current singleton object
	private static MySingleton __me = null;
	// private constructor - now no other object can instantiate
	private MySingleton() {}
	// this is how you ask for the singleton
	public static MySingleton getInstance() {
		// do I exist?
		if (__me == null) {
			// if not, instantiate and store
			__me = new MySingleton();
		}
		return __me;
	}
}


class UseSingleton {
	MySingleton single = MySingleton.getInstance(); {
			
		if (single == null) {
			// already in user
		} else {
			// able to be used
		}
	}
}
