package co.com.bancolombia.bancolombiaservice;

import co.com.bancolombia.model.person.Person;
import co.com.bancolombia.model.person.gateways.PersonService;
import reactor.core.CoreSubscriber;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class ApiService implements PersonService {

    @Override
    public Mono<Person> getPerson(String id) {
        return Mono.just(Person.builder().id(id).balance(1000000f).build());
    }

    @Override
    public Mono<Float> getBalance(String id) {
        return Mono.just(100000f);
    }

    @Override
    public Flux<Person> getPersons() {
        return null;
    }


}
