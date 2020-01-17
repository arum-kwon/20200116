package co.arum.lambda;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ActionTest extends JFrame {

	JButton btn;
	public ActionTest() {
		this.setTitle("frame test");
		this.setSize(300,200);
		btn = new JButton("down");
		JButton btn2 = new JButton("2 down 2");
		btn.addActionListener( e -> { //람다식을 쓰면 this 내부 객체가 아니라 바깥 객체를 참조함 
			System.out.println("Button Event");
			this.setTitle("Change");
			this.btn.setText("new button");
		});
		this.getContentPane().add(btn);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new ActionTest();
	}
	
//	class ActionHandler implements ActionListener{
//
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			System.out.println("Button Event");
//			
//		}
//		
//	}
}
