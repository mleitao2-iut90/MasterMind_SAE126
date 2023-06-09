package control;

import boardifier.model.GameException;
import boardifier.view.RootPane;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class MasterMindControllerButton implements EventHandler<ActionEvent> {
    RootPane rootPane;
    public MasterMindControllerButton(RootPane rootPane) {
        this.rootPane = rootPane;
    }
    @Override
    public void handle(ActionEvent event) {
        if(event.getSource() == rootPane.getButtonStart()){
            try {
                rootPane.getController().startGame();
            }
            catch(GameException err) {
                System.err.println(err.getMessage());
                System.exit(1);
            }
        }
    }
}
