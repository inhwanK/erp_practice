package erp_practice.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import erp_practice.ui.content.TitlePanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.CardLayout;

@SuppressWarnings("serial")
public class TitleManagingUI extends JFrame {

	private JPanel contentPane;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TitleManagingUI frame = new TitleManagingUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public TitleManagingUI() {
		initialize();
	}
	private void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 526, 403);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel label = new JLabel("");
		
		JLabel label_1 = new JLabel("");
		contentPane.setLayout(new GridLayout(2, 1, 0, 0));
		
		JPanel pTop = new JPanel();
		contentPane.add(pTop);
		pTop.setLayout(new BorderLayout(0, 0));
		
		TitlePanel pTitle = new TitlePanel();
		pTop.add(pTitle, BorderLayout.CENTER);
		
		JPanel pBtn = new JPanel();
		pTop.add(pBtn, BorderLayout.SOUTH);
		pBtn.setLayout(new GridLayout(1, 1, 0, 0));
		
		JButton btnAdd = new JButton("추가");
		pBtn.add(btnAdd);
		
		JButton btnCancel = new JButton("취소");
		pBtn.add(btnCancel);
		
		JPanel pCenter = new JPanel();
		contentPane.add(pCenter);
		pCenter.setLayout(new BorderLayout(0, 0));
		
		JPanel pTable = new JPanel();
		pCenter.add(pTable, BorderLayout.CENTER);
	}

}
