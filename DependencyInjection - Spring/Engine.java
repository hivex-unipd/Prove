package hello;

import org.springframework.stereotype.Component;

@Component
public interface Engine {
	String toString();
	int cavalli();
}
