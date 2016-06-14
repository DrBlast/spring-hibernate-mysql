package org.krams.tutorial.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by DrBlast on 28.05.2016.
 */
@Entity
@Table(name = "House")
public class Houses implements Serializable {

    private static final long serialVersionUID = -5527566248002296041L;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "housesSet")
    private Set<Person> personSet = new HashSet<>();

    public Set<Person> getPersonSet() {
        return personSet;
    }

    public void setPersons(Set<Person> personSet) {
        this.personSet = personSet;
    }

    public void addPerson(Person person) {
        personSet.add(person);
    }

    @OneToMany(mappedBy="house_payment")
    private Set<Payments> paymentsSet = new HashSet<>();

    @Id
    @Column(name = "HOUSE_ID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "KP_ID")
    private Byte kpId;

    @Column(name = "AREA_HUMBER", length = 10)
    private String areaNumber;

    @Column(name = "STREET", length = 50)
    private String street;

    @Column(name = "HOUSE_NUMBER", length = 20)
    private String houseNum;

    @Column(name = "FLAT")
    private Integer flat;

    @Column(name = "IDX")
    private Integer index;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((kpId == null) ? 0 : kpId.hashCode());
        result = prime * result + ((index == null) ? 0 : index.hashCode());
        result = prime * result + ((flat == null) ? 0 : flat.hashCode());
        result = prime * result + ((areaNumber == null) ? 0 : areaNumber.hashCode());
        result = prime * result + ((street == null) ? 0 : street.hashCode());
        result = prime * result + ((houseNum == null) ? 0 : houseNum.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Houses that = (Houses) o;
        if (id != that.id) return false;
        if (index != null ? !index.equals(that.index) : that.index != null) return false;
        if (kpId != null ? !kpId.equals(that.kpId) : that.kpId != null) return false;
        if (areaNumber != null ? !areaNumber.equals(that.areaNumber) : that.areaNumber != null) return false;
        if (street != null ? !street.equals(that.street) : that.street != null) return false;
        if (flat != null ? !flat.equals(that.flat) : that.flat != null) return false;
        if (houseNum != null ? !houseNum.equals(that.houseNum) : that.houseNum != null) return false;
        return true;
    }

    @Override
    public String toString() {
        return "HouseEntity{" +
                "id=" + id +
                ", index='" + index + '\'' +
                ", kpId='" + kpId + '\'' +
                ", areaNumer='" + areaNumber + '\'' +
                ", street='" + street + '\'' +
                ", flat='" + flat + '\'' +
                '}';
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Byte getKpId() {
        return kpId;
    }

    public void setKpId(Byte kpId) {
        this.kpId = kpId;
    }

    public String getAreaNumber() {
        return areaNumber;
    }

    public void setAreaNumber(String areaNumber) {
        this.areaNumber = areaNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(String houseNum) {
        this.houseNum = houseNum;
    }

    public Integer getFlat() {
        return flat;
    }

    public void setFlat(Integer flat) {
        this.flat = flat;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public Set<Payments> getPaymentsSet() {
        return paymentsSet;
    }

    public void setPaymentsSet(Set<Payments> paymentsSet) {
        this.paymentsSet = paymentsSet;
    }
}
