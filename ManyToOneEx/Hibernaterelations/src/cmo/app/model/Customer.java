package cmo.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.SecondaryTables;
import javax.persistence.Table;

@Entity
@Table(name="custmaintab")
@SecondaryTables({
	@SecondaryTable(name="secondary"), 
	@SecondaryTable(name="custInfotab",
	pkJoinColumns=@PrimaryKeyJoinColumn(name="cidfk"))
	})
public class Customer {
	@Id
	@Column(name="cid")
	
	private int cusId;
	@Column(name="code")
	private String custCode;
	@Column(name="cpoints")
	private double custPoints;
	public Customer() {
		super();
	
	}
	public int getCusId() {
		return cusId;
	}
	public void setCusId(int cusId) {
		this.cusId = cusId;
	}
	public String getCustCode() {
		return custCode;
	}
	public void setCustCode(String custCode) {
		this.custCode = custCode;
	}
	public double getCustPoints() {
		return custPoints;
	}
	public void setCustPoints(double custPoints) {
		this.custPoints = custPoints;
	}
	public double getTotalRewards() {
		return totalRewards;
	}
	public void setTotalRewards(double totalRewards) {
		this.totalRewards = totalRewards;
	}
	public double getRedmeeRwds() {
		return redmeeRwds;
	}
	public void setRedmeeRwds(double redmeeRwds) {
		this.redmeeRwds = redmeeRwds;
	}
	public int getCibilscor() {
		return Cibilscor;
	}
	public void setCibilscor(int cibilscor) {
		Cibilscor = cibilscor;
	}
    
	@Column(name="totalrw")
	private double totalRewards;
	@Column(name="redm")
	private double redmeeRwds;
	@Column(name="cibil")
	private  int Cibilscor;
	
	

}
