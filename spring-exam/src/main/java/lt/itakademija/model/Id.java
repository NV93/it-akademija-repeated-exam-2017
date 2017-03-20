package lt.itakademija.model;

import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

/**
 * Created by mariusg on 2017.03.19.
 */
@Component
public final class Id {
	@NotNull
    private final Long id;

    public Id(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

}
