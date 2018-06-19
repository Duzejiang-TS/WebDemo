package dao.money;

import domain.Sale;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import util.DBCPUtil;

import java.sql.SQLException;
import java.util.List;

public class moneyDao {
    private QueryRunner qr = new QueryRunner(DBCPUtil.getDataSource());

    public List<Sale> moneyfind(String day1,String day2){
        try {
            return qr.query("select * from sale WHERE sale_status=1 AND sale_time >'2018-? 00:00:00' AND sale_time <'2018-? 00:00:00' ",new BeanListHandler<Sale>(Sale.class),day1,day2);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  null;
    }
}
