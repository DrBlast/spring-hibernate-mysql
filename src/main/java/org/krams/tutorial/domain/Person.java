package org.krams.tutorial.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "PERSON")
public class Person implements Serializable {

    private static final long serialVersionUID = -5527566248002296042L;

//    //OneToMany Example
//    private EmployeeEntity employee;
//    @ManyToOne
//    @JoinColumn(name = "employee_id", referencedColumnName = "id")
//    public EmployeeEntity getEmployee() {
//        return this.employee;
//    }

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "person_house",
            joinColumns = @JoinColumn(name = "person_id"),
            inverseJoinColumns = @JoinColumn(name = "house_id"))
    private Set<Houses> housesSet = new HashSet<>();

    public Set<Houses> getHousesSet() {
        return housesSet;
    }

    public void setHouses(Set<Houses> housesSet) {
        this.housesSet = housesSet;
    }

    public void addHouse(Houses houses) {
        housesSet.add(houses);
    }


    @Id
    @Column(name = "PERSON_ID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "NAME", length = 100)
    private String name;

    @OneToMany(mappedBy="person")
    private Set<Phones> phones = new HashSet<>();

    @OneToMany(mappedBy="car_owner")
    private Set<Cars> carsSet = new HashSet<>();

//    @Column(name = "PHONE_ID", length = 100)
//    private String phoneId;

    @Column(name = "ADDITIONAL_INFO", length = 100)
    private String additionalContactInfo;

    @Column(name = "IS_STOCKHOLDER")
    private Boolean isStockholder;

    @Column(name = "ADDRESS", length = 100)
    private String address;

    @Column(name = "IDX")
    private Integer index;

    @Column(name = "CONTRACT_NUMBER")
    private String contractNumber;

    @Column(name = "COMMENTS")
    private String comments;

    @Column(name = "SMS")
    private Boolean sms;

    @Column(name = "DOCUMENT")
    private String document;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
       // result = prime * result + ((phoneId == null) ? 0 : phoneId.hashCode());
        result = prime * result + ((comments == null) ? 0 : comments.hashCode());
        result = prime * result + ((contractNumber == null) ? 0 : contractNumber.hashCode());
        result = prime * result + ((index == null) ? 0 : index.hashCode());
        result = prime * result + ((address == null) ? 0 : address.hashCode());
        result = prime * result + ((isStockholder == null) ? 0 : isStockholder.hashCode());
        result = prime * result + ((additionalContactInfo == null) ? 0 : additionalContactInfo.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
       //         ", phoneId='" + phoneId + '\'' +
                ", comments='" + comments + '\'' +
                ", contractNumber='" + contractNumber + '\'' +
                ", index='" + index + '\'' +
                ", address='" + address + '\'' +
                ", isStockholder='" + isStockholder + '\'' +
                ", additionalContactInfo='" + additionalContactInfo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person that = (Person) o;
        if (id != that.id) return false;
        if (index != null ? !index.equals(that.index) : that.index != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
    //    if (phoneId != null ? !phoneId.equals(that.phoneId) : that.phoneId != null) return false;
        if (comments != null ? !comments.equals(that.comments) : that.comments != null) return false;
        if (contractNumber != null ? !contractNumber.equals(that.contractNumber) : that.contractNumber != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (isStockholder != null ? !isStockholder.equals(that.isStockholder) : that.isStockholder != null) return false;
        if (additionalContactInfo != null ? !additionalContactInfo.equals(that.additionalContactInfo) : that.additionalContactInfo != null) return false;
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

   // public String getPhoneId() {
  //      return phoneId;
 //   }

  //  public void setPhone(String phoneId) {
   //     this.phoneId = phoneId;
  //  }
//
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAdditionalContactInfo() {
        return additionalContactInfo;
    }

    public void setAdditionalContactInfo(String additionalContactInfo) {
        this.additionalContactInfo = additionalContactInfo;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public Boolean getStockholder() {
        return isStockholder;
    }

    public void setStockholder(Boolean stockholder) {
        isStockholder = stockholder;
    }


    public Boolean getSms() {
        return sms;
    }

    public void setSms(Boolean sms) {
        this.sms = sms;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public Set<Phones> getPhones() {
        return phones;
    }

    public void setPhones(Set<Phones> phones) {
        this.phones = phones;
    }

    public Set<Cars> getCarsSet() {
        return carsSet;
    }

    public void setCarsSet(Set<Cars> carsSet) {
        this.carsSet = carsSet;
    }
}


