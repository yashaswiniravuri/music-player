/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.io.*;
import java.util.*;
import javax.sound.sampled.*;
/**
 *
 * @author ADMIN
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public Clip play(AudioInputStream as) throws LineUnavailableException, IOException{
        Scanner in=new Scanner(System.in);
        Clip clip=AudioSystem.getClip();
        clip.open(as);
        System.out.println("If u want to play the current song in a loop...type 'yes'");
        String yes=in.next();
        if(yes.equals("yes")){
            clip.loop(-1);
        }
        else{
            clip.loop(0);
        }
        clip.start();
        return clip;
    }
    public static AudioInputStream display() throws UnsupportedAudioFileException, IOException{
        Scanner in = new Scanner(System.in);
        File path = new File("C:\\Users\\ADMIN\\OneDrive\\Documents\\Playlist");
        File filelist[]=path.listFiles();
        System.out.println("List of songs:");
        int i=0;
        for(File file:filelist){
            i=i+1;
            System.out.println(i+": "+file.getName());
        }
        System.out.println("Enter the song number");
        i=in.nextInt();
        File songFile= new File(filelist[i-1].getAbsolutePath());
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(songFile);
        return audioStream;
    }
    public static void main(String[] args) throws UnsupportedAudioFileException, LineUnavailableException, IOException{
        // TODO code application logic here
        Main play = new Main();
        Scanner sc=new Scanner(System.in);
        AudioInputStream aus=display();
        Clip clip = AudioSystem.getClip();
        clip=play.play(aus);
        System.out.println("Select an option to perform the below operations:");
        int response=-1;
        while(response!=6){
            System.out.println("1. Pause\n2. Resume\n3. Restart the current song\n4. play another song\n59. exit");
            System.out.println("Enter your choice:");
            response=sc.nextInt();            
            switch(response){
                case (1):
                    clip.stop();
                    break;
                    
                case (2):
                    clip.start();
                    break;
                    
                case (3):
                    clip.setMicrosecondPosition(0);
                    break;
                    
                case (4):
                    clip.close();
                    aus=display();
                    clip=AudioSystem.getClip();
                    clip=play.play(aus);
                    break;
                    
                case(5):
                    clip.close();
                    break;
                    
                default:
                    System.out.println("Not a valid response");
                
            }
        }
        System.out.println("Byeeee!");
    }
    
}
