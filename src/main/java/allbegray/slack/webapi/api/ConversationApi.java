package allbegray.slack.webapi.api;

import allbegray.slack.type.History;

public interface ConversationApi {

    History getConversationHistory(String channel, String latest, String oldest, boolean inclusive, int count, boolean unreads, String cursor);

}
