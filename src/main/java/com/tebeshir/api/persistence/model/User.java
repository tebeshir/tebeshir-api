package com.tebeshir.api.persistence.model;

import org.hibernate.validator.constraints.Email;

import javax.persistence.*;
import javax.validation.constraints.Size;

/**
 * Created by yeko on 04/01/16.
 */
@Entity
@Table(name = "AppUser")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // GenerationType.AUTO : persistence provider should select an
    // appropriate strategy : PostgreSQL?
    private Long id;

    //private Long facebookId;

    @Column(unique = true, nullable = false)
    @Size(max = 64)
    private String name;
    // acts as username

    @Column(unique = false, nullable = true)
    @Size(min = 2, max = 64)
    private String firstName;

    @Column(unique = false, nullable = true)
    @Size(min = 2, max = 64)
    private String lastName;

    @Column(unique = true, nullable = false)
    @Email
    private String email;

    @Column(unique = false, nullable = false)
    private String password;

    private Long boardID;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id", table = "board")
    private Long getBoardID() {
        return boardID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBoardID(Long boardID) {
        this.boardID = boardID;
    }

}
