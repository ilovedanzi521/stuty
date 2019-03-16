package com.wanglei.study.gupao.day05.delegate;

import java.util.HashMap;
import java.util.Map;

public class Leader {
    //预先知道每个员工的特长、特征，去分发任务

    private Map<String,IEmployee> regist = new HashMap<String,IEmployee>();
    public Leader(){
        regist.put("加密",new EmployeeA());
    }
    public void doing(String command){
//        fu();
        regist.get(command).doing(command);
    }
}
