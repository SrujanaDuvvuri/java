package messageprinterproj;

public class DBMessageProvider implements IMessageProvider{

	@Override
	public String fetchMessage() {
		return "DB :Interfaces make Java API's flexible";
	}

}
