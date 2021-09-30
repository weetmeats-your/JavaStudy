package top.qiyi.java.basic.enumeration;

import lombok.extern.slf4j.Slf4j;

/**
 * @program：JavaStudy
 * @description: 展示枚举状态
 * @author: qiyi
 * <p>
 * create: 2021-09-30 09:36
 **/
@Slf4j
public class StateMachine {

    public static String getTrafficInstruct(Signal signal) {
        String instruct = "信号灯故障";
        switch (signal) {
            case RED:
                instruct = "对不起，你要等一等";
                break;
            case YELLOW:
                instruct="黄灯请注意";
                break;
            case GREEN:
                instruct ="你好，请慢走";
                break;
            default:
                break;

        }
        return instruct;

    }
    public static void main(String[] args){
        log.info(getTrafficInstruct(Signal.RED));
        log.info(getTrafficInstruct(Signal.YELLOW));
        log.info(getTrafficInstruct(Signal.GREEN));
    }

}
