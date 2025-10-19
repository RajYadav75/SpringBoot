package in.raj.service;

import in.raj.entity.MarriageSeeker;

public interface IMarriageService {
    public String registerMarriageSeekers(MarriageSeeker marriageSeekar);
    public MarriageSeeker getMarriageSeekarById(Integer id);
}
