package wtf.dpt.liteauth.backend.dtos;

import lombok.Data;

@Data
public class CreateAccountRequest {

    private String name;
    private String email;
    private String secret;
}
