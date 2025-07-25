package cn.lyp.springframework.context.event;

/**
 * @Author: LypCoding
 * @Date: 2025/6/25 9:19
 * @Description:
 */
public class ContextRefreshedEvent extends ApplicationContextEvent{

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ContextRefreshedEvent(Object source) {
        super(source);
    }

}
