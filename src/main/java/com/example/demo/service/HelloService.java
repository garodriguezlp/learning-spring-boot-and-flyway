package com.example.demo.service;

import com.example.demo.domain.User;
import com.example.demo.repository.HelloRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import static java.lang.String.format;

@Service
@RequiredArgsConstructor
@Slf4j
public class HelloService {

    private final HelloRepository helloRepository;

    public void save(String userName) {
        log.info(format("Storing greeting from %s", userName));
        helloRepository.save(User.builder().name(userName).build());
    }
}
