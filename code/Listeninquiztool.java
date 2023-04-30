import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Listeninquiztool {
    private static int repetitions = 4;
    private static Scanner inputboi = new Scanner(System.in);
    private static class Music{
        public String composer;
        public String piece_name;
        public int date;
        public String style;
        public String genre;
        public String audiofilename;       
        public int points;
        public Music(){

        }
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("input.txt"));
        Music [] repertoire = new Music[scanner.nextInt()];
        scanner.useDelimiter(";");
        scanner.nextLine();
        for(int i = 0; i < repertoire.length;i++){
            repertoire[i] = new Music();
            repertoire[i].composer = scanner.next();
            repertoire[i].piece_name = scanner.next();
            repertoire[i].date = scanner.nextInt();
            repertoire[i].style = scanner.next();
            repertoire[i].genre = scanner.next();
            repertoire[i].audiofilename = scanner.next();
            repertoire[i].points = 0;
        }
        while(!complete(repertoire)){
            int index = new Random().nextInt(repertoire.length);
            while(repertoire[index].points >= repetitions){
                index = new Random().nextInt(repertoire.length);
            }
            playAudioClip(repertoire[index]);
        }
        System.out.println("Complete!");
    }
    public static boolean complete(Music [] rep){
        int sum = 0;
        for(int i = 0; i < rep.length; i++){
            sum+= rep[i].points;
        }
        System.out.println(sum);
        return sum >= rep.length * repetitions;
    }
    public static void playAudioClip(Music music) {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(music.audiofilename));
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.setMicrosecondPosition(new Random().nextLong(clip.getMicrosecondLength()));
            System.out.println("Enter P to begin");
            String response = "";
            while(!response.toUpperCase().equals("P")){
                response = inputboi.nextLine();
            }
            clip.start();
            Thread.sleep(30000);
            clip.stop();
            clip.close();
            audioInputStream.close();
            System.out.println("input info. enter anything upon completion");
            inputboi.nextLine();
            System.out.println("Composer: " + music.composer);
            System.out.println("Name of piece: " + music.piece_name);
            System.out.println("Time:" + music.date + "s");
            System.out.println("genre: " + music.genre);
            System.out.println("style:" + music.style);
            System.out.println("enter 1 if you did do well. otherwise, write anything other int");
            int decision = inputboi.nextInt();
            if(decision == 1){
                music.points++;
            }
            for(int i = 0; i < 100; i++){
                System.out.println();
            }
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e) {
            e.printStackTrace();
        }
       
    }
}


