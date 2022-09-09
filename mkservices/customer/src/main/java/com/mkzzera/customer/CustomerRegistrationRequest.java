package com.mkzzera.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email)
{
}
