package learnjava;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/*w ww. j  a va 2  s . c  o m*/

public class Main {
  public static void main(String args[]) {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    final Action printAction = new PrintHelloAction();
    
    JMenuBar menuBar = new JMenuBar();
    JMenu menu = new JMenu("File");
    menuBar.add(menu);
    JMenuItem menuItem = new JMenuItem("Print");
    KeyStroke ctrlP = KeyStroke.getKeyStroke(KeyEvent.VK_P,
        InputEvent.CTRL_MASK);
    menuItem.setAccelerator(ctrlP);
    menuItem.addActionListener(printAction);
    menu.add(menuItem);

    JButton fileButton = new JButton("About");
    fileButton.setMnemonic(KeyEvent.VK_A);
    fileButton.addActionListener(printAction);

    frame.setJMenuBar(menuBar);

    frame.add(fileButton, BorderLayout.SOUTH);
    frame.setSize(300, 100);
    frame.setVisible(true);
  }
}

class PrintHelloAction extends AbstractAction 
   {

  PrintHelloAction() 
  {
    super("Print");
    putValue(Action.SHORT_DESCRIPTION, "Hello, World");
    PropertyChangeListener listener = new PropertyChangeListener()
    {
      @Override
      public void propertyChange(PropertyChangeEvent evt)
      {
        System.out.println(evt);
      }
    };
    super.addPropertyChangeListener(listener);
    super.firePropertyChange(Action.SHORT_DESCRIPTION,"hello22","hell33");
  }

  public void actionPerformed(ActionEvent actionEvent) 
  {
//	  Listener.
    System.out.println("Helloafd, World");
//	 if (actionEvent.getSource() == fileButton){
//		 
//		 
//	 }
  }
}