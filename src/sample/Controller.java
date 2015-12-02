package sample;

import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.util.ArrayList;

public class Controller {
    @FXML Button pressRecord = new Button();
    @FXML Button pressStop = new Button();
    @FXML Button pressPlay = new Button();

    public void startRecord(ActionEvent actionEvent) {
        RecordAndPlay.recordMovement();
        pressRecord.setVisible(false);
        pressStop.setVisible(true);
        pressPlay.setVisible(false);
        MouseListener.savedMouseState = new ArrayList<>();
    }
    public void startStop(ActionEvent actionEvent) {
        RecordAndPlay.stopMovement();
        pressRecord.setVisible(true);
        pressStop.setVisible(false);
        pressPlay.setVisible(true);
        for(int x = 0; x < MouseListener.mouseState.size()-1; x++) {
            MouseListener.savedMouseState.add(x,MouseListener.mouseState.get(x));
        }
        MouseListener.mouseState = new ArrayList<>();
    }
    public void startPlay(ActionEvent actionEvent) {
        TheRobot.moveMouse();
    }

    public void startSave(ActionEvent actionEvent) {
    }

    public void startOpen(ActionEvent actionEvent) {
    }


}
