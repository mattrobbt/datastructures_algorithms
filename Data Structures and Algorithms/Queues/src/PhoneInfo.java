import java.util.Date;

/**
 * 
 */

/**
 * @author matthewrobb
 *
 */
public class PhoneInfo {
	private String CallerName;
	private String phoneNumber;
	private Date timeOfCall;
	/**
	 * @param args
	 */
	public PhoneInfo(){
		CallerName = "No Caller Name";
		phoneNumber = "No Phone Number";
		timeOfCall = null;
		
	}
	public PhoneInfo(String CallerName, String phoneNumber, Date timeOfCall) {
		this.CallerName = CallerName;
		this.phoneNumber = phoneNumber;
		this.timeOfCall = timeOfCall;
	}
	public String getCallerName() {
		return CallerName;
	}
	public void setCallerName(String callerName) {
		CallerName = callerName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Date getTimeOfCall() {
		return timeOfCall;
	}
	public void setTimeOfCall(Date timeOfCall) {
		this.timeOfCall = timeOfCall;
	}
	

}
