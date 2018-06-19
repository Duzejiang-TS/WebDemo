package service.money;

import dao.money.moneyDao;
import domain.Sale;

import java.util.List;

public class moneyService {
    public List<Sale> moneyfind(String day1,String day2){
        //总票房查询
        moneyDao md = new moneyDao();
        return md.moneyfind(day1,day2);
    }
}
