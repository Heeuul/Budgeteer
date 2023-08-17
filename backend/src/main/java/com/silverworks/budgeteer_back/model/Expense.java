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
public class Expense {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "id", updatable = false, nullable = false, columnDefinition = "VARCHAR(16)")
    UUID id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;

    @Column(name = "category", columnDefinition = "VARCHAR(10)")
    String category;

    @Column(name = "title", columnDefinition = "VARCHAR(25)")
    String title;

    @Column(name = "allocation", columnDefinition = "INT")
    int allocation;
}
