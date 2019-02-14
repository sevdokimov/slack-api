package allbegray.slack.webapi.method.channels;

import allbegray.slack.webapi.SlackWebApiConstants;
import allbegray.slack.webapi.method.AbstractHistoryMethod;
import com.fasterxml.jackson.annotation.JsonInclude;

public class ConversationHistoryMethod extends AbstractHistoryMethod {

	@JsonInclude(JsonInclude.Include.NON_NULL)
	protected String cursor;

	public ConversationHistoryMethod(String channel) {
		super(channel);
	}

	@Override
	public String getMethodName() {
		return SlackWebApiConstants.CONVERSATIONS_HISTORY;
	}

	public String getCursor() {
		return cursor;
	}

	public void setCursor(String cursor) {
		this.cursor = cursor;
	}
}
