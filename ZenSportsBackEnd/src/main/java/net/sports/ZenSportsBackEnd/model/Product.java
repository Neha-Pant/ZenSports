package net.sports.ZenSportsBackEnd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productId;
	@Size(min=1, max=30)
	private String productName;
	@NotBlank
	private String productCategory;
	@Size(min=20, max=300)
	private String productDescription;
	@NotBlank
	private String productKeyword;
	@NotBlank
	private String productImage;
	@Range(min=1,max=1000000)
	private int productPrice;
	@Range(min=0,max=100)
	private int productQuantity;

	public Product() {
		super();
	}

	public Product(int productId, String productName, String productCategory, String productDescription,
			String productKeyword, String productImage, int productPrice, int productQuantity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCategory = productCategory;
		this.productDescription = productDescription;
		this.productKeyword = productKeyword;
		this.productImage = productImage;
		this.productPrice = productPrice;
		this.productQuantity = productQuantity;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getProductKeyword() {
		return productKeyword;
	}

	public void setProductKeyword(String productKeyword) {
		this.productKeyword = productKeyword;
	}

	public String getProductImage() {
		return productImage;
	}

	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

}
