package co.com.bancolombia.usecase.person;

import co.com.bancolombia.model.person.Person;
import co.com.bancolombia.model.person.gateways.PersonService;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class PersonUseCase {
    private PersonService serviceGateway;
    public Mono<Person> getPerson(String id){
        /*
        Logica
         */
        return serviceGateway.getPerson(id);
    }

    public Mono<Float>getBalance(String id){
        return serviceGateway.getBalance(id);
    }
}
