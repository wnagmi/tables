package boot.spring.mapper;

import boot.spring.domain.Institution;
import java.util.List;

public interface InstitutionMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(Institution record);

    Institution selectByPrimaryKey(Integer ID);

    List<Institution> selectAll();

    int updateByPrimaryKey(Institution record);
}