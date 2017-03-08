package net.sports.ZenSportsBackEnd.model;

public class Category {
	private int categoryId;
	private String categoryName;
	private boolean active = true;

	public Category() {
		super();
	}

	public Category(int categoryId, String categoryName, boolean active) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.active = active;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

}
