package boot.spring.service.impl;

import boot.spring.domain.Institution;
import boot.spring.mapper.InstitutionMapper;
import boot.spring.service.InstitutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InstitutionServiceImpl implements InstitutionService {

    @Autowired
    private InstitutionMapper institutionMapper;
    @Override
    public List<Institution> selectAll() {
        return institutionMapper.selectAll();
    }
}
