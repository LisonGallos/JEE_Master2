package api.model;

import java.util.Date;

public class Tournament {

	private String name;
	private Date fromDate;
	private Date toDate;
	private int minLevel;
	private int maxLevel;
	
	@ManyToOne
    private OnlinePortal onlinePortal;
	
	public OnlinePortal getOnlinePortal() {
		return onlinePortal;
	}

	public void setOnlinePortal(OnlinePortal onlinePortal) {
		this.onlinePortal = onlinePortal;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public Date getToDate() {
		return toDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	public int getMinLevel() {
		return minLevel;
	}
	public void setMinLevel(int minLevel) {
		this.minLevel = minLevel;
	}
	public int getMaxLevel() {
		return maxLevel;
	}
	public void setMaxLevel(int maxLevel) {
		this.maxLevel = maxLevel;
	}
}
