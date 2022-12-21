package co.com.bancolombia.model.person.gateways;

import co.com.bancolombia.model.person.Person;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PersonService {
    Mono<Person> getPerson(String id);
    Mono<Float> getBalance(String id);

    Flux<Person> getPersons();

}
