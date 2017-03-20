package lt.itakademija.model.query;

import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

/**
 * Created by mariusg on 2017.03.19.
 */
@Component
public final class Contact {
	@NotNull
	private Long id;
	@NotNull
	private String username;
	@NotNull
	private String name;

	public Contact(Long id, String username, String name) {
		this.id = id;
		this.username = username;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Contact contact = (Contact) o;
		return Objects.equals(id, contact.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
}
