/**
 *     Richard Lomax (2022). CIS 505: Intermediate Java Programming. Bellevue University.
 *      Modified by Sindhu Gopal Student 2022
*/

//Design and interface named GenericDao to represent the operations in a data persistence layer. 
import java.util.List;

public interface GenericDao<E,K> {
	List<E> findAll();
	E findBy(K key);
	void insert(E entity);
}
