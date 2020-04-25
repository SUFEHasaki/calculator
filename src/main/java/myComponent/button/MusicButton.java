package myComponent.button;

import utils.Mp3Player;

import javax.swing.*;

public class MusicButton extends JButton {
    private Mp3Player mp3Player;
    public MusicButton(String pathname){
        mp3Player=new Mp3Player(pathname);
        this.addActionListener(e -> {
            mp3Player.start();
        });
    }
}
