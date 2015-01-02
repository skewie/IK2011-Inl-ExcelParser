/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excelparser;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author Jeff
 */

/**
 * Hämtar filtypen för en fil.
 * 
 * @author Jeff
 */
public abstract class Utils {
    
    public static final String XLS = "xls";
    
    public static String getFileExtension(File f) {
        String s = f.getName();
        int i = s.lastIndexOf('.');

        if (i > 0 &&  i < s.length() - 1) {
            return s.substring(i+1).toLowerCase();
        }
        return "";
    }
    
    public static FileFilter getExcelFileFilter() {
            FileFilter ff = new FileFilter() {
            
            @Override
            public boolean accept(File f) {
                String extension = Utils.getFileExtension(f);
                
                if (extension != null) {
                    if (Utils.XLS.equalsIgnoreCase(extension)) {
                        return true;
                    }
                }
                
                return false;
            }

            @Override
            public String getDescription() {
                return "Excel Fil (.xls)";
            }
        };
            
        return ff;
    }
}
