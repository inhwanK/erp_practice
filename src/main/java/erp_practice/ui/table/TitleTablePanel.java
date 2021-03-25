package erp_practice.ui.table;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.util.List;

import javax.swing.JTable;

import erp_practice.dto.Title;
import erp_practice.service.TitleService;

import javax.swing.JScrollPane;

public class TitleTablePanel extends JPanel {
	private String[] columnNames = {"직책코드","직책명"};
//	private Object[][] data = {
//			{1,"사장"},
//			{2,"부장"},
//			{3,"과장"},
//			{4,"대장"},
//			{5,"사원"},
//	};
	
	
	private Object[][] data;
	private JTable table;
	private TitleService service;
	private List<Title> list = service.showTitles();
	
	public TitleTablePanel() {

		initialize();
	}
	private void initialize() {
		
		setLayout(new BorderLayout(0, 0));
		
		table = new JTable(data, columnNames);
		add(table, BorderLayout.NORTH);
	}
	
	private void setList(){
		service = new TitleService();
		data = new Object[list.size()][];
		for(int i=0;i<data.length;i++) {
			data[i] = toArray(list.get(i));
		}
		// 모델 관련해 더 추가가 필요함.
	}
	private Object[] toArray(Title title) {
		return new Object[] {title.gettNo(),title.gettName()};
	}

}
