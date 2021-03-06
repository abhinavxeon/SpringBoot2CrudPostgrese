package com.crud.enty;





import java.io.Serializable;

import javax.persistence.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name = "users")
public class User implements Serializable{
	 @Id
	 @Column(name="id")
	private long id;
	
	 @Column(name="username")
    private String username;

  
    
    public User(long id, String username) {
		
		this.id = id;
		this.username = username;
	}

	public User() {
    }

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }
}
