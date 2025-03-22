package in.raj.controller;

import in.raj.model.Worker;
import in.raj.service.IWorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller("wrkrController")
public class WorkerController {
    @Autowired
    private IWorkerService workerService;

    public List<Worker> showWorker(int id) throws Exception{
        List<Worker> workerList = workerService.fetchWorker(id);
        return workerList;
    }
}
