/**
 *     Richard Lomax (2022). CIS 505: Intermediate Java Programming. Bellevue University.
 *      Modified by Sindhu Gopal Student 2022
*/

//Design a class named MemComposerDao to represent the operations in a composer data persistence layer
import java.util.ArrayList;
import java.util.List;

public class MemComposerDao implements ComposerDao{
	
	
	private static final String CLASSICAL = "Classical";
	
	//A private List<Composer> data field named composers
	//The default is a list of composer objects. 	
	private List<Composer> composers = new ArrayList<>();
	
	// A no-argument constructor that creates a default list of five composer objects.
	MemComposerDao() {
		composers.add(new Composer(1007, "Ludwig Van Beethoven", CLASSICAL));
		composers.add(new Composer(1008, "Johann Sebastian Bach", CLASSICAL));
		composers.add(new Composer(1009, "Wolfgang Amadeus Mozart", CLASSICAL));
		composers.add(new Composer(1010, "Johannes Brahms", CLASSICAL));
		composers.add(new Composer(1011, "Joseph Haydn", CLASSICAL));
	}
	
	//An overridden findAll method that returns a list of composer objects.
	@Override
	public List<Composer> findAll() {
		return composers;
	}

	//An overridden findBy method that returns a single composer object matching the arguments id. 
	@Override
	public Composer findBy(Integer key) {
		for (Composer composer : composers) {
			if (composer.getId()!=null && composer.getId().equals(key) ) {
				return composer;
			}
		}
		return null;
	}

	//An overridden insert method that adds a new composer object to the list of composers.
	@Override
	public void insert(Composer entity) {
		composers.add(entity);
	}
}
