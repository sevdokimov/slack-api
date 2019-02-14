package allbegray.slack.webapi.method.channels;

import allbegray.slack.webapi.SlackWebApiConstants;
import allbegray.slack.webapi.method.AbstractHistoryMethod;

public class ConversationHistoryMethod extends AbstractHistoryMethod {

	public ConversationHistoryMethod(String channel) {
		super(channel);
	}

	@Override
	public String getMethodName() {
		return SlackWebApiConstants.CONVERSATIONS_HISTORY;
	}
}
