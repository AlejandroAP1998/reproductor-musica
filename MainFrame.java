import java.awt.event.*;
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

    MainFrame() {
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setSize(740,160);

        play = new JButton("play");
        pause = new JButton("pause");
        stop = new JButton("stop");
        next = new JButton("next");
        previous = new JButton("previous");
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

        int buttonDim = 80;
        int buttonWidth = 120;
        int spaceBetweenButton = 10;


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



        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
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
