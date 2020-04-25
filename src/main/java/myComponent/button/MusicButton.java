package myComponent.button;

import javazoom.spi.mpeg.sampled.file.tag.MP3MetadataParser;
import utils.Mp3Player;

import javax.swing.*;
import java.awt.*;

public class MusicButton extends JButton {
    private Mp3Player mp3Player;
    public MusicButton(String pathname,String text){
        super();
        mp3Player=new Mp3Player(pathname);
        this.setForeground(Color.black);
        this.setBackground(Color.WHITE);
        this.setContentAreaFilled(false);
        this.setFocusPainted(false);
        this.setBorderPainted(false);
        this.setText("<html><body><p>"+text+"<br/>BGM</p></body></html>");
        playListener();
    }
    private void playListener(){
        this.addActionListener(e -> {
            mp3Player.start();
            this.removeActionListener(this.getActionListeners()[0]);
            interruptListener();
        });
    }
    private void interruptListener(){
        this.addActionListener(e -> {
            mp3Player.interrupt();
            this.removeActionListener(this.getActionListeners()[0]);
            playListener();
        });

    }
}
