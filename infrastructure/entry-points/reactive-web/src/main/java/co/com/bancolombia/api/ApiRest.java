package co.com.bancolombia.api;

import co.com.bancolombia.model.person.Person;
import co.com.bancolombia.usecase.person.PersonUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.nio.file.attribute.UserDefinedFileAttributeView;

@RestController
@RequestMapping("/persons")
public class ApiRest {

    @Autowired
    private PersonUseCase useCase;

    @GetMapping
    public ResponseEntity<Flux<Person>> getPersons(){
        return ResponseEntity.ok().body(useCase.getPersons());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Mono<Person>> getPerson(@PathVariable String id){
        return ResponseEntity.ok().body(useCase.getPerson(id));
    }

    public ResponseEntity<Mono<Float>> getBalance(@PathVariable String id){
        return ResponseEntity.ok().body(useCase.getBalance(id));
    }

}
