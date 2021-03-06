package kz.kazntu.lessons.start;


import kz.kazntu.lessons.models.Robot;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RobotManager {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml") ;

        Robot robot = (Robot)context.getBean("robot") ;
        robot.action();
    }
}
