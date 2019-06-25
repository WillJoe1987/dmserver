package dmgroup.dmserver.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the dm_announcement database table.
 * 
 */
@Entity
@Table(name="dm_announcement")
@NamedQuery(name="DmAnnouncement.findAll", query="SELECT d FROM DmAnnouncement d")
public class DmAnnouncement implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="announcement_id")
	private String announcementId;

	@Lob
	private String content;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	@Column(name="station_id")
	private String stationId;

	private String type;

	@Column(name="user_id")
	private String userId;

	public DmAnnouncement() {
	}

	public String getAnnouncementId() {
		return this.announcementId;
	}

	public void setAnnouncementId(String announcementId) {
		this.announcementId = announcementId;
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