package com.Exceptions.java;

import java.text.Format.Field;

public class NoSuchField {
	private static java.lang.reflect.Field getReflectStaticField(String name, Class clazz) throws NoSuchFieldException {
	    try {
	      java.lang.reflect.Field field = clazz.getDeclaredField(name);
	      if (!field.isAccessible()) {
	        field.setAccessible(true);
	      }
	      return field;
	    } catch (NoSuchFieldException e) {
	      // ignore and search next
	      e.printStackTrace();
	    }
	    throw new NoSuchFieldException("Field " + name + " not found in " + clazz);
	  }
	
	public static void main(String[] args) {

		

	}

}
