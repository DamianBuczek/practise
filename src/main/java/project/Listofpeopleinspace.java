package project;

import jakarta.persistence.*;

    @Entity
    public class Listofpeopleinspace {

        @Id
        @Column(name = "ID")
        private int listID;

        private String name;

        private String craft;

        @ManyToOne
        @JoinColumn(name = "list_people")

        private Listofpeopleinspace listofpeopleinspace;
    }


