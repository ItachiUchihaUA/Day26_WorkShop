
public class Hotel {
	private String name;
	private Integer weekdayRegularRate;
	private Integer weekdayRewardedRate;
	private Integer weekendRegularRate;
	private Integer weekendRewardedRate;
	private Integer rating;
	public String getName() {
		return name;
	}
	public Hotel() {};
	public Hotel(String name, Integer weekdayRegularRate, Integer weekdayRewardedRate, Integer weekendRegularRate,
			Integer weekendRewardedRate, Integer rating) {
		super();
		this.name = name;
		this.weekdayRegularRate = weekdayRegularRate;
		this.weekdayRewardedRate = weekdayRewardedRate;
		this.weekendRegularRate = weekendRegularRate;
		this.weekendRewardedRate = weekendRewardedRate;
		this.rating = rating;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getWeekdayRegularRate() {
		return weekdayRegularRate;
	}
	public void setWeekdayRegularRate(Integer weekdayRegularRate) {
		this.weekdayRegularRate = weekdayRegularRate;
	}
	public Integer getWeekdayRewardedRate() {
		return weekdayRewardedRate;
	}
	public void setWeekdayRewardedRate(Integer weekdayRewardedRate) {
		this.weekdayRewardedRate = weekdayRewardedRate;
	}
	public Integer getWeekendRegularRate() {
		return weekendRegularRate;
	}
	public void setWeekendRegularRate(Integer weekendRegularRate) {
		this.weekendRegularRate = weekendRegularRate;
	}
	public Integer getWeekendRewardedRate() {
		return weekendRewardedRate;
	}
	public void setWeekendRewardedRate(Integer weekendRewardedRate) {
		this.weekendRewardedRate = weekendRewardedRate;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	
}
