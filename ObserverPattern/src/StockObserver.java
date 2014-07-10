
public class StockObserver implements Observer {

	
	private double ibmPrice;
	private double applPrice;
	private double gooPrice;
	
	private static int observerIDTracker = 0;
	
	private int observerID;
	
	private Subject stockGrabber;
	
	public StockObserver(Subject stockGrabber){
		this.stockGrabber = stockGrabber;
		this.observerID = ++ observerIDTracker;
		System.out.println("New Observer "+ this.observerID);
		stockGrabber.register(this);
	}
	
	@Override
	public void update(double ibmPrice, double aaplPrice, double gooPrice) {
		this.applPrice = aaplPrice;
		this.gooPrice = gooPrice;
		this.ibmPrice = ibmPrice;
		
		printThePrices();
	}

	public void printThePrices(){
		System.out.println(observerID + "\nIBM: "+ ibmPrice + "\nAAPL: "+applPrice + "\nGOOG: "+gooPrice +"\n");
	}
}
