package wtf.dpt.liteauth.backend.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import wtf.dpt.liteauth.backend.dtos.CreateAccountRequest;

@RestController
@RequestMapping("/account")
public class AccountController {

    @PostMapping("/create")
    public ResponseEntity<Void> createAccount(
            @RequestBody CreateAccountRequest request
    ) {
        //todo: impl
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }

    @PostMapping("/update")
    public ResponseEntity<Void> updateAccount(
            @RequestBody CreateAccountRequest request
    ) {
        //todo: impl
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteAccount(
            @RequestParam String id,
            @RequestBody String secret
    ) {
        //todo: impl
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }
}
