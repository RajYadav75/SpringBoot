package raj;

import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        TODO: Create the IOC Container
        FileSystemXmlApplicationContext context =
                new FileSystemXmlApplicationContext("raj/configuration/applicationContext.xml");
//        TODO: Get Target Spring bean class object from the IOC container
        Object wmg = context.getBean("wmg");
    }
}
