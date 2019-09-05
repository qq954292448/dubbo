package com.diaoruifeng.entity;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

public class Goods implements Serializable{
	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = -1815795665179748207L;
	private Integer id;
	private String name;
	private CategoryEnum category;
	private AddressEnum address;
	private Date createDate;
	
	private String shopIds;
	private String shopNames;
	private Integer shopIdArr[];
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the category
	 */
	public CategoryEnum getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(CategoryEnum category) {
		this.category = category;
	}
	/**
	 * @return the address
	 */
	public AddressEnum getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(AddressEnum address) {
		this.address = address;
	}
	/**
	 * @return the createDate
	 */
	public Date getCreateDate() {
		return createDate;
	}
	/**
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	/**
	 * @return the shopIds
	 */
	public String getShopIds() {
		return shopIds;
	}
	/**
	 * @param shopIds the shopIds to set
	 */
	public void setShopIds(String shopIds) {
		this.shopIds = shopIds;
	}
	/**
	 * @return the shopNames
	 */
	public String getShopNames() {
		return shopNames;
	}
	/**
	 * @param shopNames the shopNames to set
	 */
	public void setShopNames(String shopNames) {
		this.shopNames = shopNames;
	}
	/**
	 * @return the shopIdArr
	 */
	public Integer[] getShopIdArr() {
		return shopIdArr;
	}
	/**
	 * @param shopIdArr the shopIdArr to set
	 */
	public void setShopIdArr(Integer[] shopIdArr) {
		this.shopIdArr = shopIdArr;
	}
	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Goods(Integer id, String name, CategoryEnum category, AddressEnum address, Date createDate, String shopIds,
			String shopNames, Integer[] shopIdArr) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.address = address;
		this.createDate = createDate;
		this.shopIds = shopIds;
		this.shopNames = shopNames;
		this.shopIdArr = shopIdArr;
	}
	/* (non Javadoc) 
	 * @Title: toString
	 * @Description: TODO
	 * @return 
	 * @see java.lang.Object#toString() 
	 */
	@Override
	public String toString() {
		return "Goods [id=" + id + ", name=" + name + ", category=" + category + ", address=" + address
				+ ", createDate=" + createDate + ", shopIds=" + shopIds + ", shopNames=" + shopNames + ", shopIdArr="
				+ Arrays.toString(shopIdArr) + "]";
	}
	/* (non Javadoc) 
	 * @Title: hashCode
	 * @Description: TODO
	 * @return 
	 * @see java.lang.Object#hashCode() 
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((createDate == null) ? 0 : createDate.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Arrays.hashCode(shopIdArr);
		result = prime * result + ((shopIds == null) ? 0 : shopIds.hashCode());
		result = prime * result + ((shopNames == null) ? 0 : shopNames.hashCode());
		return result;
	}
	/* (non Javadoc) 
	 * @Title: equals
	 * @Description: TODO
	 * @param obj
	 * @return 
	 * @see java.lang.Object#equals(java.lang.Object) 
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Goods other = (Goods) obj;
		if (address != other.address)
			return false;
		if (category != other.category)
			return false;
		if (createDate == null) {
			if (other.createDate != null)
				return false;
		} else if (!createDate.equals(other.createDate))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (!Arrays.equals(shopIdArr, other.shopIdArr))
			return false;
		if (shopIds == null) {
			if (other.shopIds != null)
				return false;
		} else if (!shopIds.equals(other.shopIds))
			return false;
		if (shopNames == null) {
			if (other.shopNames != null)
				return false;
		} else if (!shopNames.equals(other.shopNames))
			return false;
		return true;
	}
	
	
	
}
