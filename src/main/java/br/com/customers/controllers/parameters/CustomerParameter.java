package br.com.customers.controllers.parameters;

import br.com.customers.models.Address;
import br.com.customers.models.Customer;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class CustomerParameter implements Serializable {
	@Schema(description = "full name of the customer", example = "Luciana Benedita Aurora Santos")
	private String name;
	@Schema(description = "document number of the customer", example = "654.916.421-42")
	private String document;
//	@ApiModelProperty(value = "List of the addresses of the customer", dataType = "List", position = 3)
	@Schema(name = "address", description = "List of the addresses of the customer", type = "List", format = "list")
	private List<AddressParameter> address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public List<AddressParameter> getAddress() {
		return address;
	}

	public void setAddress(List<AddressParameter> address) {
		this.address = address;
	}

	public Customer toModel() {
		Customer customer = new Customer();
		List<Address> addressList = new ArrayList<>();
		if (address != null && !address.isEmpty()) {
			address.forEach(addressParameter -> addressList.add(addressParameter.toModel()));
		}

		customer.setName(this.name);
		customer.setDocument(this.document);
		customer.setAddress(addressList);

		return customer;
	}

}
