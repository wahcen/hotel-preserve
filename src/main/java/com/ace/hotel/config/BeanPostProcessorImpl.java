package com.ace.hotel.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * 用于监听SpringIOC容器初始化Bean过程
 *
 * @author Ace.ch
 * @version V1.0
 * @Package config
 * @date 2019/10/27 11:27
 */
public class BeanPostProcessorImpl implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("[IOC CONTAINER] : " + bean.getClass().getSimpleName() + " [OF] " + beanName + " [INSTANTIATE START]");
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("[IOC CONTAINER] : " + bean.getClass().getSimpleName() + " [OF] " + beanName + " [INSTANTIATE FINISH]");
        return bean;
    }
}
