package dev.mirrex.spring.service;

import dev.mirrex.spring.database.entity.Company;
import dev.mirrex.spring.database.repository.CrudRepository;
import dev.mirrex.spring.database.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final CrudRepository<Integer, Company> companyRepository;

    public UserService(UserRepository userRepository,
                       CrudRepository<Integer, Company> companyRepository) {
        this.userRepository = userRepository;
        this.companyRepository = companyRepository;
    }
}
