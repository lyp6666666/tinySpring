package cn.lyp.springframework.beans.factory;

/**
 * @Author: LypCoding
 * @Date: 2025/6/23 16:31
 * @Description:
 */
public interface BeanNameAware extends Aware{

    void setBeanName(String name);
}
