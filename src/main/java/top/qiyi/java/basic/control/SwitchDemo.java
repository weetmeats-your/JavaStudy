package top.qiyi.java.basic.control;

import lombok.extern.slf4j.Slf4j;

/**
 * @program：JavaStudy
 * @description: switch之case穿透
 * @author: qiyi
 * <p>
 * create: 2021-10-01 22:55
 **/
@Slf4j
public class SwitchDemo {
    public static void main(String[] agrs) {
        int i = 0;
        int j = -1;
        switch (i) {
            case 0:
                j = 1;
            case 1:
                j = 1;
            case 2:
                j = 2;

        }
        log.info("j={}", j);
    }
}
