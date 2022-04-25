package ro.coreblock.clients.service;

import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Mono;
import ro.coreblock.clients.model.Clients;

import java.util.UUID;

public interface ClientsService {

    ResponseEntity<Mono<Boolean>> validateUser(UUID uuid, String password);

    ResponseEntity<Mono<Boolean>> saveClient(Clients clients);
}
