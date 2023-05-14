package com.example.model;

import io.micronaut.core.annotation.Introspected;
import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Introspected
public class PreferenceReqModel {

    @Min(1)
    private int userId;

    @NotBlank
    private String locale;

    @NotBlank
    private String diet;

    @NotNull
    private boolean notifyOff;
}
