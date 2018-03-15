package cn.jxc.pojo;
// Generated 2018-3-14 20:32:32 by Hibernate Tools 5.2.8.Final

import java.util.Date;

/**
 * Backsales generated by hbm2java
 */
public class BackSales implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int bsaId;
	private int customerId;
	private Date requestDate;
	private int reviewEmp;
	private String reviewState;
	private String backNum;
	private String backReason;

	public BackSales() {
	}

	public BackSales(int bsaId, int customerId, int reviewEmp) {
		this.bsaId = bsaId;
		this.customerId = customerId;
		this.reviewEmp = reviewEmp;
	}

	public BackSales(int bsaId, int customerId, Date requestDate, int reviewEmp, String reviewState, String backNum,
			String backReason) {
		this.bsaId = bsaId;
		this.customerId = customerId;
		this.requestDate = requestDate;
		this.reviewEmp = reviewEmp;
		this.reviewState = reviewState;
		this.backNum = backNum;
		this.backReason = backReason;
	}

	public int getBsaId() {
		return this.bsaId;
	}

	public void setBsaId(int bsaId) {
		this.bsaId = bsaId;
	}

	public int getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public Date getRequestDate() {
		return this.requestDate;
	}

	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}

	public int getReviewEmp() {
		return this.reviewEmp;
	}

	public void setReviewEmp(int reviewEmp) {
		this.reviewEmp = reviewEmp;
	}

	public String getReviewState() {
		return this.reviewState;
	}

	public void setReviewState(String reviewState) {
		this.reviewState = reviewState;
	}

	public String getBackNum() {
		return this.backNum;
	}

	public void setBackNum(String backNum) {
		this.backNum = backNum;
	}

	public String getBackReason() {
		return this.backReason;
	}

	public void setBackReason(String backReason) {
		this.backReason = backReason;
	}

}
