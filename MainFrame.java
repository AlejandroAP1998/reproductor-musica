import java.awt.event.*;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.Clip;
import javax.swing.*;
import javafx.embed.swing.*;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.net.URI;
import java.util.ArrayList;

public class MainFrame extends JFrame implements ActionListener {

    JButton play;
    JButton pause;
    JButton stop;
    JButton next;
    JButton previous;
    JButton openSong;
    JButton openList;
    JButton addToList;
    JButton saveList;
    boolean playing;
    File file;
    Media song;
    MediaPlayer songPlayer;
    boolean songLoaded;
    Clip clip;
    ArrayList<String> playlist;

    static{
        new JFXPanel();
    }

    private static ImageIcon resizeIcon(ImageIcon icon, int resizedWidth, int resizedHeight) {
        Image img = icon.getImage();  
        Image resizedImage = img.getScaledInstance(resizedWidth, resizedHeight,  java.awt.Image.SCALE_SMOOTH);  
        return new ImageIcon(resizedImage);
    }

    MainFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,160);

        // Initialize buttons and add listeners
        play = new JButton();
        pause = new JButton();
        stop = new JButton();
        next = new JButton();
        previous = new JButton();
        openSong = new JButton("open song");
        openList = new JButton("open list");
        addToList = new JButton("add to list");
        saveList = new JButton("save list");

        play.addActionListener(this);
        pause.addActionListener(this);
        stop.addActionListener(this);
        next.addActionListener(this);
        previous.addActionListener(this);
        openSong.addActionListener(this);
        openList.addActionListener(this);

        this.setLayout(null);

        // Button dimensions
        int buttonDim = 80; // Height and also width of square buttons
        int buttonWidth = 120; // Width of non square buttons
        int spaceBetweenButton = 10; // Space left between two buttons

        
        // Add icons to their respective buttons
        try {
            ImageIcon playIcon = new ImageIcon("resources/play.png");
            playIcon = resizeIcon(playIcon, buttonDim-30, buttonDim-30);
            play.setIcon(playIcon);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        try {
            ImageIcon pauseIcon = new ImageIcon("resources/pause.png");
            pauseIcon = resizeIcon(pauseIcon, buttonDim-30, buttonDim-30);
            pause.setIcon(pauseIcon);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        try {
            ImageIcon stopIcon = new ImageIcon("resources/stop.png");
            stopIcon = resizeIcon(stopIcon, buttonDim-30, buttonDim-30);
            stop.setIcon(stopIcon);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        try {
            ImageIcon nextIcon = new ImageIcon("resources/next.png");
            nextIcon = resizeIcon(nextIcon, buttonDim-30, buttonDim-30);
            next.setIcon(nextIcon);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        try {
            ImageIcon previousIcon = new ImageIcon("resources/previous.png");
            previousIcon = resizeIcon(previousIcon, buttonDim-30, buttonDim-30);
            previous.setIcon(previousIcon);
        } catch (Exception ex) {
            System.out.println(ex);
        }

        // Place each button inside the JFrame
        previous.setBounds(spaceBetweenButton + 0*(spaceBetweenButton+buttonDim), 0, buttonDim, buttonDim);
        previous.setFocusable(false);
        this.add(previous);

        stop.setBounds(spaceBetweenButton + 1*(spaceBetweenButton+buttonDim), 0, buttonDim, buttonDim);
        stop.setFocusable(false);
        this.add(stop);

        pause.setBounds(spaceBetweenButton + 2*(spaceBetweenButton+buttonDim), 0, buttonDim, buttonDim);
        pause.setFocusable(false);
        this.add(pause);

        play.setBounds(spaceBetweenButton + 3*(spaceBetweenButton+buttonDim), 0, buttonDim, buttonDim);
        play.setFocusable(false);
        this.add(play);

        next.setBounds(spaceBetweenButton + 4*(spaceBetweenButton+buttonDim), 0, buttonDim, buttonDim);
        next.setFocusable(false);
        this.add(next);

        openSong.setBounds(spaceBetweenButton + 5*(spaceBetweenButton+buttonDim), 0, buttonWidth, buttonDim);
        openSong.setFocusable(false);
        this.add(openSong);

        addToList.setBounds(spaceBetweenButton + 5*(spaceBetweenButton+buttonDim)+1*(spaceBetweenButton+buttonWidth), 0, buttonWidth, buttonDim);
        addToList.setFocusable(false);
        this.add(addToList);

        saveList.setBounds(spaceBetweenButton + 5*(spaceBetweenButton+buttonDim)+2*(spaceBetweenButton+buttonWidth), 0, buttonWidth, buttonDim);
        saveList.setFocusable(false);
        this.add(saveList);

        openList.setBounds(spaceBetweenButton + 5*(spaceBetweenButton+buttonDim)+3*(spaceBetweenButton+buttonWidth), 0, buttonWidth, buttonDim);
        openList.setFocusable(false);
        this.add(openList);


        // Make everything visible
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Actions to perform when each button gets pressed.
        if(e.getSource() == play){
            if (songLoaded && !playing) {
                songPlayer.play();
                playing = true;
            }

        }
        else if(e.getSource() == pause){
            if (songLoaded && playing) {
                songPlayer.pause();
                playing = false;
            }
        }
        else if(e.getSource() == stop){
            if (songLoaded) {
                songPlayer.stop();
                playing = false;
            }
        }
        else if(e.getSource() == next){
            
        }
        else if(e.getSource() == previous){
            
        }
        else if(e.getSource() == openSong){
            JFileChooser fileChooser = new JFileChooser();
            int resp = fileChooser.showOpenDialog(null);

            if (resp == JFileChooser.APPROVE_OPTION) {
                String path = fileChooser.getSelectedFile().getAbsolutePath();
                file = new File(path);
                URI uri = file.toURI();
                try {
                    song = new Media(uri.toString());
                    songPlayer = new MediaPlayer(song);
                    songLoaded = true;
                } catch (Exception e1) {
                    System.out.println(e1);
                }
            }
        }
        else if(e.getSource() == openList){
            
        }
    }
    
}
