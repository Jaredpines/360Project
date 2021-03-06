package Controller;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * This class contains the background music set up of the game
 */
public class Music {

    /**
     * Background music starts with the game, but the player is giving choice to turn it off
     * @throws UnsupportedAudioFileException unsupported file
     * @throws IOException IOException
     * @throws LineUnavailableException  Unavailable
     */
    public void playMusic() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner myScanner = new Scanner(System.in);
        File myFile = new File("Dungeon music.wav");
        AudioInputStream myAudioStream = AudioSystem.getAudioInputStream(myFile);
        Clip myClip = AudioSystem.getClip();
        myClip.open(myAudioStream);
        FloatControl gainControl = (FloatControl) myClip.getControl(FloatControl.Type.MASTER_GAIN);
        myClip.loop(100);
        gainControl.setValue(-15.0f);
        System.out.println("You can turn off music pressing 'S' ");
        System.out.println("Q to exit menu and start game");

        String myResponse = "";

        while (!myResponse.equals("Q")) {
            myResponse = myScanner.next();
            myResponse = myResponse.toUpperCase();
            switch (myResponse) {
                case ("S"):
                    myClip.close();
                case ("Q"):
                    break;

                default:
                    System.out.println("Not a valid response");
            }

        }


    }

}
