package connectionInfo;

public class ShowResult extends CommandDate{
	private CommandDate command;
	private String state;
	public ShowResult(CommandDate command,String state) {
		super();
		this.command=command;
		this.state=state;
	}
	public CommandDate getCommand() {
		return command;
	}
	public String getState() {
		return state;
	}
	public void setCommand(CommandDate command) {
		this.command = command;
	}
	public void setState(String state) {
		this.state = state;
	}
}
