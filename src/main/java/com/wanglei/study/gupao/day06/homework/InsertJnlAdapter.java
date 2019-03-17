package com.wanglei.study.gupao.day06.homework;

/**
 * @ClassName RestructureInsertJnlSerice
 * @Description 适配器控制器
 * @Author yuman
 * @Date 2019/3/17 8:45
 * @菜鸡加油 run run run
 */
public class InsertJnlAdapter extends InsertJnlService implements ChannelInserJnlSupport {
    @Override
    public void insertABJnl(MsgInterface msg) {
        processInsertJnl(msg,AbAdapter.class);
    }

    @Override
    public void insertWYJnl(MsgInterface msg) {
        processInsertJnl(msg,WyAdapter.class);
    }

    private void processInsertJnl(MsgInterface msg, Class<? extends Adapters> adapterClass) {
        try {
            Adapters Adapters = adapterClass.newInstance();
            Adapters.insertJnl(msg);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
