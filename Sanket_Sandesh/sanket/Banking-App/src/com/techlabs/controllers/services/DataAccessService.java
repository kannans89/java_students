package com.techlabs.controllers.services;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.techlabs.controllers.components.Customer;
import com.techlabs.controllers.components.LowBalanceException;
import com.techlabs.controllers.components.Transaction;
import com.techlabs.controllers.components.TransactionType;

public class DataAccessService {

	private final String connectionType;
	private final String database;
	private final String host;
	private final String port;
	private final String databaseName;
	private final String username;
	private final String password;
	private Connection connection;

	public DataAccessService(String connectionType, String database, String host, String port, String databaseName,
			String username, String password) throws SQLException, ClassNotFoundException {

		this.connectionType = connectionType;
		this.database = database;
		this.host = host;
		this.port = port;
		this.databaseName = databaseName;
		this.username = username;
		this.password = password;

		connectToDatabase1();
	}

	public DataAccessService() throws SQLException, ClassNotFoundException {
		this("jdbc", "mysql", "localhost", "4040", "bank", "root", "admin");
	}

	@SuppressWarnings("unused")
	private void connectToDatabase() throws SQLException {

		connection = DriverManager.getConnection(connectionType + ":" + database + "://" + host + ":" + port + "/"
				+ databaseName + "?user=" + username + "&password=" + password);

	}

	private void connectToDatabase1() throws SQLException, ClassNotFoundException {

		String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		String DB_URL = "jdbc:mysql://localhost:4040/bank";

		String USER = "root";
		String PASS = "admin";

		Class.forName(JDBC_DRIVER);
		connection = DriverManager.getConnection(DB_URL, USER, PASS);
	}

	public Customer getCustomer(String id) throws SQLException, LowBalanceException {
		PreparedStatement query = connection.prepareStatement("Select * from customers where ID = ?");
		query.setString(1, id);
		ResultSet resultSet = query.executeQuery();

		Customer customer = null;

		while (resultSet.next()) {
			String customerID = resultSet.getString("ID");
			String name = resultSet.getString("Name");
			String username = resultSet.getString("User Name");
			String password = resultSet.getString("Password");
			String emailID = resultSet.getString("EmailID");
			double balance = resultSet.getDouble("Balance");

			customer = new Customer(customerID, name, username, password, emailID, balance);
		}

		return customer;
	}

	public List<Customer> getAllCustomers() throws SQLException, LowBalanceException {
		PreparedStatement query = connection.prepareStatement("Select * from customers");
		ResultSet resultSet = query.executeQuery();

		List<Customer> customers = new ArrayList<Customer>();

		while (resultSet.next()) {
			String customerID = resultSet.getString("ID");
			String name = resultSet.getString("Name");
			String username = resultSet.getString("User Name");
			String password = resultSet.getString("Password");
			String emailID = resultSet.getString("EmailID");
			double balance = resultSet.getDouble("Balance");

			Customer customer = new Customer(customerID, name, username, password, emailID, balance);

			customers.add(customer);
		}

		return customers;
	}

	public Customer getCustomerByUsername(String userName) throws SQLException, LowBalanceException {
		PreparedStatement query = connection.prepareStatement("Select * from customers where `User Name` = ?");
		query.setString(1, userName);

		ResultSet resultSet = query.executeQuery();

		Customer customer = null;

		while (resultSet.next()) {
			String customerID = resultSet.getString("ID");
			String name = resultSet.getString("Name");
			String username = resultSet.getString("User Name");
			String password = resultSet.getString("Password");
			String emailID = resultSet.getString("EmailID");
			double balance = resultSet.getDouble("Balance");

			customer = new Customer(customerID, name, username, password, emailID, balance);
		}

		return customer;
	}

	public void addCustomer(Customer customer) throws SQLException {
		PreparedStatement query = connection.prepareStatement("INSERT INTO customers VALUES(?,?,?,?,?,?)");

		query.setString(1, customer.getCustomerID());
		query.setString(2, customer.getName());
		query.setString(3, customer.getUsername());
		query.setString(4, customer.getPassword());
		query.setString(5, customer.getEmailID());
		query.setDouble(6, customer.getBalance());

		query.executeUpdate();
	}

	public void updateCustomer(Customer customer) {
		try {
			PreparedStatement query = connection.prepareStatement(
					"UPDATE customers SET name=?, `user name`=?, password=?, emailID=?, balance=? WHERE id=?");
			query.setString(1, customer.getName());
			query.setString(2, customer.getUsername());
			query.setString(3, customer.getPassword());
			query.setString(4, customer.getEmailID());
			query.setDouble(5, customer.getBalance());
			query.setString(6, customer.getCustomerID());

			query.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void deleteCustomer(Customer customer) {
		try {
			PreparedStatement query = connection.prepareStatement("DELETE from customers WHERE id=?");
			query.setString(1, customer.getCustomerID());

			query.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Transaction getTransaction(String id) throws SQLException {
		PreparedStatement query = connection.prepareStatement("SELECT * FROM transactions WHERE ID = ?");
		query.setString(1, id);
		ResultSet resultSet = query.executeQuery();

		Transaction transaction = null;

		while (resultSet.next()) {
			String transactionID = resultSet.getString("ID");
			String customerID = resultSet.getString("customerID");
			TransactionType type = TransactionType.valueOf(resultSet.getString("Type"));
			Date date = resultSet.getDate("Date");
			double amount = resultSet.getDouble("Amount");

			transaction = new Transaction(transactionID, customerID, type, date, amount);
		}
		return transaction;
	}

	public List<Transaction> getAllTransactions() throws SQLException {
		PreparedStatement query = connection.prepareStatement("Select * from transactions");
		ResultSet resultSet = query.executeQuery();

		List<Transaction> transactions = new ArrayList<Transaction>();

		while (resultSet.next()) {
			String transactionID = resultSet.getString("ID");
			String customerID = resultSet.getString("customerID");
			TransactionType type = TransactionType.valueOf(resultSet.getString("Type"));
			Date date = resultSet.getDate("Date");
			double amount = resultSet.getDouble("Amount");

			Transaction transaction = new Transaction(transactionID, customerID, type, date, amount);

			transactions.add(transaction);
		}

		return transactions;
	}

	public List<Transaction> getAllTransactions(Customer customer) throws SQLException {
		PreparedStatement query = connection.prepareStatement("Select * from transactions where customerID = ?");
		query.setString(1, customer.getCustomerID());

		ResultSet resultSet = query.executeQuery();

		List<Transaction> transactions = new ArrayList<Transaction>();

		while (resultSet.next()) {
			String transactionID = resultSet.getString("ID");
			String customerID = resultSet.getString("customerID");
			TransactionType type = TransactionType.valueOf(resultSet.getString("Type"));
			Date date = resultSet.getDate("Date");
			double amount = resultSet.getDouble("Amount");

			Transaction transaction = new Transaction(transactionID, customerID, type, date, amount);

			transactions.add(transaction);
		}

		return transactions;
	}

	public void addTransaction(Transaction transaction) throws SQLException {
		PreparedStatement query = connection.prepareStatement("INSERT INTO transactions VALUES(?,?,?,?,?)");

		query.setString(1, transaction.getTransactionID());
		query.setString(2, transaction.getCustomerID());
		query.setString(3, transaction.getType().toString());
		query.setDate(4, transaction.getDate());
		query.setDouble(5, transaction.getAmount());

		query.executeUpdate();
	}

	public void deleteTransaction(Transaction transaction) {
		try {
			PreparedStatement query = connection.prepareStatement("DELETE from transactions WHERE id=?");
			query.setString(1, transaction.getTransactionID());

			query.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void storeTransaction(Transaction transaction, Customer customer) throws TransactionFailedException {

		try {
			connection.setAutoCommit(false);

			addTransaction(transaction);
			updateCustomer(customer);

			connection.commit();
		} catch (Exception exception) {
			try {
				connection.rollback();
				throw new TransactionFailedException();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void registerCustomer(Customer customer) throws TransactionFailedException {

		java.util.Date utilDate = new java.util.Date();
		Date date = new Date(utilDate.getTime());

		Transaction transaction = new Transaction(customer.getCustomerID(), TransactionType.Deposit, date,
				customer.getBalance());

		try {
			connection.setAutoCommit(false);

			addCustomer(customer);
			addTransaction(transaction);

			connection.commit();
		} catch (Exception exception) {
			try {
				connection.rollback();
				throw new TransactionFailedException();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void removeCustomer(Customer customer) {

		List<Transaction> transactions;
		try {
			transactions = getAllTransactions(customer);

			for (Transaction transaction : transactions) {
				deleteTransaction(transaction);
			}

			deleteCustomer(customer);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
