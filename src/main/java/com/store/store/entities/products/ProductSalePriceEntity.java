package com.store.store.entities.products;

import com.store.store.entities.BaseEntity;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "ProductSalePrice")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductSalePriceEntity extends BaseEntity {
	@Column(name = "price", nullable = false, unique = false, precision = 4, scale = 2)
	private float price;

	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "product_id", referencedColumnName = "id")
	private ProductEntity product;

	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "sale_price_id", referencedColumnName = "id")
	private SalePriceEntity salePrice;
}
