/*---------------------- Create Model ----------------------*/
package nosi.webapps.gestao_de_recursos_humanos.pages.t_jobslist;

import nosi.core.gui.components.IGRPTable;
import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import java.util.ArrayList;
import java.util.List;

public class T_jobsList extends Model{		
	
	private List<Table_1> table_1 = new ArrayList<>();	
	public void setTable_1(List<Table_1> table_1){
		this.table_1 = table_1;
	}
	public List<Table_1> getTable_1(){
		return this.table_1;
	}



	public static class Table_1 extends IGRPTable.Table{
		private Integer job_id;
		private String job_title;
		private String min_salary;
		private String max_salary;
		public void setJob_id(Integer job_id){
			this.job_id = job_id;
		}
		public Integer getJob_id(){
			return this.job_id;
		}

		public void setJob_title(String job_title){
			this.job_title = job_title;
		}
		public String getJob_title(){
			return this.job_title;
		}

		public void setMin_salary(String min_salary){
			this.min_salary = min_salary;
		}
		public String getMin_salary(){
			return this.min_salary;
		}

		public void setMax_salary(String max_salary){
			this.max_salary = max_salary;
		}
		public String getMax_salary(){
			return this.max_salary;
		}

	}

	public void loadTable_1(BaseQueryInterface query) {
		this.setTable_1(this.loadTable(query,Table_1.class));
	}

}
/*-------------------------*/