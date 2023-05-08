package com.store.store.entities.products;

import com.store.store.entities.BaseEntity;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name = "Photo")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PhotoEntity extends BaseEntity {
	// https://docs.oracle.com/javaee/6/api/javax/persistence/Lob.html
	@Column(name = "photo", nullable = false, unique = false)
	private byte[] photo;
	
	@Column(name = "name", nullable = true, unique = true, length = 90)
	private String name;
	
	@Column(name = "description", nullable = true, unique = false, length = 256)
	private String description;
}
