package ro.coreblock.clients.service.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import ro.coreblock.clients.model.Clients;
import ro.coreblock.clients.repository.ClientsRepository;
import ro.coreblock.clients.service.ClientsService;

import java.util.Optional;
import java.util.UUID;

@Service
public record ClientsServiceImpl(ClientsRepository clientsRepository)
        implements ClientsService {

    @Override
    public ResponseEntity<Mono<Boolean>> validateUser(UUID uuid, String password) {
        return ResponseEntity.ok(
                Mono.just(!Optional.of(clientsRepository.findById(uuid)
                                .filter(clients -> clients.getPassword().equals(password)))
                .orElse(Mono.empty())
                .equals(Mono.empty())));

    }

    @Override
    public ResponseEntity<Mono<Boolean>> saveClient(Clients clients) {
        clientsRepository.save(clients).subscribe();
        return ResponseEntity.ok(Mono.just(Boolean.TRUE));
    }
}
