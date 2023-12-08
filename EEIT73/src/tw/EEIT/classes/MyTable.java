package tw.EEIT.classes;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MyTable extends JTable {
	private MyModel myModel;
	private FoodDB foodDb;
	
	public MyTable() {
		
		try {
			foodDb = new FoodDB();
			foodDb.queryDB();
		} catch (Exception e) {
			
		}
		
		myModel = new MyModel();
		setModel(myModel);
		myModel.setColumnIdentifiers(foodDb.getHeader());
		
	}
	
	
	
	private class MyModel extends DefaultTableModel{

		

		@Override
		public int getRowCount() {
			return foodDb.getRows();
		}

		@Override
		public int getColumnCount() {
			return foodDb.getCols();
		}

		@Override
		public Object getValueAt(int row, int column) {
			return foodDb.getData(row+1,column+1);
		}

		@Override
		public void setValueAt(Object aValue, int row, int column) {
			foodDb.updateDB(row+1,column+1,(String)aValue);
		}

		@Override
		public boolean isCellEditable(int row, int column) {
			boolean isEditable = true;
			if(column == 0) isEditable = false;
			return isEditable;
		}
		
	}
}
