package co.com.tarjeta.controller;

import co.com.tarjeta.dto.AuthRequest;
import co.com.tarjeta.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JwtController {

    @Autowired
    private JwtUtil jwtUtil;
    @Autowired
    private AuthenticationManager authenticationManager;

    @GetMapping("/")
    public ResponseEntity welcome() {
        return ResponseEntity.ok("Bienvenido!!");
    }

    @PostMapping("/authenticate")
    public ResponseEntity generateToken(@RequestBody AuthRequest authRequest) throws Exception {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authRequest.getUserName(), authRequest.getPassword())
            );
        } catch (Exception ex) {
            throw new Exception("username/password no son correctos");
        }
        return ResponseEntity.ok(jwtUtil.generateToken(authRequest.getUserName()));
    }

}