package dmgroup.dmserver.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the dm_stations database table.
 * 
 */
@Entity
@Table(name="dm_stations")
@NamedQuery(name="DmStation.findAll", query="SELECT d FROM DmStation d")
public class DmStation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="city_id")
	private String cityId;

	@Column(name="line_id")
	private String lineId;

	@Id
	@Column(name="station_id")
	private String stationId;

	@Column(name="station_lat")
	private double stationLat;

	@Column(name="station_lon")
	private double stationLon;

	@Column(name="station_name")
	private String stationName;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="update_date")
	private Date updateDate;

	public DmStation() {
	}

	public String getCityId() {
		return this.cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public String getLineId() {
		return this.lineId;
	}

	public void setLineId(String lineId) {
		this.lineId = lineId;
	}

	public String getStationId() {
		return this.stationId;
	}

	public void setStationId(String stationId) {
		this.stationId = stationId;
	}

	public double getStationLat() {
		return this.stationLat;
	}

	public void setStationLat(double stationLat) {
		this.stationLat = stationLat;
	}

	public double getStationLon() {
		return this.stationLon;
	}

	public void setStationLon(double stationLon) {
		this.stationLon = stationLon;
	}

	public String getStationName() {
		return this.stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

}