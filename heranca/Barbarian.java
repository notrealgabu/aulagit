package heranca;

public class Barbarian extends Personagem {

    public Barbarian (String name, int stamina, double life, IWeapon weapon) {
        super(name, stamina, life, weapon);
    }

    @Override
    public void attack(Personagem personagem) {
        if (this.stamina > 0) {
            this.weapon.damage(personagem);
            this.stamina -= (int) (this.stamina * 0.10);
        }

    }

}
