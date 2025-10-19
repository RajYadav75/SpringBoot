package in.raj.service.impl;

import in.raj.entity.MarriageSeeker;
import in.raj.repository.MarriageRepo;
import in.raj.service.IMarriageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarriageServiceImpl implements IMarriageService {
    @Autowired
    private MarriageRepo marriageRepo;
    @Override
    public String registerMarriageSeekers(MarriageSeeker marriageSeekar) {
        try {
            Integer id = marriageRepo.save(marriageSeekar).getId();
            return "Marriage Seeker " + id + " registered successfully";
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public MarriageSeeker getMarriageSeekarById(Integer id) {
        return marriageRepo.getReferenceById(id);
    }
}
