package connectionInfo;

import java.io.Serializable;
import java.util.Date;

public class CommandDate implements Serializable{
	private Date sendDate;//ͨ������

	public Date getSendDate() {
		return sendDate;
	}

	public void setSendDate(Date sendDate) {
		this.sendDate = sendDate;
	}
	
}
