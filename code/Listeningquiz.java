import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;
import java.util.Scanner;


public class Listeningquiz {
	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException{
		Scanner inputscanner = new Scanner(System.in);
	
		System.out.println("Enter folder location for file input.txt (include / at end).");
		String location = inputscanner.nextLine();
		File inputfile = new File(location + "input.txt");
		Scanner filescanner = new Scanner(inputfile);
		int size = filescanner.nextInt();
		String [] repertoire = new String[size];
		filescanner.nextLine();
		int ij = 0;
		while(filescanner.hasNext()){
			repertoire[ij] = filescanner.nextLine();
			ij++;
		}
		Music [] repertoirestuff = new Music[repertoire.length];
		populate(repertoirestuff,repertoire);

		System.out.println("Would you like a random song: yes or no?");
		String response = inputscanner.nextLine();
		response = response.toUpperCase();
		
		int choice = 0;
		
		filescanner.close();
		if(response.equals("YES")){
		choice = (int)(Math.random() * (repertoire.length));
		}
		else{
			System.out.println("Choose a song between 0 and " + (repertoire.length - 1));
			choice = Integer.parseInt(inputscanner.nextLine());
		}
		int randomtime = convert(repertoirestuff[choice].length());
		double randompercent = (double)(Math.random());
		int choosetime = (int)(randompercent * randomtime);
		File file = new File(location +  repertoirestuff[choice].getaudiofile());
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
		Clip clip = AudioSystem.getClip();
		clip.open(audioStream);
		
		
		System.out.println("To play piece in random position, type P, press enter, type R then press enter.");
		while(!response.equals("Q")) {
			System.out.println("P = play");
			System.out.println("S = Stop");
			System.out.println("R = Random Position");
			System.out.println("Q = Quit");
			System.out.print("Enter your choice: ");
			
			response = inputscanner.nextLine();
			response = response.toUpperCase();
			
			switch(response) {
				case ("P"): clip.start();
				break;
				case ("S"): clip.stop();
				break;
				case ("R"): clip.setMicrosecondPosition(choosetime);
				break;
				case ("Q"): clip.close();
				break;
				default: System.out.println("Not a valid response");
			}
		 }
		 quiztime(repertoirestuff[choice]);
		inputscanner.close();
		 }
	
	private static void quiztime(Music repertoirestuff) {
		String responsevariable = "";
		Scanner scanner = new Scanner(System.in);
	while(!responsevariable.equals("NO")){
		System.out.println("Composer");
		responsevariable = scanner.nextLine();
		System.out.println("Answer is: " + repertoirestuff.getCompser());
		System.out.println("You answered: " + responsevariable);
		System.out.println("Would you like to try again: yes or no?");
		responsevariable = scanner.nextLine();
		responsevariable = responsevariable.toUpperCase();
		if(responsevariable.equals("YES")){
			clearterminal();
		}
	}
	responsevariable = "";
	while(!responsevariable.equals("NO")){
		System.out.println("Name of piece:");
		responsevariable = scanner.nextLine();
		System.out.println("Answer is: " + repertoirestuff.getName());
		System.out.println("You answered: " + responsevariable);
		System.out.println("Would you like to try again: yes or no?");
		responsevariable = scanner.nextLine();
		responsevariable = responsevariable.toUpperCase();
		if(responsevariable.equals("YES")){
			clearterminal();
		}
	}
	responsevariable = "";
	while(!responsevariable.equals("NO")){
		System.out.println("time period:");
		responsevariable = scanner.nextLine();
		System.out.println("Answer is: " + repertoirestuff.getperiod());
		System.out.println("You answered: " + responsevariable);
		System.out.println("Would you like to try again: yes or no?");
		responsevariable = scanner.nextLine();
		responsevariable = responsevariable.toUpperCase();
		if(responsevariable.equals("YES")){
			clearterminal();
		}
	}
	responsevariable = "";
	while(!responsevariable.equals("NO")){
		System.out.println("Year:");
		responsevariable = scanner.nextLine();
		System.out.println("Answer is: " + repertoirestuff.getyear());
		System.out.println("You answered: " + responsevariable);
		System.out.println("Would you like to try again: yes or no?");
		responsevariable = scanner.nextLine();
		responsevariable = responsevariable.toUpperCase();
		if(responsevariable.equals("YES")){
			clearterminal();
		}
	}
	responsevariable = "";
	while(!responsevariable.equals("NO")){
		System.out.println("What type of piece is this?");
		responsevariable = scanner.nextLine();
		System.out.println("Answer is: " + repertoirestuff.gettype());
		System.out.println("You answered: " + responsevariable);
		System.out.println("Would you like to try again: yes or no?");
		responsevariable = scanner.nextLine();
		responsevariable = responsevariable.toUpperCase();
		if(responsevariable.equals("YES")){
			clearterminal();
		}
	}
	System.out.println("type anything to exit program");
	responsevariable = scanner.nextLine();
	responsevariable = responsevariable.toUpperCase();
	scanner.close();
	
	}


	private static void clearterminal() {
		for (int i = 0; i < 50; i ++){
			System.out.println();
		}
	}


	public static void populate(Music [] meow, String [] repertoire){
	for (int i = 0; i < meow.length; i++){
		meow[i] = new Music (repertoire[i]);
	}
	
	}

	public static int convert(String tom){
        int time = tom.indexOf("min");
        int minute = Integer.parseInt(tom.substring(time+3,time+5));
        time = tom.indexOf("sec");
        int second = Integer.parseInt(tom.substring(time+3,time+5));
	minute = minute * 60;
	int micro = minute + second;
	micro *= 1000000;
	return micro;

	}
	}