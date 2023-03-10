package br.com.customers.controllers.parameters;

import br.com.customers.models.Address;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;


public class AddressParameter implements Serializable {
    @Schema(name = "address", description = "Street name of the customer", example = "Via Una")
    private String street;
    @Schema(name = "address", description = "Number of the residence of the customer", example = "420")
    private String number;
    @Schema(name = "address", description = "Neighborhood name of the customer", example = "Tarumã-Açu")
    private String neighborhood;
    @Schema(name = "address", description = "City name of the customer", example = "Manaus")
    private String city;
    @Schema(name = "address", description = "Province name of the customer", example = "AM")
    private String province;
    @Schema(name = "address", description = "Country name of the customer", example = "Brasil")
    private String country;
    @Schema(name = "address", description = "Post code number of the customer", example = "69022-560")
    private String postCode;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public Address toModel() {
        Address address = new Address();

        address.setStreet(this.street);
        address.setNumber(this.number);
        address.setNeighborhood(this.neighborhood);
        address.setCity(this.city);
        address.setProvince(this.province);
        address.setCountry(this.country);
        address.setPostCode(this.postCode);

        return address;
    }
}
