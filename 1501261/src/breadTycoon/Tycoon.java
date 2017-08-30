package breadTycoon;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.event.ItemEvent;
//import java.awt.event.ItemListener;

import javax.swing.*;
//import javax.swing.event.*;

public class Tycoon extends JFrame{
	Container contentPane;
	
	JPanel panel[];
	
	JButton btn[];
	
	ImageIcon shape;	// 사용할 ImageIcon
	ImageIcon dough;
	ImageIcon complete;
	ImageIcon fail;
	ImageIcon lol;
	
	int score = 0;	// 점수우우우우
	int count = 0;	// 탄 빵 세려보자
	
	Timer[] timer;
	Timer[] bTimer;
	Timer[] lTimer;
	// Timer 클래스 : 실제 타이머의 기능을 수행하는 클래스
	// TimerTask 클래스 : Timer 클래스가 수행되야 할 내용을 작성하는 클래스
	// schedule 메소드 : 타이머를 작동시키는 메소드
	
	int speed_time = 7000;	// 7초! 1000ms = 1s
	
	JLabel textLabel;
	
	class job0 extends TimerTask implements Runnable{	// 밀가루에서 완성으로
		public void run(){
			if(btn[0].getIcon() == dough)
				btn[0].setIcon(complete);
		}
	}
	class bJob0 extends TimerTask implements Runnable{		// 완성에서 실패로
		public void run(){
			if(btn[0].getIcon() == complete)
				btn[0].setIcon(fail);
		}
	}
	class lJob0 extends TimerTask implements Runnable{	// 실패에서 망함으로
		public void run() {
			if(btn[0].getIcon() == fail)
				btn[0].setIcon(lol);
		}
	}
	
	class job1 extends TimerTask implements Runnable{
		public void run(){
			if(btn[1].getIcon() == dough)
				btn[1].setIcon(complete);
		}
	}
	class bJob1 extends TimerTask implements Runnable{
		public void run(){
			if(btn[1].getIcon() == complete)
				btn[1].setIcon(fail);
		}
	}
	class lJob1 extends TimerTask implements Runnable{
		public void run() {
			if(btn[1].getIcon() == fail)
				btn[1].setIcon(lol);
		}
	}
	
	class job2 extends TimerTask implements Runnable{
		public void run(){
			if(btn[2].getIcon() == dough)
				btn[2].setIcon(complete);
		}
	}
	class bJob2 extends TimerTask implements Runnable{
		public void run(){
			if(btn[2].getIcon() == complete)
				btn[2].setIcon(fail);
		}
	}
	class lJob2 extends TimerTask implements Runnable{
		public void run() {
			if(btn[2].getIcon() == fail)
				btn[2].setIcon(lol);
		}
	}
	
	class job3 extends TimerTask implements Runnable{
		public void run(){
			if(btn[3].getIcon() == dough)
				btn[3].setIcon(complete);
		}
	}
	class bJob3 extends TimerTask implements Runnable{
		public void run(){
			if(btn[3].getIcon() == complete)
				btn[3].setIcon(fail);
		}
	}
	class lJob3 extends TimerTask implements Runnable{
		public void run() {
			if(btn[3].getIcon() == fail)
				btn[3].setIcon(lol);
		}
	}
	
	class job4 extends TimerTask implements Runnable{
		public void run(){
			if(btn[4].getIcon() == dough)
				btn[4].setIcon(complete);
		}
	}
	class bJob4 extends TimerTask implements Runnable{
		public void run(){
			if(btn[4].getIcon() == complete)
				btn[4].setIcon(fail);
		}
	}
	class lJob4 extends TimerTask implements Runnable{
		public void run() {
			if(btn[4].getIcon() == fail)
				btn[4].setIcon(lol);
		}
	}
	
	class job5 extends TimerTask implements Runnable{
		public void run(){
			if(btn[5].getIcon() == dough)
				btn[5].setIcon(complete);
		}
	}
	class bJob5 extends TimerTask implements Runnable{
		public void run(){
			if(btn[5].getIcon() == complete)
				btn[5].setIcon(fail);
		}
	}
	class lJob5 extends TimerTask implements Runnable{
		public void run() {
			if(btn[5].getIcon() == fail)
				btn[5].setIcon(lol);
		}
	}
	
	class job6 extends TimerTask implements Runnable{
		public void run(){
			if(btn[6].getIcon() == dough)
				btn[6].setIcon(complete);
		}
	}
	class bJob6 extends TimerTask implements Runnable{
		public void run(){
			if(btn[6].getIcon() == complete)
				btn[6].setIcon(fail);
		}
	}
	class lJob6 extends TimerTask implements Runnable{
		public void run() {
			if(btn[6].getIcon() == fail)
				btn[6].setIcon(lol);
		}
	}
	
	class job7 extends TimerTask implements Runnable{
		public void run(){
			if(btn[7].getIcon() == dough)
				btn[7].setIcon(complete);
		}
	}
	class bJob7 extends TimerTask implements Runnable{
		public void run(){
			if(btn[7].getIcon() == complete)
				btn[7].setIcon(fail);
		}
	}
	class lJob7 extends TimerTask implements Runnable{
		public void run() {
			if(btn[7].getIcon() == fail)
				btn[7].setIcon(lol);
		}
	}
	
	class job8 extends TimerTask implements Runnable{
		public void run(){
			if(btn[8].getIcon() == dough)
				btn[8].setIcon(complete);
		}
	}
	class bJob8 extends TimerTask implements Runnable{
		public void run(){
			if(btn[8].getIcon() == complete)
				btn[8].setIcon(fail);
		}
	}
	class lJob8 extends TimerTask implements Runnable{
		public void run() {
			if(btn[8].getIcon() == fail)
				btn[8].setIcon(lol);
		}
	}
	
	class job9 extends TimerTask implements Runnable{
		public void run(){
			if(btn[9].getIcon() == dough)
				btn[9].setIcon(complete);
		}
	}
	class bJob9 extends TimerTask implements Runnable{
		public void run(){
			if(btn[9].getIcon() == complete)
				btn[9].setIcon(fail);
		}
	}
	class lJob9 extends TimerTask implements Runnable{
		public void run() {
			if(btn[9].getIcon() == fail)
				btn[9].setIcon(lol);
		}
	}
	
	class job10 extends TimerTask implements Runnable{
		public void run(){
			if(btn[10].getIcon() == dough)
				btn[10].setIcon(complete);
		}
	}
	class bJob10 extends TimerTask implements Runnable{
		public void run(){
			if(btn[10].getIcon() == complete)
				btn[10].setIcon(fail);
		}
	}
	class lJob10 extends TimerTask implements Runnable{
		public void run() {
			if(btn[10].getIcon() == fail)
				btn[10].setIcon(lol);
		}
	}
	
	class job11 extends TimerTask implements Runnable{
		public void run(){
			if(btn[11].getIcon() == dough)
				btn[11].setIcon(complete);
		}
	}
	class bJob11 extends TimerTask implements Runnable{
		public void run(){
			if(btn[11].getIcon() == complete)
				btn[11].setIcon(fail);
		}
	}
	class lJob11 extends TimerTask implements Runnable{
		public void run() {
			if(btn[11].getIcon() == fail)
				btn[11].setIcon(lol);
		}
	}
	
	Tycoon() { // 객체 생성 시 무조건 실행되는 생성자
		timer = new Timer[13];
		bTimer = new Timer[12];
		lTimer = new Timer[12];
		
		setTitle("붕어빵타이쿤 3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		contentPane = getContentPane();
		contentPane.setLayout(new GridLayout(6, 1));

		panel = new JPanel[5];
		
		for(int i = 0 ; i < 5 ; i++)
		{
			panel[i] = new JPanel();
			panel[i].setLayout(new FlowLayout());
		}
		
		shape = new ImageIcon("img/shape.png");
		dough = new ImageIcon("img/dough.png");
		complete = new ImageIcon("img/complete.png");
		fail = new ImageIcon("img/fail.png");
		lol = new ImageIcon("img/lol.png");
		
		btn = new JButton[12];	// button 총 12개
		
		for ( int j = 0 ; j < 12 ; j++)	// 모양 있는 버튼 총 12개
			btn[j] = new JButton("", shape);
		
		btn[0].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(btn[0].getIcon() == shape)
					{
						timer[0] = new Timer();
						bTimer[0] = new Timer();
						lTimer[0] = new Timer();
						
						btn[0].setIcon(dough);	// 누르면 반죽 샤라랑~
						timer[0].schedule(new job0(), speed_time);	// speed_time 7초!
						// TimerTask로 지정한 일 job0()을 7초 delay 시키고 실행하도록 schedule
						bTimer[0].schedule(new bJob0(), speed_time*2);
						// TimerTask로 지정한 일 bJob0()을 14초 delay 시키고 실행하도록 schedule
						lTimer[0].schedule(new lJob0(), (speed_time*2)*2);
						// TimerTask로 지정한 일 lJob0()을 7초 delay 시키고 실행하도록 schedule
					}
					else 
					{
						if(btn[0].getIcon() == dough || btn[0].getIcon() == fail) {
							score -= 10;
							if(score < 0) {
								new gameOver();
							}
							btn[0].setIcon(shape);
						}
						else if(btn[0].getIcon() == lol) {
							btn[0].setIcon(lol);
						}
						else {
							score += 10;
							if(score < 0) {
								new gameOver();
							}
							btn[0].setIcon(shape);
						}
						textLabel.setText("Score :" +Integer.toString(score));
					}
				}
		});
		
		btn[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn[1].getIcon() == shape)
				{
					timer[1] = new Timer();
					bTimer[1] = new Timer();
					lTimer[1] = new Timer();
					
					btn[1].setIcon(dough);
					timer[1].schedule(new job1(), speed_time-3000);
					// 중간 불에서 가까운 쪽이니까 빨리 익을테니까 4초만에 익거라아아아
					bTimer[1].schedule(new bJob1(), (speed_time-3000)*2);
					lTimer[1].schedule(new lJob1(), ((speed_time-3000)*2)*2);
				}
				else 
				{
					if(btn[1].getIcon() == dough || btn[1].getIcon() == fail) {
						score -= 10;
						if(score < 0) {
							new gameOver();
						}
						btn[1].setIcon(shape);
					}
					else if(btn[1].getIcon() == lol) {
						btn[1].setIcon(lol);
					}
					else {
						score += 10;
						if(score < 0) {
							new gameOver();
						}
						btn[1].setIcon(shape);
					}
					textLabel.setText("Score :" +Integer.toString(score));
				}
			}
		});
		
		btn[2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn[2].getIcon() == shape)
				{
					timer[2] = new Timer();
					bTimer[2] = new Timer();
					lTimer[2] = new Timer();
					
					btn[2].setIcon(dough);
					timer[2].schedule(new job2(), speed_time);
					bTimer[2].schedule(new bJob2(), speed_time*2);
					lTimer[2].schedule(new lJob2(), (speed_time*2)*2);
				}
				else 
				{
					if(btn[2].getIcon() == dough || btn[2].getIcon() == fail) {
						score -= 10;
						if(score < 0) {
							new gameOver();
						}
						btn[2].setIcon(shape);
					}
					else if(btn[2].getIcon() == lol) {
						btn[2].setIcon(lol);
					}
					else {
						score += 10;
						if(score < 0) {
							new gameOver();
						}
						btn[2].setIcon(shape);
					}
					textLabel.setText("Score :" +Integer.toString(score));
				}
			}
		});
		
		btn[3].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn[3].getIcon() == shape)
				{
					timer[3] = new Timer();
					bTimer[3] = new Timer();
					lTimer[3] = new Timer();
					
					btn[3].setIcon(dough);
					timer[3].schedule(new job3(), speed_time-3000);
					bTimer[3].schedule(new bJob3(), (speed_time-3000)*2);
					lTimer[3].schedule(new lJob3(), ((speed_time-3000)*2)*2);
				}
				else 
				{
					if(btn[3].getIcon() == dough || btn[3].getIcon() == fail) {
						score -= 10;
						if(score < 0) {
							new gameOver();
						}
						btn[3].setIcon(shape);
					}
					else if(btn[3].getIcon() == lol) {
						btn[3].setIcon(lol);
					}
					else {
						score += 10;
						if(score < 0) {
							new gameOver();
						}
						btn[3].setIcon(shape);
					}
					textLabel.setText("Score :" +Integer.toString(score));
				}
			}
		});
		
		btn[4].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn[4].getIcon() == shape)
				{
					timer[4] = new Timer();
					bTimer[4] = new Timer();
					lTimer[4] = new Timer();
					
					btn[4].setIcon(dough);
					timer[4].schedule(new job4(), speed_time-4000);
					bTimer[4].schedule(new bJob4(), (speed_time-4000)*2);
					lTimer[4].schedule(new lJob4(), ((speed_time-4000)*2)*2);
				}
				else 
				{
					if(btn[4].getIcon() == dough || btn[4].getIcon() == fail) {
						score -= 10;
						if(score < 0) {
							new gameOver();
						}
						btn[4].setIcon(shape);
					}
					else if(btn[4].getIcon() == lol) {
						btn[4].setIcon(lol);
					}
					else {
						score += 10;
						if(score < 0) {
							new gameOver();
						}
						btn[4].setIcon(shape);
					}
					textLabel.setText("Score :" +Integer.toString(score));
				}
			}
		});
		
		btn[5].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn[5].getIcon() == shape)
				{
					timer[5] = new Timer();
					bTimer[5] = new Timer();
					lTimer[5] = new Timer();
					
					btn[5].setIcon(dough);
					timer[5].schedule(new job5(), speed_time-3000);
					bTimer[5].schedule(new bJob5(), (speed_time-3000)*2);
					lTimer[5].schedule(new lJob5(), ((speed_time-3000)*2)*2);
				}
				else 
				{
					if(btn[5].getIcon() == dough || btn[5].getIcon() == fail) {
						score -= 10;
						if(score < 0) {
							new gameOver();
						}
						btn[5].setIcon(shape);
					}
					else if(btn[5].getIcon() == lol) {
						btn[5].setIcon(lol);
					}
					else {
						score += 10;
						if(score < 0) {
							new gameOver();
						}
						btn[5].setIcon(shape);
					}
					textLabel.setText("Score :" +Integer.toString(score));
				}
			}
		});
		
		btn[6].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn[6].getIcon() == shape)
				{
					timer[6] = new Timer();
					bTimer[6] = new Timer();
					lTimer[6] = new Timer();
					
					btn[6].setIcon(dough);
					timer[6].schedule(new job6(), speed_time);
					bTimer[6].schedule(new bJob6(), speed_time*2);
					lTimer[6].schedule(new lJob6(), (speed_time*2)*2);
				}
				else 
				{
					if(btn[6].getIcon() == dough || btn[6].getIcon() == fail) {
						score -= 10;
						if(score < 0) {
							new gameOver();
						}
						btn[6].setIcon(shape);
					}
					else if(btn[6].getIcon() == lol) {
						btn[6].setIcon(lol);
					}
					else {
						score += 10;
						if(score < 0) {
							new gameOver();
						}
						btn[6].setIcon(shape);
					}
					textLabel.setText("Score :" +Integer.toString(score));
				}
			}
		});
		
		btn[7].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn[7].getIcon() == shape)
				{
					timer[7] = new Timer();
					bTimer[7] = new Timer();
					lTimer[7] = new Timer();
					
					btn[7].setIcon(dough);
					timer[7].schedule(new job7(), speed_time-3000);
					bTimer[7].schedule(new bJob7(), (speed_time-3000)*2);
					lTimer[7].schedule(new lJob7(), ((speed_time-3000)*2)*2);
				}
				else 
				{
					if(btn[7].getIcon() == dough || btn[7].getIcon() == fail) {
						score -= 10;
						if(score < 0) {
							new gameOver();
						}
						btn[7].setIcon(shape);
					}
					else if(btn[7].getIcon() == lol) {
						btn[7].setIcon(lol);
					}
					else {
						score += 10;
						if(score < 0) {
							new gameOver();
						}
						btn[7].setIcon(shape);
					}
					textLabel.setText("Score :" +Integer.toString(score));
				}
			}
		});
		
		btn[8].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn[8].getIcon() == shape)
				{
					timer[8] = new Timer();
					bTimer[8] = new Timer();
					lTimer[8] = new Timer();
					
					btn[8].setIcon(dough);
					timer[8].schedule(new job8(), speed_time);
					bTimer[8].schedule(new bJob8(), speed_time*2);
					lTimer[8].schedule(new lJob8(), (speed_time*2)*2);
				}
				else 
				{
					if(btn[8].getIcon() == dough || btn[8].getIcon() == fail) {
						score -= 10;
						if(score < 0) {
							new gameOver();
						}
						btn[8].setIcon(shape);
					}
					else if(btn[8].getIcon() == lol) {
						btn[8].setIcon(lol);
					}
					else {
						score += 10;
						if(score < 0) {
							new gameOver();
						}
						btn[8].setIcon(shape);
					}
					textLabel.setText("Score :" +Integer.toString(score));
				}
			}
		});
		
		btn[9].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn[9].getIcon() == shape)
				{
					timer[9] = new Timer();
					bTimer[9] = new Timer();
					lTimer[9] = new Timer();
					
					btn[9].setIcon(dough);
					timer[9].schedule(new job9(), speed_time-3000);
					bTimer[9].schedule(new bJob9(), (speed_time-3000)*2);
					lTimer[9].schedule(new lJob9(), ((speed_time-3000)*2)*2);
				}
				else 
				{
					if(btn[9].getIcon() == dough || btn[9].getIcon() == fail) {
						score -= 10;
						if(score < 0) {
							new gameOver();
						}
						btn[9].setIcon(shape);
					}
					else if(btn[9].getIcon() == lol) {
						btn[9].setIcon(lol);
					}
					else {
						score += 10;
						if(score < 0) {
							new gameOver();
						}
						btn[9].setIcon(shape);
					}
					textLabel.setText("Score :" +Integer.toString(score));
				}
			}
		});
		
		btn[10].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn[10].getIcon() == shape)
				{
					timer[10] = new Timer();
					bTimer[10] = new Timer();
					lTimer[10] = new Timer();
					
					btn[10].setIcon(dough);
					timer[10].schedule(new job10(), speed_time);
					bTimer[10].schedule(new bJob10(), speed_time*2);
					lTimer[10].schedule(new lJob10(), (speed_time*2)*2);
				}
				else 
				{
					if(btn[10].getIcon() == dough || btn[10].getIcon() == fail) {
						score -= 10;
						if(score < 0) {
							new gameOver();
						}
						btn[10].setIcon(shape);
					}
					else if(btn[10].getIcon() == lol) {
						btn[10].setIcon(lol);
					}
					else {
						score += 10;
						if(score < 0) {
							new gameOver();
							
						}
						btn[10].setIcon(shape);
					}
					textLabel.setText("Score :" +Integer.toString(score));
				}
			}
		});
		
		btn[11].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn[11].getIcon() == shape)
				{
					timer[11] = new Timer();
					bTimer[11] = new Timer();
					lTimer[11] = new Timer();
					
					btn[11].setIcon(dough);
					timer[11].schedule(new job11(), speed_time-3000);
					bTimer[11].schedule(new bJob11(), (speed_time-3000)*2);
					lTimer[11].schedule(new lJob11(), ((speed_time-3000)*2)*2);
				}
				else 
				{
					if(btn[11].getIcon() == dough || btn[11].getIcon() == fail) {
						score -= 10;
						if(score < 0) {
							new gameOver();
						}
						btn[11].setIcon(shape);
					}
					else if(btn[11].getIcon() == lol) {
						btn[11].setIcon(lol);
					}
					else {
						score += 10;
						if(score < 0) {
							new gameOver();
						}
						btn[11].setIcon(shape);
					}
					textLabel.setText("Score :" +Integer.toString(score));
				}
			}
		});
		
		textLabel = new JLabel();
		textLabel.setFont(new Font("3D", 0, 30));
		textLabel.setSize(500,100);
		textLabel.setText("Score : " + score);
		
		contentPane.add(textLabel);	// 점수
						
		contentPane.add(panel[0]);	// 0번째 빈거

		panel[1].add(btn[0]);
		panel[1].add(btn[1]);
		panel[1].add(btn[2]);
		contentPane.add(panel[1]);	// 1번째 따따따
		
		panel[2].add(btn[3]);
		panel[2].add(btn[4]);
		panel[2].add(btn[5]);
		contentPane.add(panel[2]);	// 2번째 따따따
		
		panel[3].add(btn[6]);
		panel[3].add(btn[7]);
		panel[3].add(btn[8]);
		contentPane.add(panel[3]);	// 3번째 따따따
		
		panel[4].add(btn[9]);
		panel[4].add(btn[10]);
		panel[4].add(btn[11]);
		contentPane.add(panel[4]);	// 4번째 따따따
		
		
		for(int k = 0 ; k < 12 ; k++)
			contentPane.add(btn[k]);
	
		setSize(455, 800);
		
		Dimension frameSize = this.getSize();	// frame 크기 구하기
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();	// 내 모니터 크기 구하기
		this.setLocation((screenSize.width - frameSize.width)/2, (screenSize.height - frameSize.height)/2);
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Title();
	}
	
}
