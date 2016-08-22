package sia.knights;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/knight.xml");
		knight knight = context.getBean(knight.class);
		knight.embarkOnQuest();
		context.close();
	}
}
