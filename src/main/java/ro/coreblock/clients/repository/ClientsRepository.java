package ro.coreblock.clients.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import ro.coreblock.clients.model.Clients;

import java.util.UUID;

@Repository
public interface ClientsRepository extends ReactiveCrudRepository<Clients, UUID> {
}
