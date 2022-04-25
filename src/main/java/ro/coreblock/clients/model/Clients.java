package ro.coreblock.clients.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.domain.Persistable;

import java.io.Serializable;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class Clients implements Serializable, Persistable<UUID> {

    @Id
    private UUID uuid;

    private String password;

    private String email;

    @Override
    public UUID getId() {
        return uuid;
    }

    // always is true because i will always do updates with given uuid generated by third party
    @Override
    public boolean isNew() {
        return true;
    }
}
