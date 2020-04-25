package utils;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import lombok.SneakyThrows;

import java.io.File;
import java.io.FileInputStream;

public class Mp3Player implements Runnable {
    private String pathname;
    private Thread t;
    public Mp3Player(String pathname){
        this.pathname=pathname;
    }
    public void run(){
        loop();
    }
    public void start(){
            if(t==null)
            {
                t=new Thread(this);
                t.start();
            }
    }
    @SneakyThrows
    private void loop() {
        File file=new File(pathname);
        FileInputStream stream=new FileInputStream(file);
        Player player=new Player(stream);
        player.play();
        loop();
    }
}
