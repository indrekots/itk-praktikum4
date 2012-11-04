package ee.itcollege.i377.praktikum4.entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Guard
 *
 */
@Entity

@NamedQueries({
    @NamedQuery(name="Guard.findAll", query="SELECT g FROM Guard g")
})

public class Guard implements Serializable {

	   
	@Id
	private int id;
	private String name;
	private int age;
	private static final long serialVersionUID = 1L;

	public Guard() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}   
	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}
   
}
