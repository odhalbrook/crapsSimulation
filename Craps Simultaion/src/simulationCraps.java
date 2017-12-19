import java.util.Scanner;

public class simulationCraps
	{

		public static void main(String[] args)
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("What is your name?");
				String name = userInput.nextLine();
				System.out.println("Hello, " + name + "!");
				
				try
					{
						Thread.sleep(700);
					} catch (InterruptedException e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

						System.out.println("Let's play craps");
						
						try
							{
								Thread.sleep(1000);
							} catch (InterruptedException e)
							{
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						
						boolean stillGuessing = false;
						
						int balance = 1000;
						
						int dieRoll1 = (int)(Math.random()*6) + 1;
						
						int dieRoll2 = (int)(Math.random()*6) + 1;
						
						int totalDice = dieRoll1 + dieRoll2;
						
						if(totalDice == 12 || totalDice == 2)
							{
								System.out.println("Sorry " + name + " , you rolled a " + dieRoll1 + " and a " + dieRoll2 + " which equals " + totalDice + ", you lose"); 
							}
						
							else if(totalDice == 7 || totalDice == 11)
								{
									System.out.println("Congratulations " + name + ", you rolled " + dieRoll1 + " and a " + dieRoll2 + " which equals " + totalDice + ", you win!");
								}
							
							else
								{
									System.out.println(name + " you rolled " + dieRoll1 + " and a " + dieRoll2 + " which equals " + totalDice + ", now we move on to round two, your point is " + totalDice);	
									stillGuessing = true;
								}
						
						try
							{
								Thread.sleep(1000);
							} catch (InterruptedException e)
							{
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						
						int totalDice2 = totalDice;
						
						while(stillGuessing)
							{
							
								int dieRoll3 = (int)(Math.random()*6) + 1;
								
								int dieRoll4 = (int)(Math.random()*6) + 1;
								
								
								
							if(dieRoll3 + dieRoll4 == totalDice2)
								{
									System.out.println("Congratulations " + name + ", you rolled " + dieRoll3 + " and a " + dieRoll4 + " which equals your point, " + totalDice2 + ", you win!");
									stillGuessing = false;
								}
							
							else if (dieRoll3 + dieRoll4 == 7)
								{
									System.out.println("Sorry " + name + " , you rolled a " + dieRoll3 + " and a " + dieRoll4 + " which equals 7, you lose");
									stillGuessing = false;
								}
							
							else
								{
									System.out.println("Your numbers are " + dieRoll3 + " and " + dieRoll4 + " Roll Again");
								}
							
							try
								{
									Thread.sleep(1000);
								} catch (InterruptedException e)
								{
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							
							}
						
			}

	}
