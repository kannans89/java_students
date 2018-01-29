package com.techlabs.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.techlabs.dao.BookStoreDao;
import com.techlabs.models.Book;

public class BookService {

	public BookStoreDao dao = BookStoreDao.getInstance();
	public Connection con = (Connection) dao.getConnection();
	List<Book> list = new ArrayList<Book>();

	public List<Book> getList() {
		PreparedStatement ps;
		ResultSet rs = null;
		try {
			ps = (PreparedStatement) con
					.prepareStatement("select * from bookstore ");
			rs = ps.executeQuery();

			while (rs.next()) {
				Book book = new Book();
				book.setISBN(rs.getInt(1));
				book.setTitle(rs.getString(2));
				book.setImage(rs.getString(3));
				book.setAuthor(rs.getString(4));
				book.setDescription(rs.getString(5));
				book.setPrice(rs.getDouble(6));
				list.add(book);

				System.out.println(rs.getInt(1) + "  " + rs.getString(2));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	public void addStudent(Book book) {
		PreparedStatement ps;
		ResultSet rs = null;
		try {
			ps = (PreparedStatement) con
					.prepareStatement("insert into bookstore(title,image,author,description,price) "
							+ "values(?,?,?,?,?)");
			ps.setString(1, book.getTitle());
			ps.setString(2, book.getImage());
			ps.setString(3, book.getAuthor());
			ps.setString(4, book.getDescription());
			ps.setDouble(5, book.getPrice());

			ps.execute();

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public Book getStudent(int isbn) {
		PreparedStatement ps;
		ResultSet rs = null;
		Book book = new Book();
		try {
			ps = (PreparedStatement) con
					.prepareStatement("select * from bookstore where isbn=" + isbn);
			rs = ps.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  "
						+ rs.getString(3) + " " + rs.getString(4) + " "
						+ rs.getString(5));
				book.setISBN(rs.getInt(1));
				book.setTitle(rs.getString(2));
				book.setImage(rs.getString(3));
				book.setAuthor(rs.getString(4));
				book.setDescription(rs.getString(5));
				book.setPrice(rs.getDouble(6));

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return book;
	}

	public void editStudent(Book book) {
		PreparedStatement ps;

		try {
			ps = (PreparedStatement) con
					.prepareStatement("UPDATE bookstore SET title=?,image=?,"
							+ "author=?,description=?,price=? where isbn=?");
			ps.setInt(6, book.getISBN());
			ps.setString(1, book.getTitle());
			ps.setString(2, book.getImage());
			ps.setString(3, book.getAuthor());
			ps.setString(4, book.getDescription());
			ps.setDouble(5, book.getPrice());

			ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void deleteStudent(int isbn) {
		PreparedStatement ps;
				try {
			ps = (PreparedStatement) con
					.prepareStatement("delete from bookstore where isbn = ?");
			ps.setInt(1, isbn);

			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
