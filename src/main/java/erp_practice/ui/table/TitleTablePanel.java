package erp_practice.ui.table;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class TitleTablePanel extends JPanel {
	private String[] columnNames = {"직책코드","직책명"};
	private Object[][] data = {
			{1,"사장"},
			{2,"부장"},
			{3,"과장"},
			{4,"대장"},
			{5,"사원"},
	};
	private JTable table;
	
	public TitleTablePanel() {

		initialize();
	}
	private void initialize() {
		
		setLayout(new BorderLayout(0, 0));
		
		table = new JTable(data, columnNames);
		add(table, BorderLayout.NORTH);
	}

}
