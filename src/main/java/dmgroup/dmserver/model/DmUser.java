package dmgroup.dmserver.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the dm_user database table.
 * 
 */
@Entity
@Table(name="dm_user")
@NamedQuery(name="DmUser.findAll", query="SELECT d FROM DmUser d")
public class DmUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="avatar_url")
	private String avatarUrl;

	private String city;

	private String country;

	private String gender;

	private String language;

	private String mobile;

	@Column(name="nick_name")
	private String nickName;

	@Column(name="open_id")
	private String openId;

	private String province;

	@Id
	@Column(name="user_id")
	private String userId;

	public DmUser() {
	}

	public String getAvatarUrl() {
		return this.avatarUrl;
	}

	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getNickName() {
		return this.nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getOpenId() {
		return this.openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}