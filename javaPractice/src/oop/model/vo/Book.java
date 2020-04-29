package oop.model.vo;

public class Book {
	private String title;
	private int price;
	private double discount;
	private String author;
	
	public Book() {	}

	public Book(String title, int price, double discount, String author) {
		super();
		this.title = title;
		this.price = price;
		this.discount = discount;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String inform() {
		return title + "\t" + price + "\t" + discount + "\t" + author;
	}
	
}
