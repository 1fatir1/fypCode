package com.api.cpms.entities;

import com.sun.istack.NotNull;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pId;
    @Column(name = "SKU")
    private String sku;
    private String productName;
    private int productPrice;
    private String productDescription;
    private String imageUrl;
    private String galleryUrl;
    private int productQuatity;
    private String productType;
    @Temporal(TemporalType.DATE)
    private Date date;
    @Transient
    private String productUpSale;
    private String productDownSale;
    @Transient
    private String productCrossSale;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Tags> tags;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Category> category;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<SubCategory> subCategory;
    
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Attribute> attribute;

	public Product() {
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getGalleryUrl() {
        return galleryUrl;
    }

    public void setGalleryUrl(String galleryUrl) {
        this.galleryUrl = galleryUrl;
    }

    public int getProductQuatity() {
        return productQuatity;
    }

    public void setProductQuatity(int productQuatity) {
        this.productQuatity = productQuatity;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getProductUpSale() {
        return productUpSale;
    }

    public void setProductUpSale(String productUpSale) {
        this.productUpSale = productUpSale;
    }

    public String getProductDownSale() {
        return productDownSale;
    }

    public void setProductDownSale(String productDownSale) {
        this.productDownSale = productDownSale;
    }

    public String getProductCrossSale() {
        return productCrossSale;
    }

    public void setProductCrossSale(String productCrossSale) {
        this.productCrossSale = productCrossSale;
    }

    public List<Tags> getTags() {
        return tags;
    }

    public void setTags(List<Tags> tags) {
        this.tags = tags;
    }


    public List<Category> getCategory() {
        return category;
    }

    public void setCategory(List<Category> category) {
        this.category = category;
    }

    public List<SubCategory> getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(List<SubCategory> subCategory) {
        this.subCategory = subCategory;
    }
    public List<Attribute> getAttribute() {
		return attribute;
	}

	public void setAttribute(List<Attribute> attribute) {
		this.attribute = attribute;
	}
}

