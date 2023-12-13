package com.practise.rivision;

public class AnnotClass {

	
	
	 /**
     * Deprecated method. Use {@link #newMethod()} instead.
     * This method will be removed in future versions.
     * @deprecated Use {@link #newMethod()} instead.
     */
    @Deprecated
    public void deprecatedMethod() {
        System.out.println("This method is deprecated. Use newMethod() instead.");
        // Your existing method logic here
    }

    public void newMethod() {
        // New and improved method logic
    }
}
