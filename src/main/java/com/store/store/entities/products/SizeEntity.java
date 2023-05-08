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
@Table(name = "ProductSize")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SizeEntity extends BaseEntity {
	@Column(name = "name", nullable = false, unique = true, length = 20)
	private String name;
}
