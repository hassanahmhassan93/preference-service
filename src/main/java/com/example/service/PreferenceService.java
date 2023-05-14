package com.example.service;

import com.example.model.Preference;
import com.example.model.PreferenceReqModel;
import com.example.model.PreferenceResModel;
import com.example.repository.PreferenceRepository;
import jakarta.inject.Singleton;

@Singleton
public class PreferenceService {

    private final PreferenceRepository preferenceRepository;

    public PreferenceService(PreferenceRepository preferenceRepository) {

        this.preferenceRepository = preferenceRepository;
    }

    public PreferenceResModel findByUserId(Integer userId) {

        return mapToPreferenceResModel(preferenceRepository.findByUserId(userId));
    }

    public PreferenceResModel createPreference(PreferenceReqModel preferenceReqModel) {

        return mapToPreferenceResModel(preferenceRepository.save(mapToPreference(preferenceReqModel)));
    }

    private Preference mapToPreference(PreferenceReqModel preferenceReqModel) {

        Preference preference = new Preference();

        preference.setUserId(preferenceReqModel.getUserId());
        preference.setLocale(preferenceReqModel.getLocale());
        preference.setDiet(preferenceReqModel.getDiet());
        preference.setNotifyOff(preferenceReqModel.isNotifyOff());

        return preference;
    }

    private PreferenceResModel mapToPreferenceResModel(Preference preference) {

        PreferenceResModel preferenceResModel = new PreferenceResModel();

        preferenceResModel.setId(preference.getId());
        preferenceResModel.setUserId(preference.getUserId());
        preferenceResModel.setLocale(preference.getDiet());
        preferenceResModel.setDiet(preference.getDiet());
        preferenceResModel.setNotifyOff(preference.isNotifyOff());

        return preferenceResModel;
    }
}
