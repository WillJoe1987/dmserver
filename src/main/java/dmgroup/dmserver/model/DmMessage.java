package dmgroup.dmserver.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the dm_message database table.
 * 
 */
@Entity
@Table(name="dm_message")
@NamedQuery(name="DmMessage.findAll", query="SELECT d FROM DmMessage d")
public class DmMessage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Lob
	private String content;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	@Column(name="from_user_id")
	private String fromUserId;

	@Id
	@Column(name="message_id")
	private String messageId;

	@Column(name="station_id")
	private String stationId;

	@Column(name="to_user_id")
	private String toUserId;

	public DmMessage() {
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

	public String getFromUserId() {
		return this.fromUserId;
	}

	public void setFromUserId(String fromUserId) {
		this.fromUserId = fromUserId;
	}

	public String getMessageId() {
		return this.messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public String getStationId() {
		return this.stationId;
	}

	public void setStationId(String stationId) {
		this.stationId = stationId;
	}

	public String getToUserId() {
		return this.toUserId;
	}

	public void setToUserId(String toUserId) {
		this.toUserId = toUserId;
	}

}