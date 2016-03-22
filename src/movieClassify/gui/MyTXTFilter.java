package movieClassify.gui;

import java.io.File;
/**
 * Created by Houssine on 25-11-2015.
 */

class MyTXTFilter extends javax.swing.filechooser.FileFilter {
    @Override
    public boolean accept(File file) {
      
        return file.isDirectory() || file.getAbsolutePath().endsWith(".txt");
    }
    @Override
    public String getDescription() {
        
        return "Text documents (*.txt)";
    }
} 