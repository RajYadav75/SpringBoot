package in.raj.dao;

import in.raj.model.Worker;

import java.util.List;

public interface IWorkerDao {
    public List<Worker> getWorkerDetails(int id) throws Exception;
}
