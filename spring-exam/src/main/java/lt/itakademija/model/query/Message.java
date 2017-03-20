package lt.itakademija.model.query;

import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

/**
 * Created by mariusg on 2017.03.19.
 */
@Component
public final class Message {
	@NotNull
    private Long id;
	@NotNull
    private String text;

    public Message(Long id, String text) {
        this.id = id;
        this.text = text;
    }

    public Long getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
