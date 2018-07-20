package Book;

import java.util.Arrays;

import java.util.Comparator;

import java.util.function.Predicate;

public class HW5 {
	public static String authorBook1 = "Stephen Hawking";

	public static void main(String[] args) {

		Book book1 = new Book(1, "The Grand Design", authorBook1, "Transworld Digital", 2015, 256, 406, "limp");

		String authorBook2 = "Robert Winston";

		Book book2 = new Book(2, "SuperHuman Encyclopedia", authorBook2, "Dorling Kindersley", 2014, 208, 432, "hard");

		Book[] arr = { book1, book2 };

		Book[] sortedBooksByAuthors =

				HW5.sortBooks(arr, (book3, book4) -> {

					return book3.getAuthors().compareToIgnoreCase(book4.getAuthors());
				});
		System.out.println(Arrays.toString(sortedBooksByAuthors));
		Book[] filterArr =

				HW5.filterArr(arr, (book) -> authorBook1.equals(book.getAuthors()));
		System.out.println(Arrays.toString(filterArr));


	}

	public static Book[] sortBooks(Book[] arr, Comparator<Book> comparator) {

		Book[] resultArr = Arrays.copyOf(arr, arr.length);

		Arrays.sort(resultArr, comparator);

		return resultArr;

	}

	public static Book[] filterArr(Book[] arr, Predicate<Book> predicate) {
		
		return Arrays.stream(arr)

				.filter(predicate)

				.toArray(Book[]::new);

	}
}

class Book {

	private int id;

	private String name;

	private String authors;

	private String publisher;

	private int publisherYear;

	private int numOfPages;

	private int price;

	private String typeOfBinding;

	public Book(int id, String name, String authors, String publisher, int publisherYear, int numOfPages, int price,

			String typeOfBinding) {

		this.id = id;

		this.name = name;

		this.authors = authors;

		this.publisher = publisher;

		this.publisherYear = publisherYear;

		this.numOfPages = numOfPages;

		this.price = price;

		this.typeOfBinding = typeOfBinding;

	}

	public int getId() {

		return id;

	}

	public String getName() {

		return name;

	}

	public String getAuthors() {

		return authors;

	}

	public String getPublisher() {

		return publisher;

	}

	public int getPublisherYear() {

		return publisherYear;

	}

	public int getNumOfPages() {

		return numOfPages;

	}

	public int getPrice() {

		return price;

	}

	public String getTypeOfBinding() {

		return typeOfBinding;
	}

	@Override
	public String toString() {
		return "Book{" + "id=" + id + ", name='" + name + '\'' + ", authors=" + authors + "" + ", publisher='"
				+ publisher + '\'' + ", publisherYear=" + publisherYear + ", numOfPages=" + numOfPages + ", price="
				+ price + ", typeOfBinding='" + typeOfBinding + '\'' + '}';
	}

}