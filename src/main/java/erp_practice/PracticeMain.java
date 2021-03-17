package erp_practice;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import erp_practice.ui.TitleManagingUI;

import java.awt.GridLayout;
import java.io.File;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PracticeMain extends JFrame implements ActionListener {

	private String imagePath = System.getProperty("user.dir") + File.separator + "Image" + File.separator;
	private ImageIcon logo = new ImageIcon(imagePath + "엠블럼.png");
	private JPanel contentPane;
	private JLabel lblImg;
	private JButton btnTitleManaging;
	private JButton btnDeptManaging;
	private JButton btnEmpManaging;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PracticeMain frame = new PracticeMain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PracticeMain() {
		initialize();
	}
	private void initialize() {
		setTitle("연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(2, 0, 0, 0));
		
		// 로고를 넣은 윗패널
		JPanel pLogo = new JPanel();
		contentPane.add(pLogo);
		pLogo.setLayout(new GridLayout(0, 1, 0, 0));
		
		lblImg = new JLabel();
		lblImg.setIcon(logo);
		lblImg.setHorizontalAlignment(SwingConstants.CENTER);
		pLogo.add(lblImg);
		
		JPanel pManager = new JPanel();
		contentPane.add(pManager);
		pManager.setLayout(new GridLayout(0, 3, 0, 0));
		
		
		// 관리 버튼들이 들어간 아래 패널
		btnTitleManaging = new JButton("직책 관리");
		btnTitleManaging.addActionListener(this);
		pManager.add(btnTitleManaging);
		
		btnDeptManaging = new JButton("부서 관리");
		btnDeptManaging.addActionListener(this);
		pManager.add(btnDeptManaging);
		
		btnEmpManaging = new JButton("직원 관리");
		btnEmpManaging.addActionListener(this);
		pManager.add(btnEmpManaging);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnEmpManaging) {
			actionPerformedBtnEmpManaging(e);
		}
		if (e.getSource() == btnDeptManaging) {
			actionPerformedBtnDeptManaging(e);
		}
		if (e.getSource() == btnTitleManaging) {
			actionPerformedBtnTitleManaging(e);
		}
	}
	protected void actionPerformedBtnTitleManaging(ActionEvent e) {
		TitleManagingUI frame = new TitleManagingUI();
		frame.setVisible(true);
	}
	protected void actionPerformedBtnDeptManaging(ActionEvent e) {
		
	}
	
	protected void actionPerformedBtnEmpManaging(ActionEvent e) {
		
	}
}
