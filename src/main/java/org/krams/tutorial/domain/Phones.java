package org.krams.tutorial.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by DrBlast on 14.06.2016.
 */
@Entity
@Table(name = "Phones")
public class Phones implements Serializable {

    private static final long serialVersionUID = -5527566248002296032L;

    @Id
    @Column(name = "phone_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;

    @Column(name = "phone", length = 20)
    private String phone;

    @Column(name = "confidant", length = 50)
    private String confidant;

    @Column(name = "isMain", length = 20)
    private Boolean isMain;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((phone == null) ? 0 : phone.hashCode());
        result = prime * result + ((confidant == null) ? 0 : confidant.hashCode());
        result = prime * result + ((isMain == null) ? 0 : isMain.hashCode());
        result = prime * result + ((person == null) ? 0 : person.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Phones that = (Phones) o;
        if (id != that.id) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (confidant != null ? !confidant.equals(that.confidant) : that.confidant != null) return false;
        if (isMain != null ? !isMain.equals(that.isMain) : that.isMain != null) return false;
        if (person != null ? !person.equals(that.person) : that.person != null) return false;
        return true;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone1) {
        this.phone = phone1;
    }

    public String getConfidant() {
        return confidant;
    }

    public void setConfidant(String confidant1) {
        this.confidant = confidant1;
    }

    public Boolean getMain() {
        return isMain;
    }

    public void setMain(Boolean main) {
        isMain = main;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
