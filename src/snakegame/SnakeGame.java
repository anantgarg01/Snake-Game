//package snakegame;
//
//import javax.swing.*;
//
//public class SnakeGame extends JFrame {
//        
//    SnakeGame() {
//        super("Snake Game"); 
//        //must be first statement for heading
//         add(new Board());  
//         pack();  //for reload or refresh the page
//       // setLocation(100,100); //(x,y)
//        setSize(300,300);  //(width,Height)
//         setLocationRelativeTo(null);     //for center
//        setVisible(true);
//    }
//   
//    public static void main(String[] args) {
//       
//        new SnakeGame();
//    }a
//    
//}

package snakegame;

import javax.swing.*;

public class SnakeGame extends JFrame {
    
    SnakeGame() {
        super("Snake Game");
        add(new Board());
        pack();
        
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public static void main(String[] args) {
        new SnakeGame().setVisible(true);
    }
}