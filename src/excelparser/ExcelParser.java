/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excelparser;

import model.League;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import model.Team;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

/**
 *
 * @author Jeff
 */
public class ExcelParser {
    
    public ArrayList<League> parseFile(File f) throws InvalidFileException {
        try {
            FileInputStream is = new FileInputStream(f);
            HSSFWorkbook workbook = new HSSFWorkbook(is);
            HSSFSheet sheet = workbook.getSheetAt(0);
            
            ArrayList<League> leagues = new ArrayList();
            ArrayList<String> leagueNames = getRowData(sheet.getRow(0));
            
            for (String leagueName : leagueNames) {
                leagues.add(new League(leagueName));
            }
            
            for (int r = 1; r < sheet.getLastRowNum()+1; r++) {
                
                ArrayList<String> rowData = getRowData(sheet.getRow(r));
                
                for (int c = 0; c < rowData.size(); c++) {
                    leagues.get(c).addTeam(new Team(rowData.get(c)));
                }
            }
            
            return leagues;
        } catch(IOException ioe) {
            throw new InvalidFileException("Kunde inte ladda in filen. Försök igen!");
        }
    }
    
    /**
     * Gets all the available data form the row.
     * 
     * @param row
     * @return
     * @throws excelparser.ExcelParser.InvalidFileException 
     */
    private ArrayList<String> getRowData(Row row) throws InvalidFileException {
        ArrayList<String> columnNames = new ArrayList();
        
        loop:
        for (Cell cell : row) {

            switch (cell.getCellType()) {
                case Cell.CELL_TYPE_STRING:
                    columnNames.add(cell.getRichStringCellValue().toString());
                    break;
                case Cell.CELL_TYPE_BLANK:
                    break loop;
                default:
                    throw new InvalidFileException("Excel-filen innehåller celler med felaktiga värden, bara text-värden accepteras!");
            }
        }
        
        return columnNames;
    }
    
    public class InvalidFileException extends Exception {

        public InvalidFileException(String message) {
            super(message);
        }
        
    }
}
