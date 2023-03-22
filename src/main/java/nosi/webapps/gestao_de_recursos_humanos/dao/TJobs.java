package nosi.webapps.gestao_de_recursos_humanos.dao;

import javax.validation.constraints.Size;
import javax.validation.constraints.NotBlank;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import nosi.base.ActiveRecord.BaseActiveRecord;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import java.math.BigDecimal;
import javax.persistence.GenerationType;

/**
 * @author: Nositeste 01-03-2023
*/

@Entity
@Table(name = "t_jobs", schema = "public")
@NamedQuery(name = "TJobs.findAll", query = "SELECT t FROM TJobs t")
public class TJobs extends BaseActiveRecord<TJobs> {

	private static final long serialVersionUID = 1L;

	// Change Integer type to BigDecimal if the number is very large!

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "job_id", nullable = false, updatable = false)
 	private Integer jobId;
	@NotBlank
	@Size(min = 1, max = 35)
	@Column(name = "job_title")
	private String jobTitle;
	@Column(name = "min_salary")
	private BigDecimal minSalary;
	@Column(name = "max_salary")
	private BigDecimal maxSalary;

	public Integer getJobId() { 
		return this.jobId;
	}

	public void setJobId(Integer jobId) {
		 this.jobId = jobId;
	}

	public String getJobTitle() { 
		return this.jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		 this.jobTitle = jobTitle;
	}

	public BigDecimal getMinSalary() { 
		return this.minSalary;
	}

	public void setMinSalary(BigDecimal minSalary) {
		 this.minSalary = minSalary;
	}

	public BigDecimal getMaxSalary() { 
		return this.maxSalary;
	}

	public void setMaxSalary(BigDecimal maxSalary) {
		 this.maxSalary = maxSalary;
	}

}