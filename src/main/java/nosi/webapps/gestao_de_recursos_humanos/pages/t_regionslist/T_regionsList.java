/*---------------------- Create Model ----------------------*/
package nosi.webapps.gestao_de_recursos_humanos.pages.t_regionslist;

import nosi.core.gui.components.IGRPTable;
import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import java.util.ArrayList;
import java.util.List;

public class T_regionsList extends Model{		
	
	private List<Table_1> table_1 = new ArrayList<>();	
	public void setTable_1(List<Table_1> table_1){
		this.table_1 = table_1;
	}
	public List<Table_1> getTable_1(){
		return this.table_1;
	}



	public static class Table_1 extends IGRPTable.Table{
		private Integer region_id;
		private String region_name;
		public void setRegion_id(Integer region_id){
			this.region_id = region_id;
		}
		public Integer getRegion_id(){
			return this.region_id;
		}

		public void setRegion_name(String region_name){
			this.region_name = region_name;
		}
		public String getRegion_name(){
			return this.region_name;
		}

	}

	public void loadTable_1(BaseQueryInterface query) {
		this.setTable_1(this.loadTable(query,Table_1.class));
	}

}
/*-------------------------*/