package lt.itakademija.model.command;

import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

/**
 * Created by mariusg on 2017.03.19.
 */
@Component
public final class UpdateContact {
	@NotNull
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
