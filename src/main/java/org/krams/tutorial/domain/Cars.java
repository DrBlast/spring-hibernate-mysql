package org.krams.tutorial.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by DrBlast on 14.06.2016.
 */
@Entity
@Table(name = "Cars")
public class Cars implements Serializable {


    private static final long serialVersionUID = -5527566248002296022L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "isDeleted")
    private Boolean isDeleted;

    @ManyToOne
    @JoinColumn(name = "car_owner")
    private Person car_owner;

    @Column(name = "car_number", length = 15)
    private String car_number;

    @Column(name = "car_decr", length = 50)
    private String car_decr;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((isDeleted == null) ? 0 : isDeleted.hashCode());
        result = prime * result + ((car_owner == null) ? 0 : car_owner.hashCode());
        result = prime * result + ((car_number == null) ? 0 : car_number.hashCode());
        result = prime * result + ((car_decr == null) ? 0 : car_decr.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cars that = (Cars) o;
        if (id.equals(that.id)) return false;
        if (isDeleted != null ? !isDeleted.equals(that.isDeleted) : that.isDeleted != null) return false;
        if (car_owner != null ? !car_owner.equals(that.car_owner) : that.car_owner != null) return false;
        if (car_number != null ? !car_number.equals(that.car_number) : that.car_number != null) return false;
        return car_decr != null ? car_decr.equals(that.car_decr) : that.car_decr == null;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    public Person getCar_owner() {
        return car_owner;
    }

    public void setCar_owner(Person car_owner) {
        this.car_owner = car_owner;
    }

    public String getCar_number() {
        return car_number;
    }

    public void setCar_number(String car_number) {
        this.car_number = car_number;
    }

    public String getCar_decr() {
        return car_decr;
    }

    public void setCar_decr(String car_decr) {
        this.car_decr = car_decr;
    }
}
