package breadTycoon;

import java.awt.*;
import java.awt.event.*;
//import java.util.Timer;
//import java.util.TimerTask;
/*import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;*/

import javax.swing.*;
/*import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;*/
//import javax.xml.stream.events.Comment;

//import breadTycoon.Tycoon.job0;

public class Title extends JFrame {
	public Container contentPane;
	public JPanel imageView;
	
	Title() {	// 객체 생성 시 무조건 실행되는 생성자
		setTitle("붕어빵타이쿤 3");	// 타이틀 적용
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// X버튼 클릭시 윈도우창(프레임)이 꺼지도록 설정
		
		contentPane = getContentPane();
		contentPane.setLayout(new GridLayout(0, 1));
		
		imageView = new JPanel();
		
		contentPane.add(imageView);
		
		ImageIcon title = new ImageIcon("img/title.png");
		JLabel label = new JLabel(title);
		
		imageView.add(label);
		
		JButton btn0 = new JButton("START");
		btn0.setBackground(Color.WHITE);
		btn0.setFont(new Font("3D", Font.CENTER_BASELINE, 30));
		//System.out.println("getFont : " + btn0.getFont());
		
		JButton btn1 = new JButton("EXIT");
		btn1.setBackground(Color.WHITE);
		btn1.setFont(new Font("3D", Font.CENTER_BASELINE, 30));
		//System.out.println("getFont : " + btn1.getFont());
		
		imageView.add(btn0, BorderLayout.SOUTH);	// button을 남쪽으로 가져다 놓자
		imageView.add(btn1, BorderLayout.SOUTH);
		
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();	// 시작화면을 지움
				new Tycoon();
			}
		});
		
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		
		setSize(400, 650);
		
		Dimension frameSize = this.getSize();	// frame 크기 구하기
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();	// 내 모니터 크기 구하기
		this.setLocation((screenSize.width - frameSize.width)/2, (screenSize.height - frameSize.height)/2);
		
		setVisible(true);
	}
}
