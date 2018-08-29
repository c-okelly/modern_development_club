package hello;

import org.springframework.web.util.HtmlUtils;

public class Message {

    private String username;
    private String content;

    public Message(){
    }

    public Message(String name, String content) {
        this.username = name;
        this.content = content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return HtmlUtils.htmlEscape(content);
    }

    public String getUsername() {
        return HtmlUtils.htmlEscape(username);
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
