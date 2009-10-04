import org.springframework.context.ApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext

class AppContext
  @@context = ClassPathXmlApplicationContext.new(["beans.xml"].to_java :String)
  
  def self.tasks_service
    @@context.getBean("tasksServices")
  end
end