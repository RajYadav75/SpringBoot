package in.raj.service;

import in.raj.dao.IWorkerDao;
import in.raj.model.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("wrkrService")
public class WorkerServiceImpl implements IWorkerService{
    @Autowired
    private IWorkerDao workerDao;
    @Override
    public List<Worker> fetchWorker(int id) throws Exception {
        List<Worker> workerDetails = workerDao.getWorkerDetails(id);
        return workerDetails;
    }
}
