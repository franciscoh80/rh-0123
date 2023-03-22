package nosi.webapps.gestao_de_recursos_humanos.dao;

import nosi.base.ActiveRecord.BaseActiveRecord;
import javax.validation.constraints.NotNull;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.NamedQuery;
import javax.persistence.GeneratedValue;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotBlank;
import javax.persistence.GenerationType;
import java.time.LocalDate;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * @author: Nositeste 20-03-2023
*/

@Entity
@Table(name = "t_vacation_map", schema = "public")
@NamedQuery(name = "TVacationMap.findAll", query = "SELECT t FROM TVacationMap t")
public class TVacationMap extends BaseActiveRecord<TVacationMap> {

	private static final long serialVersionUID = 1L;

	// Change Integer type to BigDecimal if the number is very large!

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "vacation_map_id", nullable = false, updatable = false)
 	private Integer vacationMapId;
	@NotNull
	@ManyToOne
	@JoinColumn(name = "employee_id", foreignKey = @ForeignKey(name = "t_vacation_map_employee_fk"), referencedColumnName="employee_id")
	private TEmployees employeeId;
	@NotBlank
	@Size(min = 1, max = 4)
	@Column(name = "year")
	private String year;
	@Column(name = "start_date_1")
	private LocalDate startDate1;
	@Column(name = "days_1")
	private Integer days1;
	@Column(name = "start_date_2")
	private LocalDate startDate2;
	@Column(name = "days_2")
	private Integer days2;
	@Column(name = "start_date_3")
	private LocalDate startDate3;
	@Column(name = "days_3")
	private Integer days3;
	@Column(name = "start_date_4")
	private LocalDate startDate4;
	@Column(name = "days_4")
	private Integer days4;
	@Column(name = "transported_days")
	private Integer transportedDays;

	public Integer getVacationMapId() { 
		return this.vacationMapId;
	}

	public void setVacationMapId(Integer vacationMapId) {
		 this.vacationMapId = vacationMapId;
	}

	public TEmployees getEmployeeId() { 
		return this.employeeId;
	}

	public void setEmployeeId(TEmployees employeeId) {
		 this.employeeId = employeeId;
	}

	public String getYear() { 
		return this.year;
	}

	public void setYear(String year) {
		 this.year = year;
	}

	public LocalDate getStartDate1() { 
		return this.startDate1;
	}

	public void setStartDate1(LocalDate startDate1) {
		 this.startDate1 = startDate1;
	}

	public Integer getDays1() { 
		return this.days1;
	}

	public void setDays1(Integer days1) {
		 this.days1 = days1;
	}

	public LocalDate getStartDate2() { 
		return this.startDate2;
	}

	public void setStartDate2(LocalDate startDate2) {
		 this.startDate2 = startDate2;
	}

	public Integer getDays2() { 
		return this.days2;
	}

	public void setDays2(Integer days2) {
		 this.days2 = days2;
	}

	public LocalDate getStartDate3() { 
		return this.startDate3;
	}

	public void setStartDate3(LocalDate startDate3) {
		 this.startDate3 = startDate3;
	}

	public Integer getDays3() { 
		return this.days3;
	}

	public void setDays3(Integer days3) {
		 this.days3 = days3;
	}

	public LocalDate getStartDate4() { 
		return this.startDate4;
	}

	public void setStartDate4(LocalDate startDate4) {
		 this.startDate4 = startDate4;
	}

	public Integer getDays4() { 
		return this.days4;
	}

	public void setDays4(Integer days4) {
		 this.days4 = days4;
	}

	public Integer getTransportedDays() {
		return transportedDays;
	}

	public void setTransportedDays(Integer transportedDays) {
		this.transportedDays = transportedDays;
	}

}