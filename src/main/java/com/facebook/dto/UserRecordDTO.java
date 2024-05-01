package com.facebook.dto;

import jakarta.validation.constraints.NotBlank;

public record UserRecordDTO(@NotBlank String email, @NotBlank String password) {}
