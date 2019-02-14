package allbegray.slack.webapi.method;

import allbegray.slack.validation.Problem;
import allbegray.slack.validation.ValidationError;
import allbegray.slack.webapi.SlackWebApiConstants;

import java.util.List;
import java.util.Map;

public abstract class AbstractHistoryMethod extends AbstractMethod {

	public AbstractHistoryMethod(String channel) {
		this.channel = channel;
	}

	protected String channel;
	protected String cursor;
	protected String latest;
	protected String oldest;
	protected boolean inclusive;
	protected Integer count;
	protected boolean unreads;

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getCursor() {
		return cursor;
	}

	public void setCursor(String cursor) {
		this.cursor = cursor;
	}

	public String getLatest() {
		return latest;
	}

	public void setLatest(String latest) {
		this.latest = latest;
	}

	public String getOldest() {
		return oldest;
	}

	public void setOldest(String oldest) {
		this.oldest = oldest;
	}

	public boolean isInclusive() {
		return inclusive;
	}

	public void setInclusive(boolean inclusive) {
		this.inclusive = inclusive;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public boolean isUnreads() {
		return unreads;
	}

	public void setUnreads(boolean unreads) {
		this.unreads = unreads;
	}

	@Override
	public void validate(List<ValidationError> errors) {
		if (channel == null) {
			addError(errors, "channel", Problem.REQUIRED);
		}
		if (count != null && (count < 1 || count > 1000)) {
			addError(errors, "count", Problem.PATTERN_NOT_MATCH, "\"count\" must be between 1 and 1000.");
		}
	}

	@Override
	protected void createParameters(Map<String, String> parameters) {
		parameters.put("channel", channel);

		if (cursor != null) {
			parameters.put("cursor", cursor);
		}
		if (latest != null) {
			parameters.put("latest", latest);	
		}
		if (oldest != null) {
			parameters.put("oldest", oldest);	
		}
		if (inclusive) {
			parameters.put("inclusive", "1");	
		}
		parameters.put("count", count != null ? String.valueOf(count) : String.valueOf(SlackWebApiConstants.DEFAULT_COUNT));
		if (unreads) {
			parameters.put("unreads", "1");	
		}
	}

}
