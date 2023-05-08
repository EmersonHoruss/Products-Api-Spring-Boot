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
@Table(name = "SalePrice")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SalePriceEntity extends BaseEntity {
	@Column(name = "name", nullable = false, unique = true, length = 45)
	private String name;
	
	@Column(name = "description", nullable = true, unique = false, length = 256)
	private String description;
	
	@Column(name = "min", nullable = false, unique = true)
	private short min;
	
	@Column(name = "max", nullable = false, unique = true)
	private short max;
}
