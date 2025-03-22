package in.raj.dao;

import in.raj.model.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Repository("wrkrDao")
public class WorkerDaoImpl implements IWorkerDao{
    private static final String GET_WORKER_DETAILS_BY_ID = "SELECT * FROM WORKER WHERE WORKERNO IN(?) ORDER BY WORKERNO";

    @Autowired
    private DataSource ds;

    @Override
    public List<Worker> getWorkerDetails(int id)throws Exception {
        System.out.println("WorkerDaoImpl.getWorkerDetails :: DS class Name :: "+ds.getClass());

        List<Worker> workerList = null;

        try(
                Connection con = ds.getConnection();
                PreparedStatement ps = con.prepareStatement(GET_WORKER_DETAILS_BY_ID)
                ){
            // Set value to Query params
            ps.setInt(1,id);
            //Execute Query
            try (
                    ResultSet rs = ps.executeQuery()
                    ){
                // Copy The Records of ResultSet Obj to List<Worker> obj
                workerList=new ArrayList<>();
                while (rs.next()){
                    // copy each record of RS to Worker obj
                    Worker worker = new Worker();
                    worker.setWrkrNo(rs.getInt(1));
                    worker.setWrkrName(rs.getString(2));
                    worker.setWrkrPos(rs.getString(3));
                    //Add Worker Obj to List Collection
                    workerList.add(worker);
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
        return workerList;
    }
}
