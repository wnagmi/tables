package boot.spring.service;

import boot.spring.domain.Institution;

import java.util.List;

public interface InstitutionService  {
    List<Institution> selectAll();
}
