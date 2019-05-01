package com.dipak.builderdesignpattern.domain;
/**
 * @author dipak
 */
public class Future {
    private String education;
    private String labour;
    private String country;

    public String getEducation() {
        return education;
    }

    public Future() {
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getLabour() {
        return labour;
    }

    public void setLabour(String labour) {
        this.labour = labour;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Good Future{" +
                "education='" + education + '\'' +
                ", labour='" + labour + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
