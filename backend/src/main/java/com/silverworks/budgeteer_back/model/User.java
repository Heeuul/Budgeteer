package com.silverworks.budgeteer_back.model;

import org.hibernate.annotations.GenericGenerator;
import jakarta.persistence.*;
import java.util.UUID;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "id", updatable = false, nullable = false, columnDefinition = "VARCHAR(16)")
    UUID id;

    @Column(name = "username", columnDefinition = "VARCHAR(50)")
    String username;

    @Column(name = "email", columnDefinition = "VARCHAR(50)")
    String email;

    @Column(name = "password", columnDefinition = "VARCHAR(255)")
    String password;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "joined", columnDefinition = "VARCHAR(50)")
    java.util.Date joined;
}
