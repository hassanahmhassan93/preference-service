package com.example.model;


import io.micronaut.core.annotation.Introspected;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Introspected
@Entity
@Table(name = "preferences")
public class Preference {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "user_id")
    private int userId;

    @Column
    private String locale;

    @Column
    private String diet;

    @Column(name = "notify_off")
    private boolean notifyOff;
}
