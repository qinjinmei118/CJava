package org.ddd.annotation.example;

public class Teacher {
	@ID
	@Column(nullable = false)
	private Integer id;
	
	@Column(length = 16)
	private String name;
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
