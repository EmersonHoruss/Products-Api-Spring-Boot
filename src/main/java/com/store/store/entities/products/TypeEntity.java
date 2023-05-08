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
@Table(name = "ProductType")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TypeEntity extends BaseEntity {
	@Column(name = "name", nullable = false, unique = true, length = 90)
	private String name;
}
