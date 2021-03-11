import com.fasterxml.jackson.annotation.JsonProperty;

public class AddBookResponse {
    @JsonProperty("ID")
    private String id;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @JsonProperty("Msg")
    private String msg;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
