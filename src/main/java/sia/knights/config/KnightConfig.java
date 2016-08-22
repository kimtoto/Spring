package sia.knights.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import sia.knights.BraveKnight;
import sia.knights.Quest;
import sia.knights.SlayDragonQuest;
import sia.knights.knight;

@Configuration
public class KnightConfig {
	
	@Bean
	public knight knight() {
		return new BraveKnight(quest());
	}
	
	@Bean
	public Quest quest() {
		return new SlayDragonQuest(System.out);
	}

	
}
