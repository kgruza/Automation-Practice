package data.models.user;

import lombok.Data;

@Data
public class LoginCredentials {
    private String email, password;

    public LoginCredentials(String email, String password) {
        this.email = email;
        this.password = password;
    }

}
