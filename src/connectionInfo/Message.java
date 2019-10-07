package connectionInfo;

public class Message extends CommandDate{
	private String form;
	private String to;
	private String message;
	public String getForm() {
		return form;
	}
	public String getTo() {
		return to;
	}
	public String getMessage() {
		return message;
	}
	public void setForm(String form) {
		this.form = form;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
