package form;

import java.io.File;
import java.io.FileReader;
import java.io.LineNumberReader;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Element;
import controller.GoToLineController;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;


public class MainForm extends javax.swing.JFrame {
    
    GoToLineController controller;
    
    private String textCheckSaved = "";
    private boolean saved = true;
    private File file = null;
    
    
    public MainForm() {
        controller = new GoToLineController(this);
        initComponents();
        this.setTitle("Text Editor - Ecchost");
    }

    public JTextPane getTextArea() {
        return textArea;
    }

    
    public JTextPane getTxtArea() {
        return textArea;
    }

    public void setTxtArea(JTextPane textArea) {
        this.textArea = textArea;
    }

    public JMenuItem getEditCopy() {
        return editCopy;
    }

    public void setEditCopy(JMenuItem editCopy) {
        this.editCopy = editCopy;
    }

    public JMenuItem getEditCut() {
        return editCut;
    }

    public void setEditCut(JMenuItem editCut) {
        this.editCut = editCut;
    }

    public JMenuItem getEditDelete() {
        return editSelectAll;
    }

    public void setEditDelete(JMenuItem editDelete) {
        this.editSelectAll = editDelete;
    }

    public JMenuItem getEditPaste() {
        return editPaste;
    }

    public void setEditPaste(JMenuItem editPaste) {
        this.editPaste = editPaste;
    }

    public JMenuItem getEditRedo() {
        return editRedo;
    }

    public void setEditRedo(JMenuItem editRedo) {
        this.editRedo = editRedo;
    }

    public JMenuItem getEditUndo() {
        return editUndo;
    }

    public void setEditUndo(JMenuItem editUndo) {
        this.editUndo = editUndo;
    }

    public JMenuItem getFind() {
        return find;
    }

    public void setFind(JMenuItem find) {
        this.find = find;
    }

    public JMenuItem getReplace() {
        return replace;
    }

    public void setReplace(JMenuItem replace) {
        this.replace = replace;
    }

    public JMenuItem getFileExit() {
        return fileExit;
    }

    public void setFileExit(JMenuItem fileExit) {
        this.fileExit = fileExit;
    }

    public JMenuItem getFileNew() {
        return fileNew;
    }

    public void setFileNew(JMenuItem fileNew) {
        this.fileNew = fileNew;
    }

    public JMenuItem getFileOpen() {
        return fileOpen;
    }

    public void setFileOpen(JMenuItem fileOpen) {
        this.fileOpen = fileOpen;
    }

    public JMenuItem getFileSave() {
        return fileSave;
    }

    public void setFileSave(JMenuItem fileSave) {
        this.fileSave = fileSave;
    }

    public JMenuItem getFileSaveAs() {
        return fileSaveAs;
    }

    public void setFileSaveAs(JMenuItem fileSaveAs) {
        this.fileSaveAs = fileSaveAs;
    }  

    public boolean isSaved() {
        return saved;
    }

    public void setSaved(boolean saved) {
        this.saved = saved;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getTextCheckSaved() {
        return textCheckSaved;
    }

    public void setTextCheckSaved(String textCheckSaved) {
        this.textCheckSaved = textCheckSaved;
    }

    public JMenuItem getEditChangeFont() {
        return editChangeFont;
    }

    public void setEditChangeFont(JMenuItem editChangeFont) {
        this.editChangeFont = editChangeFont;
    }

    public JButton getBtnGo() {
        return btnGo;
    }

    public void setBtnGo(JButton btnGo) {
        this.btnGo = btnGo;
    }

    public JTextField getjTextLine() {
        return txtToLine;
    }

    public void setjTextLine(JTextField jTextLine) {
        this.txtToLine = jTextLine;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogColor = new javax.swing.JDialog();
        colorChooser = new javax.swing.JColorChooser();
        jMenuItem1 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextPane();
        txtToLine = new javax.swing.JTextField();
        btnGo = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        fileNew = new javax.swing.JMenuItem();
        fileOpen = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        fileSave = new javax.swing.JMenuItem();
        fileSaveAs = new javax.swing.JMenuItem();
        fileExit = new javax.swing.JMenuItem();
        menuEdit = new javax.swing.JMenu();
        editUndo = new javax.swing.JMenuItem();
        editRedo = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        editCut = new javax.swing.JMenuItem();
        editCopy = new javax.swing.JMenuItem();
        editPaste = new javax.swing.JMenuItem();
        editSelectAll = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        find = new javax.swing.JMenuItem();
        replace = new javax.swing.JMenuItem();
        editChangeFont = new javax.swing.JMenuItem();

        javax.swing.GroupLayout dialogColorLayout = new javax.swing.GroupLayout(dialogColor.getContentPane());
        dialogColor.getContentPane().setLayout(dialogColorLayout);
        dialogColorLayout.setHorizontalGroup(
            dialogColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 659, Short.MAX_VALUE)
            .addGroup(dialogColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(dialogColorLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(colorChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        dialogColorLayout.setVerticalGroup(
            dialogColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 347, Short.MAX_VALUE)
            .addGroup(dialogColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(dialogColorLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(colorChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textArea.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        textArea.setSelectedTextColor(new java.awt.Color(204, 204, 255));
        jScrollPane1.setViewportView(textArea);

        txtToLine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtToLineMouseClicked(evt);
            }
        });

        btnGo.setText("Go");
        btnGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoActionPerformed(evt);
            }
        });

        menuFile.setText("File");

        fileNew.setText("New");
        fileNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileNewActionPerformed(evt);
            }
        });
        menuFile.add(fileNew);

        fileOpen.setText("Open");
        menuFile.add(fileOpen);
        menuFile.add(jSeparator1);

        fileSave.setText("Save");
        menuFile.add(fileSave);

        fileSaveAs.setText("Save As");
        menuFile.add(fileSaveAs);

        fileExit.setText("Exit ");
        menuFile.add(fileExit);

        menuBar.add(menuFile);

        menuEdit.setText("Edit");

        editUndo.setText("Undo");
        menuEdit.add(editUndo);

        editRedo.setText("Redo");
        editRedo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editRedoActionPerformed(evt);
            }
        });
        menuEdit.add(editRedo);
        menuEdit.add(jSeparator2);

        editCut.setText("Cut");
        menuEdit.add(editCut);

        editCopy.setText("Copy");
        menuEdit.add(editCopy);

        editPaste.setText("Paste");
        menuEdit.add(editPaste);

        editSelectAll.setText("SelectAll");
        menuEdit.add(editSelectAll);
        menuEdit.add(jSeparator3);

        find.setText("Find");
        menuEdit.add(find);

        replace.setText("Replace");
        menuEdit.add(replace);

        editChangeFont.setText("Change font");
        menuEdit.add(editChangeFont);

        menuBar.add(menuEdit);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtToLine, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtToLine)
                    .addComponent(btnGo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fileNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileNewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fileNewActionPerformed

    private void editRedoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editRedoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editRedoActionPerformed

    private void btnGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoActionPerformed
        // TODO add your handling code here:
        txtToLine.setEnabled(false);
        try {
//            if(TextArea.getDocument().getText(0, TextArea.getDocument().getLength()) != null){
                controller.toLine(textArea, Integer.valueOf(txtToLine.getText()));
        } catch (BadLocationException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGoActionPerformed

    private void txtToLineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtToLineMouseClicked
        // TODO add your handling code here:
        txtToLine.setEnabled(true);
    }//GEN-LAST:event_txtToLineMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGo;
    private javax.swing.JColorChooser colorChooser;
    private javax.swing.JDialog dialogColor;
    private javax.swing.JMenuItem editChangeFont;
    private javax.swing.JMenuItem editCopy;
    private javax.swing.JMenuItem editCut;
    private javax.swing.JMenuItem editPaste;
    private javax.swing.JMenuItem editRedo;
    private javax.swing.JMenuItem editSelectAll;
    private javax.swing.JMenuItem editUndo;
    public javax.swing.JMenuItem fileExit;
    private javax.swing.JMenuItem fileNew;
    public javax.swing.JMenuItem fileOpen;
    private javax.swing.JMenuItem fileSave;
    private javax.swing.JMenuItem fileSaveAs;
    private javax.swing.JMenuItem find;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuEdit;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenuItem replace;
    private javax.swing.JTextPane textArea;
    private javax.swing.JTextField txtToLine;
    // End of variables declaration//GEN-END:variables

}