/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import form.MainForm;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Element;
/**
 *
 * @author Ecchost
 */
public class GoToLineController {
    
    private MainForm view;
    
    public GoToLineController(MainForm view){
        this.view = view;
    }
 
    public void toLine(JTextPane text, int line) throws BadLocationException{

        char[] textArr = text.getDocument().getText(0, text.getDocument().getLength()).toCharArray();
        int countNewLine = 0;
        int position = 0;
            for(char c : textArr){
                if(c == '\n'){
                    countNewLine++;
                }
                if (countNewLine == line){
                break;
                }
                position++;
            }
            view.getTxtArea().setSelectionStart(position);
            view.getTxtArea().setSelectionEnd(position + 2);
//            text.setCaretPosition(position);
//            text.setSelectionStart(position);
//            text.setSelectionEnd(position+2);
//            text.setSelectionColor(Color.blue);
            
//            view.getTxtArea().setCaretPosition(position);
//            view.getTxtArea().setSelectionStart(position);
//            view.getTxtArea().setSelectionEnd(position+2);
//            view.getTxtArea().setSelectionColor(Color.blue);
            
            
        }
}
