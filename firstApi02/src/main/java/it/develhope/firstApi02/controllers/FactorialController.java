package it.develhope.firstApi02.controllers;

import com.google.common.math.BigIntegerMath;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
public class FactorialController {

    @GetMapping(value = "/factorial/{n}")
    public BigInteger factorialUsingGuava(@PathVariable int n) {
        return BigIntegerMath.factorial(n);
    }

    }

