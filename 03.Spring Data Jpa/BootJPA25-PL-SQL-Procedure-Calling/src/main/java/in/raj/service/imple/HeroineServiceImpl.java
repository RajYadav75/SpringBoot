package in.raj.service.imple;

import in.raj.entity.Heroines;
import in.raj.service.IHeroinesService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/*CREATE OR REPLACE PROCEDURE P_GET_HEROINE_BY_FEESRANGE
        (
                STARTFEES IN FLOAT
                , ENDFEES IN FLOAT
                , DETAILS OUT SYS_REFCURSOR
        ) AS
BEGIN
OPEN DETAILS FOR
SELECT * FROM jpa_heroines_tab WHERE FEES>=startfees AND FEES<=endfees;
END P_GET_HEROINE_BY_FEESRANGE;*/
@Service
public class HeroineServiceImpl implements IHeroinesService {
    @Autowired
    private EntityManager manager;
    @Override
    public List<Heroines> getHeroinesByFeesRange(Double startFees, Double endFees) {
        //TODO- Create StoredProcedureQuery object pointing PL/SQL procedure
        StoredProcedureQuery pGetHeroineByFeesrange = manager.createStoredProcedureQuery("P_GET_HEROINE_BY_FEESRANGE", Heroines.class);
        //TODO- Register Both IN Out params in specifying their mode              OR
        //TODO- register the PL/SQL procedure parameter with java data types

        pGetHeroineByFeesrange.registerStoredProcedureParameter(1, Double.class, ParameterMode.IN);
        pGetHeroineByFeesrange.registerStoredProcedureParameter(2, Double.class, ParameterMode.IN);
        //TODO:- Indirectly Registering as OUT Param
        pGetHeroineByFeesrange.registerStoredProcedureParameter(3, Object.class,ParameterMode.REF_CURSOR);
        //TODO:- Set Values To IN params
        pGetHeroineByFeesrange.setParameter(1, startFees);
        pGetHeroineByFeesrange.setParameter(2, endFees);
        //TODO:- Call PL/SQL Procedure
        List<Heroines> resultList = pGetHeroineByFeesrange.getResultList();
        return resultList;
    }
}
