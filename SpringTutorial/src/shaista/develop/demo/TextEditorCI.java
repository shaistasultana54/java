package shaista.develop.demo;

public class TextEditorCI {
	private SpellCheckerCI spell;
	
	public void spellCheck(){
		spell.check();
	}

	public TextEditorCI (SpellCheckerCI spell) { // dependency injection via constructor
		System.out.println("i am sad");
		this.spell = spell;
	}
	
}
