package lt.itakademija.model.command;

import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

/**
 * Created by mariusg on 2017.03.19.
 */
@Component
public final class CreateContact {
	@NotNull
    private String username;
	@NotNull
    private String name;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CreateContact{");
        sb.append("username='").append(username).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
