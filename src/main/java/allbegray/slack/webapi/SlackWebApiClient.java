package allbegray.slack.webapi;

import allbegray.slack.type.Authentication;
import allbegray.slack.type.Bot;
import allbegray.slack.type.OAuthAccessToken;
import allbegray.slack.webapi.api.*;

import java.util.Map;

public interface SlackWebApiClient extends
    ChannelsApi,
    ChatApi,
    DndApi,
    FilesApi,
    GroupsApi,
    ConversationApi,
    ImApi,
    MpimApi,
    PinsApi,
    ReactionsApi,
    RemindersApi,
    RtmApi,
    StarsApi,
    TeamApi,
    UserGroupsApi,
    UsersApi {

    void shutdown();

    void setWebApiUrl(String webApiUrl);

    String getWebApiUrl();

    Authentication auth();

    Bot getBotInfo(String bot);

    Map<String, String> getEmojiList();

    OAuthAccessToken accessOAuth(String client_id, String client_secret, String code, String redirect_uri);

}
