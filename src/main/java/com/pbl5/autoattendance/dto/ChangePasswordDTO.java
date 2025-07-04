package com.pbl5.autoattendance.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChangePasswordDTO {
    @NotEmpty
    @NotNull
    private String currentPassword;
    @NotEmpty
    @NotNull
    private String newPassword;
    @NotEmpty
    @NotNull
    private String confirmPassword;
}
