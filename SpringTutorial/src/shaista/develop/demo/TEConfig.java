package shaista.develop.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TEConfig {
	
	@Bean
	public TextEditorCI textEditor(){
		return new TextEditorCI(spellChecker());
	}
	
	@Bean
	public SpellCheckerCI spellChecker(){
		return new SpellCheckerCI();
	}

}
