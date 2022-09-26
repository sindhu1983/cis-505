/**
 *     Richard Lomax (2022). CIS 505: Intermediate Java Programming. Bellevue University.
 *      Modified by Sindhu Gopal Student 2022
*/ 

//a class named ProductDB to represent the bowling shops database.
public class ProductDB {
	
	//A public static method named getProducts with string argument named 
	//code and a return type of a product generic queue 
	public static GenericQueue<Product> getProducts(String code) {
		if (code.equalsIgnoreCase("b")) {
			
			//arguments that equal “b” create five (5) new ball instances
			GenericQueue<Product> balls = new GenericQueue<Product>();
			
			//set data fields code,description,price and color with values
			//add them to a product generic queue named balls
			Ball ball = new Ball();
			ball.setCode("B100");
			ball.setDescription("Black widow 2.0");
			ball.setPrice(144.95);
			ball.setColor("Black and Red");
			balls.enqueue(ball);
			
			//set data fields code,description,price and color with values
			//add them to a product generic queue named balls
			Ball ball2 = new Ball();
			ball2.setCode("B200");
			ball2.setDescription("Axiom Pearl");
			ball2.setPrice(154.95);
			ball2.setColor("Blue and Red");
			balls.enqueue(ball2);
			
			//set data fields code,description,price and color with values
			//add them to a product generic queue named balls
			Ball ball3 = new Ball();
			ball3.setCode("B300");
			ball3.setDescription("Proton Physix");
			ball3.setPrice(174.95);
			ball3.setColor("Pink and Purple");
			balls.enqueue(ball3);
			
			//set data fields code,description,price and color with values
			//add them to a product generic queue named balls
			Ball ball4 = new Ball();
			ball4.setCode("B400");
			ball4.setDescription("Force Unleashed");
			ball4.setPrice(139.99);
			ball4.setColor("Red and White");
			balls.enqueue(ball4);
			
			//set data fields code,description,price and color with values
			//add them to a product generic queue named balls
			Ball ball5 = new Ball();
			ball5.setCode("B500");
			ball5.setDescription("Phase III");
			ball5.setPrice(154.99);
			ball5.setColor("Purple and Green");
			balls.enqueue(ball5);
			return balls;
		} else if (code.equalsIgnoreCase("s")) {
			
			//arguments that equal “s” create five (5) new shoe instances
			GenericQueue<Product> shoes = new GenericQueue<Product>();
			
			//set data fields code,description,price and color with values
			//add them to a product generic queue named shoe
			Shoe shoe = new Shoe();
			shoe.setCode("S100");
			shoe.setDescription("Men's Ram Black");
			shoe.setPrice(39.99);
			shoe.setSize(10.5);
			shoes.enqueue(shoe);
			
			//set data fields code,description,price and color with values
			//add them to a product generic queue named shoe
			Shoe shoe2 = new Shoe();
			shoe2.setCode("S200");
			shoe2.setDescription("Women's Rise Black/Hot Pink");
			shoe2.setPrice(39.99);
			shoe2.setSize(7.0);
			shoes.enqueue(shoe2);
			
			//set data fields code,description,price and color with values
			//add them to a product generic queue named shoe
			Shoe shoe3 = new Shoe();
			shoe3.setCode("S300");
			shoe3.setDescription("Women's Path Lite Seamless Mesh");
			shoe3.setPrice(54.99);
			shoe3.setSize(6.0);
			shoes.enqueue(shoe3);
			
			//set data fields code,description,price and color with values
			//add them to a product generic queue named shoe
			Shoe shoe4 = new Shoe();
			shoe4.setCode("S400");
			shoe4.setDescription("Men's Tribal White");
			shoe4.setPrice(26.99);
			shoe4.setSize(8.5);
			shoes.enqueue(shoe4);
			
			//set data fields code,description,price and color with values
			//add them to a product generic queue named shoe
			Shoe shoe5 = new Shoe();
			shoe5.setCode("S500");
			shoe5.setDescription("Youth Skull Green/Black");
			shoe5.setPrice(39.99);
			shoe5.setSize(3.0);
			shoes.enqueue(shoe5);
			return shoes;
			
		} else if (code.equalsIgnoreCase("a")) {
			
			//arguments that equal “a’ create three (3) new shoe instances
			GenericQueue<Product> bags = new GenericQueue<Product>();
			
			//set data fields code,description,price and color with values
			//add them to a product generic queue named bag
			Bag bag = new Bag();
			bag.setCode("A100");
			bag.setDescription("Path Pro Deluxe");
			bag.setPrice(34.99);
			bag.setType("Single");
			bags.enqueue(bag);
			
			//set data fields code,description,price and color with values
			//add them to a product generic queue named bag
			Bag bag2 = new Bag();
			bag2.setCode("A200");
			bag2.setDescription("Prime Roller Black/Royal Blue");
			bag2.setPrice(54.99);
			bag2.setType("Double");
			bags.enqueue(bag2);
			
			//set data fields code,description,price and color with values
			//add them to a product generic queue named bag
			Bag bag3 = new Bag();
			bag3.setCode("A300");
			bag3.setDescription("Silver/Royal Blue");
			bag3.setPrice(74.99);
			bag3.setType("Triple");
			bags.enqueue(bag3);
			return bags;
		} else {
			
			//For all other arguments, return an empty product generic queue.
			return new GenericQueue<Product>();
		}
	}
}
