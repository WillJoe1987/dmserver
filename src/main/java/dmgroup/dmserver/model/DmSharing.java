package dmgroup.dmserver.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the dm_sharing database table.
 * 
 */
@Entity
@Table(name="dm_sharing")
@NamedQuery(name="DmSharing.findAll", query="SELECT d FROM DmSharing d")
public class DmSharing implements Serializable {
	private static final long serialVersionUID = 1L;

	@Lob
	private String content;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	private String href;

	@Id
	@Column(name="sharing_id")
	private String sharingId;

	@Column(name="station_id")
	private String stationId;

	private String type;

	@Column(name="user_id")
	private String userId;

	public DmSharing() {
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getHref() {
		return this.href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public String getSharingId() {
		return this.sharingId;
	}

	public void setSharingId(String sharingId) {
		this.sharingId = sharingId;
	}

	public String getStationId() {
		return this.stationId;
	}

	public void setStationId(String stationId) {
		this.stationId = stationId;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}