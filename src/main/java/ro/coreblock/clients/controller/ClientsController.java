package ro.coreblock.clients.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;
import ro.coreblock.clients.model.Clients;
import ro.coreblock.clients.service.ClientsService;

import java.util.UUID;

@RestController
@RequestMapping("/api/clients/v1")
public record ClientsController(ClientsService clientsService) {

    @GetMapping("/{uuid}")
    @ResponseBody
    public ResponseEntity<Mono<Boolean>> validPassword(@PathVariable UUID uuid, @RequestBody String password) {
        return clientsService.validateUser(uuid, password);
    }

    @PatchMapping
    @ResponseBody
    public ResponseEntity<Mono<Boolean>> saveClientPatch(@RequestBody Clients clients) {
        return clientsService.saveClient(clients);
    }


    @PostMapping
    @ResponseBody
    public ResponseEntity<Mono<Boolean>> saveClientPost(@RequestBody Clients clients) {
        return clientsService.saveClient(clients);
    }


    @PutMapping
    @ResponseBody
    public ResponseEntity<Mono<Boolean>> saveClientPut(@RequestBody Clients clients) {
        return clientsService.saveClient(clients);
    }
}
