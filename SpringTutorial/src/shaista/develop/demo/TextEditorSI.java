package shaista.develop.demo;

public class TextEditorSI {
	private SpellCheckerSI spell;
	
	public void spellCheck(){
		spell.check();
	}

	public SpellCheckerSI getSpell() {
		return spell;
	}

	public void setSpell(SpellCheckerSI spell) { // dependency injection via setter
		System.out.println("i am sad");
		this.spell = spell;
	}
	
}
