package Model;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.Random;

public class Monster extends DungeonCharacter implements Serializable {
    public Monster(String theName) throws SQLException {
        super(theName);
    }

    @Override
    public int attack() {
        Random myRand = new Random();
        boolean myMissHit = myRand.nextInt(101) > getMyChanceToHit() * 100;
        if (myMissHit) {
            return 0;
        } else {
            return myRand.nextInt(getMINIMUM_DAMAGE(), getMyMaximumDamage() + 1);
        }
    }

    public int heal() {
        Random myRand = new Random();
        if (myRand.nextInt(101) < getMyChangesToBlockOrHeal() * 100) {
            return myRand.nextInt(getMINIMUM_HEAL_POINTS(), getMINIMUM_HEAL_POINTS() + 1);
        } else {
            return 0;
        }
    }
}
