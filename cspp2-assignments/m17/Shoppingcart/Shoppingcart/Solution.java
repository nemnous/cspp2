class Item {
	private String product;
	private int quantity;
	private float unitprice;
	private boolean inCatlog = false;
	Item (String product, int quantity, int unitprice) {
		this.product = product;
		this.quantity = quantity;
		this.unitprice = unitprice;
	}

	public String getproduct() {
		return product;
	}

	public void setproduct(String product) {
		this.product = product;
	}

	public void setquantity() {
		this.quantity = quantity;
	}

	public int getquantity() {
		return quantity;
	}


	public float getunitprice() {
		return unitprice;
	}

	public void setunitprice() {
		this.unitprice = unitprice;
	}

	String toString() {
		if(inCatalog) {
			return product + " " + quantity + " " + unitprice;
		}
		return product + " " + quantity;
	}
}

class ShoppingCart {
	private ArrayList<Item> Catalog;
	private ArrayList<Item> Cart;

	String[] coupons = {"IND10", "IND20", "IND30", "IND50"};

	ShoppingCart() {
		Catalog = new ArrayList<>();
		Cart = new ArrayList<>();
	}

	void addToCatalog(Item item) {
		Catalog.add(item);
	}

	void addToCart(Item item) {
		Cart.add(item);
	}

	void removeFromCart(Item item) {
		Cart.remove(item);
	}
	void showCart() {
		for(Item i : Cart) {
			System.out.println(i.getproduct + Integer.toString(quantity));
		}
	}
	void showCatalog() {
		for(Item i : Catalog) {
			System.out.println(i);
		}
	}
	double getTotalAmount() {
		double sum = 0;
		for(Item i : Cart) {
			sum += i.getquantity*i.getunitprice;
		}
	}
	float applyCoupon() {
		
	}
	double getPayableAmount() {
		double sum = getTotalAmount();

	}
}


class Solution {
	public static void main(String[] args) {
		ShoppingCart shoppingcart = new ShoppingCart();
		Scanner scan = new Scanner(System.in);
		int testcases  = scan.nextInt();
		for(int i = 0; i < testcases; i++) {
			String[] tokens = scan.nextLine().split(" ");
			
		}
	}
}