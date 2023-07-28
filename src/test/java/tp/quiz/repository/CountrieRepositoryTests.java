package tp.quiz.repository;

import java.util.Optional;
import org.junit.jupiter.api.Test;
import tp.quiz.entity.Countrie;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootTest
public class CountrieRepositoryTests {
	@Autowired
	private CountrieRepository repository;

	@Test
	public void getCountrie() {
		Optional<Countrie> o = repository.findById(1);
		assertEquals(o.isEmpty(), false);
		Countrie c = o.get();
		assertEquals(c.name, "Serbia");
		assertEquals(c.capital, "Belgrade");
	}
}
