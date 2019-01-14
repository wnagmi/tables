package boot.spring.service;

import boot.spring.domain.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> selectAll();
}
