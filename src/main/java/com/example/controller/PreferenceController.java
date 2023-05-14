package com.example.controller;

import com.example.model.PreferenceReqModel;
import com.example.model.PreferenceResModel;
import com.example.service.PreferenceService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;

import javax.validation.Valid;

@Controller("/api/preferences")
public class PreferenceController {

    private final PreferenceService preferenceService;

    public PreferenceController(PreferenceService preferenceService) {
        this.preferenceService = preferenceService;
    }

    @Get("/{userId}")
    public HttpResponse<PreferenceResModel> getPreferencesByUserId(@PathVariable Integer userId) {
        return HttpResponse.ok(preferenceService.findByUserId(userId));
    }

    @Post
    public HttpResponse<PreferenceResModel> createPreference(@Valid @Body PreferenceReqModel preferenceReqModel) {
        return HttpResponse.created(preferenceService.createPreference(preferenceReqModel));
    }

}