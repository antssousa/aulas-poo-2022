import java.util.List;

// CRUD - CREATE, READ, UPDATE, DELETE
public interface GenericDAO<E> {
	// C - CREATE
	public void insert(E e);

	// R - READ
	public E select(long id);

	public List<E> select();

	// U - UPDATE
	public void update(E e);

	// D - DELETE
	public void delete(E e);

}
