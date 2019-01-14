package boot.spring.service.impl;

import boot.spring.domain.Customer;
import boot.spring.mapper.CustomerMapper;
import boot.spring.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CusomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper;
    @Override
    public List<Customer> selectAll() {
        return customerMapper.selectAll();
    }
}
