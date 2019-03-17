package com.wanglei.study.gupao.day06.homework;

/**
 * @ClassName MsgInterface
 * @Description 定义内部报文接口，一般按照银联8583报文规范定义报文头
 *
 * @Author yuman
 * @Date 2019/3/17 8:09
 * @菜鸡加油 run run run
 */
public class MsgInterface {
    public String getStd400trcd() {
        return std400trcd;
    }

    public void setStd400trcd(String std400trcd) {
        this.std400trcd = std400trcd;
    }

    public String getStd400prino() {
        return std400prino;
    }

    public void setStd400prino(String std400prino) {
        this.std400prino = std400prino;
    }

    public String getStd400amt() {
        return std400amt;
    }

    public void setStd400amt(String std400amt) {
        this.std400amt = std400amt;
    }

    public String getStd400va() {
        return std400va;
    }

    public void setStd400va(String std400va) {
        this.std400va = std400va;
    }

    public String getStd400cur() {
        return std400cur;
    }

    public void setStd400cur(String std400cur) {
        this.std400cur = std400cur;
    }

    public String getStd400pswd() {
        return std400pswd;
    }

    public void setStd400pswd(String std400pswd) {
        this.std400pswd = std400pswd;
    }

    public String getStd400trk() {
        return std400trk;
    }

    public void setStd400trk(String std400trk) {
        this.std400trk = std400trk;
    }

    private String std400trcd;//主账号
    private String std400prino;//交易码
    private String std400amt;//交易金额
    private String std400va;//卡有效期
    private String std400cur;//交易货币代码
    private String std400pswd;//密码
    private String std400trk;//磁道信息

}
