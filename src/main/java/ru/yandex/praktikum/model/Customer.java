package ru.yandex.praktikum.model;

public class Customer {

	private final String name;
	private final String surname;
	private final String address;
	private final String metro;
	private final String phoneNumber;

	public Customer(String name, String surname, String address, String metro, String phoneNumber) {
		this.name = name;
		this.surname = surname;
		this.address = address;
		this.metro = metro;
		this.phoneNumber = phoneNumber;
	}

	public static Customer getSimpleCustomer() {
		return new Customer(
				"Петр",
				"Петров",
				"ул Петрова",
				"Охотный ряд",
				"+79267504499");
	}

	public static Customer getComplexCustomer() {
		return new Customer(
				"Иван",
				"Кузнецов",
				"ул Комсомольская 33",
				"Комсомольская",
				"+79296675566");
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public String getAddress() {
		return address;
	}

	public String getMetro() {
		return metro;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
}
