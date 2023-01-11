import java.awt.event.*;
import java.awt.Image;
import java.io.File;
import javax.swing.*;

public class MainFrame extends JFrame implements ActionListener {

    JButton play;
    JButton pause;
    JButton stop;
    JButton next;
    JButton previous;
    JButton openSong;
    JButton openList;

    private static ImageIcon resizeIcon(ImageIcon icon, int resizedWidth, int resizedHeight) {
        Image img = icon.getImage();  
        Image resizedImage = img.getScaledInstance(resizedWidth, resizedHeight,  java.awt.Image.SCALE_SMOOTH);  
        return new ImageIcon(resizedImage);
    }

    MainFrame() {
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setSize(740,160);

        // Initialize buttons and add listeners
        play = new JButton();
        pause = new JButton();
        stop = new JButton();
        next = new JButton();
        previous = new JButton();
        openSong = new JButton("open song");
        openList = new JButton("open list");

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
        previous.setBounds(0*(spaceBetweenButton+buttonDim), 0, buttonDim, buttonDim);
        previous.setFocusable(false);
        this.add(previous);

        stop.setBounds(1*(spaceBetweenButton+buttonDim), 0, buttonDim, buttonDim);
        stop.setFocusable(false);
        this.add(stop);

        pause.setBounds(2*(spaceBetweenButton+buttonDim), 0, buttonDim, buttonDim);
        pause.setFocusable(false);
        this.add(pause);

        play.setBounds(3*(spaceBetweenButton+buttonDim), 0, buttonDim, buttonDim);
        play.setFocusable(false);
        this.add(play);

        next.setBounds(4*(spaceBetweenButton+buttonDim), 0, buttonDim, buttonDim);
        next.setFocusable(false);
        this.add(next);

        openSong.setBounds(5*(spaceBetweenButton+buttonDim), 0, buttonWidth, buttonDim);
        openSong.setFocusable(false);
        this.add(openSong);

        openList.setBounds(5*(spaceBetweenButton+buttonDim)+spaceBetweenButton+buttonWidth, 0, buttonWidth, buttonDim);
        openList.setFocusable(false);
        this.add(openList);


        // Make everything visible
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Actions to perform when each button gets pressed.
        if(e.getSource() == play){

        }
        else if(e.getSource() == pause){
            
        }
        else if(e.getSource() == stop){
            
        }
        else if(e.getSource() == next){
            
        }
        else if(e.getSource() == previous){
            
        }
        else if(e.getSource() == previous){
            
        }
        else if(e.getSource() == previous){
            
        }
    }
    
}
