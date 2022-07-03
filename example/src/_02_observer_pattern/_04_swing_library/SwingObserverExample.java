package _02_observer_pattern._04_swing_library;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingObserverExample {
  JFrame frame;

  public static void main(String[] args) {
    SwingObserverExample example = new SwingObserverExample();
    example.go();
  }

  public void go() {
    frame = new JFrame();
    JButton button = new JButton("할까? 말까?");
    button.addActionListener(event -> System.out.println("하지 마! 아마 후회할 걸?"));
    button.addActionListener(event -> System.out.println("그냥 저질러 버렷!!!"));
  }
}
