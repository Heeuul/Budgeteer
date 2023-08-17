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
public class Wallet {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "id", updatable = false, nullable = false, columnDefinition = "VARCHAR(16)")
    UUID id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;

    @Column(name = "label", columnDefinition = "VARCHAR(25)")
    String label;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "joined", columnDefinition = "VARCHAR(50)")
    java.util.Date created;

    @Column(name = "sum", columnDefinition = "INT")
    String sum;
}
