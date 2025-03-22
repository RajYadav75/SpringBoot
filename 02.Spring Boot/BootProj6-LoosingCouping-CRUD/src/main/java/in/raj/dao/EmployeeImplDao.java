package in.raj.dao;

import in.raj.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository("empDao")
public class EmployeeImplDao implements EmployeeDao {
    private static final String GET_EMPS_BY_DEGS = "SELECT EMPNO,ENAME,JOB,SALARY,DEPT,DESG FROM EMP WHERE JOB IN(?,?,?) ORDER BY JOB ";

    @Autowired
    private DataSource ds;

    @Override
    public List<Employee> getEmpsByDesgs(String desg1, String desg2, String desg3) throws Exception {
        List<Employee> list = null;
        try (Connection con = ds.getConnection();
             PreparedStatement ps = con.prepareStatement(GET_EMPS_BY_DEGS)) {

            System.out.println("DS object class name::" + ds.getClass());

            //set  values to query params
            ps.setString(1, desg1);
            ps.setString(2, desg2);
            ps.setString(3, desg3);

            //execute the Query and copy the ResultSet obj records to List<Employee> object
            try (ResultSet rs = ps.executeQuery()) {

                list = new ArrayList<Employee>();
                while (rs.next()) {
                    //copy each record  to Employee class obj
                    Employee emp = new Employee();
                    emp.setEmpno(rs.getInt(1));
                    emp.setEname(rs.getString(2));
                    emp.setDesg(rs.getString(3));
                    emp.setSalary(rs.getDouble(4));
                    emp.setDeptno(rs.getInt(5));
                    //add  each  Employee class obj to  List collection
                    list.add(emp);
                }//while

            }//try2

        }//try1
        catch (SQLException se) {
            se.printStackTrace();
            throw se;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }

        return list;
    }
}
