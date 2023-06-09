package view;

import boardifier.model.GameStageModel;
import boardifier.view.ButtonLook;
import boardifier.view.GameStageView;
import boardifier.view.TextLook;
import model.MasterMindStageModel;

public class MasterMindStageView extends GameStageView {
    public MasterMindStageView(String name, GameStageModel gameStageModel) {
        super(name, gameStageModel);
        width = 650;
        height = 550;
    }

    /**
     * Create the looks of the stage
     */
    @Override
    public void createLooks() {
        MasterMindStageModel model = (MasterMindStageModel)gameStageModel;

        addLook(new MasterMindBoardLook(670, model.getBoard()));
        addLook(new PawnPotLook(140,670,model.getBlackPot()));
        addLook(new PawnPotLook(140,670,model.getRedPot()));
        addLook(new PawnPotLook(223,140,model.getTestPot()));
        addLook(new PawnPotLook(140, 420, model.getInvisiblePot()));
        addLook(new PawnPotLook(140, 446, model.getColorPot()));
        addLook(new PawnPotLook(140, 420, model.getCombFinalPot()));


        for(int i=0;i<12;i++) {
            addLook(new PawnLook(20,model.getBlackPawns()[i], true));
            addLook(new PawnLook(20, model.getRedPawns()[i], true));
        }

        for(int i=0;i<4;i++) {
            addLook(new PawnLook(20, model.getCombFinalPawns()[i], false));
        }

        for(int i=0;i<48;i++) {
            addLook(new PawnLook(20, model.getInvisiblePawn()[i], false));
        }

        for(int i=0;i<8;i++) {
            addLook(new PawnLook(20, model.getColorPawn()[i], false));
        }

        addLook(new TextLook(12, "0x000000", model.getPlayerName()));
        addLook(new ButtonLook(12, "0x000000", 100, 20, model.getButtonElementConfirm()));
        addLook(new ButtonLook(12, "0x000000", 55, 40, model.getButtonElementClear()));
    }
}
