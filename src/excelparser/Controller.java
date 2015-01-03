/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excelparser;

import model.League;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author Jeff
 */
public class Controller {
    private static Controller controller;
    private GUI view;
    private File chosenFile;
    private ArrayList<League> leagues;
    
    private Controller() {
        
    }
    
    private Controller(GUI gui) {
        view = gui;
    }
    
    public static synchronized Controller getInstance() {
        
        if (controller == null)
            controller = new Controller();
        
        return controller;
    }
    
    public void setGUI(GUI gui) {
        this.view = gui;
    }

    public void chooseFile(File chosenFile) {
        this.chosenFile = chosenFile;
        
        ExcelParser parser = new ExcelParser();
        try {
            ArrayList<League> leagues = parser.parseFile(chosenFile);
            this.leagues = leagues;
            view.displayLeagueInfo(leagues);
            view.setChosenFilePath(chosenFile.getAbsolutePath());
            view.setUploadButtonEnabled(true);
        } catch(ExcelParser.InvalidFileException ife) {
            view.displayError(ife.getMessage());
        }
    }

    public void performUpload(String username, String password) {
        try {
            DAO dao = new DAO();
            
            String returnMessage = dao.uploadLeagueData(username, password, leagues);
            if (returnMessage.equals("-1"))
                view.displayError("Nånting har gått horribelt fel!\n\nVar vänlig kontakta systemadministratören.");
            else
                view.displayHTMLMessage(returnMessage);
            
        } catch(Exception sqle) {
            view.displayError("Nånting gick fel med uppladdningen!\n\nVar vänlig kontakta din databasadministratör.\n\n"+sqle.getMessage());
        }
    }
    
    private void clearFileData() {
        this.chosenFile = null;
        this.leagues = null;
        view.setChosenFilePath("");
        view.setUploadButtonEnabled(false);
        view.clearLeagueInfoDisplay();
    }
}
