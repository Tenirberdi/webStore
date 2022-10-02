package com.example.webStore.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usr {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String fullName;
    private String login;
    private String pass;
    private boolean enabled;

    @ManyToOne
    @JoinColumn(name="role_id")
    private Role roleId;

}
