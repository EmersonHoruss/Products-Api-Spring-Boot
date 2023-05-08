package com.store.store.entities.products;

import com.store.store.entities.BaseEntity;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Product")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductEntity extends BaseEntity {
	@Column(name = "amount", nullable = false, unique = false)
	private short amount;
	
	@Column(name = "name", nullable = false, unique = true, length = 180)
	private String name;
	
	@Column(name = "description", nullable = false, unique = true, length = 256)
	private String description;

	@ManyToOne(optional = false)
	@JoinColumn(name = "product_brand_id", referencedColumnName = "id")
	private BrandEntity brand;

	@ManyToOne(optional = false)
	@JoinColumn(name = "product_size_id", referencedColumnName = "id")
	private SizeEntity size;

	@ManyToOne(optional = false)
	@JoinColumn(name = "product_type_id", referencedColumnName = "id")
	private  TypeEntity type;

	@OneToMany(mappedBy = "product", cascade = CascadeType.REMOVE)
	private List<ProductPhotoEntity> photos;

	@OneToMany(mappedBy = "product", cascade = CascadeType.REMOVE)
	private List<ProductSalePriceEntity> salePrices;
}
