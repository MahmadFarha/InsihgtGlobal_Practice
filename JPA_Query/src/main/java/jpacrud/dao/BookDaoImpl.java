package jpacrud.dao;

import java.util.List;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jpaapp.emf.JPAUtil;
import jpacrud.entities.Book;
import jakarta.persistence.Query;

public class BookDaoImpl implements BookDao {
	
	private EntityManager entityManager;
	
	public BookDaoImpl() {
		entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
	}

	@Override
	public Book getBookById(int id) {
		Book book = entityManager.find(Book.class, id);
		return book;
	}

	@Override
	public List<Book> getBookByTitle(String title) {
		String qStr = "Select book from Book book where book.title like :ptitle"; //JPQL
		TypedQuery<Book> query = entityManager.createQuery(qStr, Book.class);
		query.setParameter("ptitle", "%" + title + "%");
		return query.getResultList();
	}

	@Override
	public Long getBookCount() {
		String qStr = "Select count(book.id) from Book book"; //JPQL
		TypedQuery<Long> query = entityManager.createQuery(qStr, Long.class);
		Long count = query.getSingleResult();
		return count;
	}

	@Override
	public List<Book> getAuthorBooks(String author) {
		String qStr = "Select book from Book book where book.author = :pAuthor";
		TypedQuery<Book> query = entityManager.createQuery(qStr, Book.class);
		query.setParameter("pAuthor", author);
		return query.getResultList();
	}

	@Override
	public List<Book> getAllBooks() {
		Query query = entityManager.createNamedQuery("getAllBooks"); //named query
		return query.getResultList();
	}

	@Override
	public List<Book> getAllBooksNative() {
		String sql = "Select * from books where price <:price";
		Query nativeQuery = entityManager.createNativeQuery(sql, Book.class);
		nativeQuery.setParameter("price", 100);
		return nativeQuery.getResultList();
	}

	@Override
	public List<Book> getBooksInPriceRange(double low, double high) {
		String qStr = "Select book from Book book where book.price between :low and :high";
		TypedQuery<Book> query = entityManager.createQuery(qStr, Book.class);
		query.setParameter("low", low);
		query.setParameter("high", high);
		return query.getResultList();
	}

}
