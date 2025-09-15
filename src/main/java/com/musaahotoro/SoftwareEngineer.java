package com.musaahotoro;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
public class SoftwareEngineer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String techStack;

    public SoftwareEngineer() {
    }

    public SoftwareEngineer(Integer id, String name, String techStack) {
        this.id = id;
        this.name = name;
        this.techStack = techStack;
    }

    // Getters
    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getTechStack() {
        return techStack;
    }

    // Setters
    public void setId(Integer id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setTechStack(String techStack) {
        this.techStack = techStack;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) {
            return false;
        }

        if(this.getClass() != obj.getClass()) {
            return false;
        }

        SoftwareEngineer that = (SoftwareEngineer) obj;

        return  Objects.equals(that.id, this.id) &&
                Objects.equals(that.name, this.name) &&
                Objects.equals(that.techStack, this.techStack);
    }

    public int hashCode() {
        return Objects.hash(id, name, techStack);
    }


}
