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
public class Transaction {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "id", updatable = false, nullable = false, columnDefinition = "VARCHAR(16)")
    UUID id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;
    @ManyToOne
    @JoinColumn(name = "wallet_id")
    Wallet wallet;
    @ManyToOne
    @JoinColumn(name = "expense_id")
    Expense expense;

    @Column(name = "label", columnDefinition = "VARCHAR(50)")
    String label;
    @Column(name = "credit", nullable = false, columnDefinition = "TINYINT(1)")
    boolean credit;
    @Column(name = "amount", nullable = false, columnDefinition = "INT")
    int amount;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "performed", nullable = false, columnDefinition = "DATETIME")
    java.util.Date performed;
}
