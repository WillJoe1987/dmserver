package dmgroup.dmserver.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;


/**
 * The persistent class for the dm_city database table.
 * 
 */
@Entity
@Table(name="dm_city")
@NamedQuery(name="DmCity.findAll", query="SELECT d FROM DmCity d")
public class DmCity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="city_id")
	private String cityId;

	@Column(name="city_name")
	private String cityName;

	@Column(name="metro_pic")
	private String metroPic;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="update_date")
	private Date updateDate;

	public DmCity() {
	}

	public String getCityId() {
		return this.cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return this.cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getMetroPic() {
		return this.metroPic;
	}

	public void setMetroPic(String metroPic) {
		this.metroPic = metroPic;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

}