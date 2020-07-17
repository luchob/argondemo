package eu.balev.argondemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class ArgondemoApplicationInit implements CommandLineRunner {

  final PasswordEncoder passwordEncoder;

  public ArgondemoApplicationInit(PasswordEncoder passwordEncoder) {
    this.passwordEncoder = passwordEncoder;
  }

  @Override
  public void run(String... args) throws Exception {
    System.out.println(passwordEncoder.encode("topsecret"));
  }
}
