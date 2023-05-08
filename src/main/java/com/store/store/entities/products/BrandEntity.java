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
@Table(name = "ProductBrand")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BrandEntity extends BaseEntity {
	@Column(name = "name", nullable = false, unique = true, length = 45)
	private String name;
}