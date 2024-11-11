package String;
import java.io.File;
import java.util.Scanner;
import javax.sound.sampled.*;

public class SmartLock {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the password!!");
        String password = sc.next();
        
        String original = "Amith071623";

        if (password.equals(original)) {
            System.out.println("Door Unlocked!!");
        } else {
            System.out.println("You are not the owner!! Please Be Aware!!");
            
            playAlertSound("C:\\Users\\Windows\\Downloads\\file_example_WAV_5MG.wav");
         }
        
    }

    public static void playAlertSound(String soundFilePath) {
        try {
            // Get the sound file
            File soundFile = new File(soundFilePath);

            // Open an audio input stream from the file
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundFile);

            // Get a clip to play the audio
            Clip clip = AudioSystem.getClip();

            // Open the clip
            clip.open(audioInputStream);

            // Start playing the sound
            clip.start();

            // Wait for the sound to finish playing
            while (!clip.isRunning()) {
                Thread.sleep(10);
            }
            while (clip.isRunning()) {
                Thread.sleep(10);
            }

            // Close the clip
            clip.close();
        } catch (Exception e) {
            System.out.println("Error playing alert sound: " + e.getMessage());
        }
    }

}