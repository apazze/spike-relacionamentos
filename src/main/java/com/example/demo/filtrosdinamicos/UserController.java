package com.example.demo.filtrosdinamicos;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/user")
    public List<Users> buscar(String firstName){

        for(int i=1; i<101; i++){
            Users users = Users.builder()
                    .firstName("FirstName"+i)
                    .lastName("LastName"+i)
                    .age(i+30)
                    .email("email"+i)
                    .build();
            userRepository.save(users);
        }
        return userRepository.findAll(new Specification<Users>() {
            @Override
            public Predicate toPredicate(Root<Users> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
                List<Predicate> predicates = new ArrayList<>();
                if(firstName != null){
                    predicates.add(criteriaBuilder.and(criteriaBuilder.equal(root.get("firstName"), firstName)));

                }
                return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
            }
        });
    }
}
