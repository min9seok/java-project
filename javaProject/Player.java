package javaProject;

import java.io.Serializable;

class Player implements Serializable{

	private static final long serialVersionUID = 1425821168775014880L;
	private String name;

	Player(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return this.name ;
	}

}