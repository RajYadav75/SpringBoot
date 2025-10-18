package in.raj.service.impl;

import in.raj.entity.Heroines;
import in.raj.service.IHeroineService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/*USE `datajpa`;
DROP procedure IF EXISTS `p_get_HeroinesDetailsByFees`;

DELIMITER $$
USE `datajpa`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `p_get_HeroinesDetailsByFees`(IN startFees float,
		IN endFees float)
BEGIN

SELECT * FROM JPA_HEROINES_TAB WHERE FEES>=startFees  and FEES<=endFees;

END$$

DELIMITER ;*/

@Service
public class HeroineServiceImpl implements IHeroineService {
    @Autowired
    private EntityManager manager;
    @Override
    public List<Heroines> getHeroinesByFeesRange(Double startFees, Double endFees) {
        //TODO- Create StoredProcedureQuery object pointing PL/SQL procedure
        StoredProcedureQuery query = manager.createStoredProcedureQuery("p_get_HeroinesDetailsByFees", Heroines.class);
        //TODO- Register Both IN Out params in specifying their mode              OR
        //TODO- register the PL/SQL procedure parameter with java data types
        query.registerStoredProcedureParameter(1, Double.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(2, Double.class, ParameterMode.IN);
        //TODO:- Set Values To IN params
        query.setParameter(1, startFees);
        query.setParameter(2, endFees);
        //TODO:- Call PL/SQL Procedure
        List<Heroines> queryResultList = query.getResultList();
        return queryResultList;
    }
}
