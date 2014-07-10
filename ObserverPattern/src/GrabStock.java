
public class GrabStock {

	public static void main(String[] args) {

		StockGrabber stockGrabber = new StockGrabber();
		
		StockObserver observer1 = new StockObserver(stockGrabber);
		StockObserver observer2 = new StockObserver(stockGrabber);
		
		
	
		
		
		Runnable getIBM = new GetTheStock(stockGrabber, 2, "IBM", 197.00);
		Runnable getAAPL = new GetTheStock(stockGrabber, 2, "AAPL", 677.60);
		Runnable getGOO = new GetTheStock(stockGrabber, 2, "GOO", 676.40);
		
		
		new Thread(getIBM).start();
		new Thread(getAAPL).start();
		new Thread(getGOO).start();
		
		
	}

}
 