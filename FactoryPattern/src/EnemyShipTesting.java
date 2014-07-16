import java.util.Scanner;

public class EnemyShipTesting {
	public static void main(String args[]){
		
		EnemyShip theEnemy = null;
		
		Scanner userInput = new Scanner(System.in);
		String enemyShipOption = "";
		System.out.println("What tyoe of ship? (U/R)");
		if(userInput.hasNextLine()){
			enemyShipOption = userInput.nextLine();
		}
		
		//The way which we don;t use factory pattern
		if(enemyShipOption.equalsIgnoreCase("U")){
			
			theEnemy = new UFOEnemyShip();
		}else{
			
			if(enemyShipOption.equalsIgnoreCase("R")){
				theEnemy = new RocketEnemyShip();
			}
		}
		doStuffEnemy(theEnemy);
	}
	
	
	
	public static void doStuffEnemy(EnemyShip anEnemyShip){
		anEnemyShip.displayEnemyShip();
		anEnemyShip.followHeroShip();
		anEnemyShip.enemyShipShoot();
	}
} 
