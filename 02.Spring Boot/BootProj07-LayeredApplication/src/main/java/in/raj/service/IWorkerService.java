package in.raj.service;

import in.raj.model.Worker;

import java.util.List;

public interface IWorkerService {
    public List<Worker> fetchWorker(int id) throws Exception;
}
