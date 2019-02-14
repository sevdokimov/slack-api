package allbegray.slack.type;

public abstract class ResponseMetadataHolder {

    private ResponseMetadata response_metadata;

    public ResponseMetadata getResponse_metadata() {
        return response_metadata;
    }

    public void setResponse_metadata(ResponseMetadata response_metadata) {
        this.response_metadata = response_metadata;
    }
}
