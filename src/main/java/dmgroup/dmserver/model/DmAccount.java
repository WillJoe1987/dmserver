package dmgroup.dmserver.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the dm_account database table.
 * 
 */
@Entity
@Table(name="dm_account")
@NamedQuery(name="DmAccount.findAll", query="SELECT d FROM DmAccount d")
public class DmAccount implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="account_bal")
	private int accountBal;

	@Id
	@Column(name="account_id")
	private String accountId;

	@Column(name="has_get")
	private String hasGet;

	@Column(name="user_id")
	private String userId;

	public DmAccount() {
	}

	public int getAccountBal() {
		return this.accountBal;
	}

	public void setAccountBal(int accountBal) {
		this.accountBal = accountBal;
	}

	public String getAccountId() {
		return this.accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getHasGet() {
		return this.hasGet;
	}

	public void setHasGet(String hasGet) {
		this.hasGet = hasGet;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}