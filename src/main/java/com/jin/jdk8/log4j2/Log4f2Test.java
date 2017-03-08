package com.jin.jdk8.log4j2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wu.jinqing
 * @date 2017年02月27日
 */
public class Log4f2Test {
    static final Logger logger = LoggerFactory.getLogger(Log4f2Test.class);

    public static void main(String[] args) {
        logger.trace("this is trace log!");
        logger.debug("this is debug log!");
        logger.info("this is info log!");
        logger.warn("this is warn log!");
        logger.error("this is error log!");
    }
}
