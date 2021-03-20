package erp_practice.ui.content;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class TitlePanel extends JPanel {
	private JTextField tftNo;
	private JTextField tftName;

	/**
	 * Create the panel.
	 */
	public TitlePanel() {

		initialize();
	}
	private void initialize() {
		setBorder(new TitledBorder(null, "\uC9C1\uCC45 \uC815\uBCF4", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setLayout(new GridLayout(0, 2, 10, 10));
		
		JLabel lbltNo = new JLabel("직책코드");
		lbltNo.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lbltNo);
		
		tftNo = new JTextField();
		add(tftNo);
		tftNo.setColumns(10);
		
		JLabel lbltName = new JLabel("직책명");
		lbltName.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lbltName);
		
		tftName = new JTextField();
		add(tftName);
		tftName.setColumns(10);
	}

}
