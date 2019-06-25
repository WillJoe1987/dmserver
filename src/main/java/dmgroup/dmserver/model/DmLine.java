package dmgroup.dmserver.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the dm_line database table.
 * 
 */
@Entity
@Table(name="dm_line")
@NamedQuery(name="DmLine.findAll", query="SELECT d FROM DmLine d")
public class DmLine implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="city_id")
	private String cityId;

	@Id
	@Column(name="line_id")
	private String lineId;

	@Column(name="line_name")
	private String lineName;

	@Column(name="line_pic")
	private String linePic;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="update_date")
	private Date updateDate;

	public DmLine() {
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

	public String getLineName() {
		return this.lineName;
	}

	public void setLineName(String lineName) {
		this.lineName = lineName;
	}

	public String getLinePic() {
		return this.linePic;
	}

	public void setLinePic(String linePic) {
		this.linePic = linePic;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

}